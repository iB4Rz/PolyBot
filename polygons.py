from PIL import Image, ImageDraw

PIXELS = 400           # Image size in pixels
SCALE = 398            # Image pixel fit
RGB = 255
DECIMAL_NUM = 3


class ConvexPolygon:

    __coordinates = []
    __color = (0, 0, 0)
    __paint = False

    def __init__(self, coordinates):
        '''Construct a convex polygon given by
        the coordinates of a set of points'''

        coordinates = ConvexPolygon.__convexHull(coordinates)
        self.__color = (0, 0, 0)
        self.__paint = False
        self.__coordinates = coordinates

    def getCoordinates(self):
        ''' Get the coordinates of the polygon '''

        return self.__coordinates

    def addColor(self, color):
        ''' Add color to a convex polygon'''

        colorRGB = tuple([int(RGB * x) for x in color])
        self.__color = colorRGB

    def setPaint(self, paint):
        ''' Set the color fill of the polygon '''

        self.__paint = paint

    def containsPoint(self, point):
        '''Check whether a point is inside
        another convex polygon'''

        n = len(self.__coordinates)
        # empty
        if n == 0:
            return False
        # monogon
        if n == 1:
            return self.__coordinates[0] == point

        A, B, C = [], [], []

        for i in range(n):
            c1 = self.__coordinates[i]
            c2 = self.__coordinates[(i + 1) % n]

            # A, B and C computation
            a = -(c2[1] - c1[1])
            b = c2[0] - c1[0]
            c = -(a * c1[0] + b * c1[1])

            A.append(a)
            B.append(b)
            C.append(c)

        # D computation
        D = []
        for i in range(len(A)):
            d = A[i] * point[0] + B[i] * point[1] + C[i]
            D.append(d)

        p1 = all(d >= 0 for d in D)
        p2 = all(d <= 0 for d in D)
        return p1 or p2

    def containsPolygon(self, polygon):
        '''Check whether a convex polygon is
        inside another convex polygon '''

        ret = all(polygon.containsPoint(point) for point in self.__coordinates)
        return ret

    def getVerticesEdges(self):
        '''Get the number of vertices
        and edges of a convex polygon'''

        return len(self.__coordinates)

    def getPerimeter(self):
        '''Get the length of the perimeter of
        a convex polygon'''

        length = 0
        for i in range(len(self.__coordinates)):
            c1 = self.__coordinates[i]
            c2 = self.__coordinates[(i + 1) % len(self.__coordinates)]
            length += ConvexPolygon.__distance(c1, c2)
        return round(length, DECIMAL_NUM)

    def getArea(self):
        ''' Get the area of a convex polygon'''

        n = len(self.__coordinates)
        sum1, sum2 = 0, 0
        for i in range(n):
            index = (i + 1) % n
            prod = self.__coordinates[i][0] * self.__coordinates[index][1]
            sum1 += prod

        for i in range(n):
            index = (i + 1) % n
            prod = self.__coordinates[index][0] * self.__coordinates[i][1]
            sum2 += prod

        return round(abs(sum1 - sum2) / 2, DECIMAL_NUM)

    def getCoordCentroid(self):
        '''Get the coordinates of the centroid of
        a convex polygon'''

        n = len(self.__coordinates)
        # empty
        if n == 0:
            return []
        # monogon
        if n == 1:
            return self.__coordinates[0]
        # digon
        if n == 2:
            c1 = self.__coordinates[0]
            c2 = self.__coordinates[1]
            c1[0] = round(float(c1[0] + c2[0]) / 2, DECIMAL_NUM)
            c1[1] = round(float(c1[1] + c2[1]) / 2, DECIMAL_NUM)
            return c1

        centroid = [0, 0]
        det = 0
        for i in range(n):
            c1 = self.__coordinates[i]
            c2 = self.__coordinates[(i + 1) % n]

            # calculate the determinant
            det_aux = c1[0] * c2[1] - c2[0] * c1[1]
            det += det_aux

            centroid[0] += (c1[0] + c2[0]) * det_aux
            centroid[1] += (c1[1] + c2[1]) * det_aux

        centroid[0] = round(centroid[0] / (3 * det), DECIMAL_NUM)
        centroid[1] = round(centroid[1] / (3 * det), DECIMAL_NUM)
        return tuple(centroid)

    def isRegular(self):
        '''Check if a convex polygon is regular'''

        dist = 0
        for i in range(len(self.__coordinates)):
            c1 = self.__coordinates[i]
            c2 = self.__coordinates[(i + 1) % len(self.__coordinates)]
            if i != 0:
                if dist != ConvexPolygon.__distance(c1, c2):
                    return False
            dist = ConvexPolygon.__distance(c1, c2)
        return True

    def intersection(self, polygon):
        '''Compute the intersection of two convex polygons
        (it is actually the union function)'''

        return self.union(polygon)

    def union(self, polygon):
        '''Compute the convex union of two convex polygons'''

        union = self.__coordinates + polygon.__coordinates
        return ConvexPolygon.__convexHull(union)

    def boundingBox(self):
        '''Compute the bounding box of a convex polygon'''

        # empty
        if len(self.__coordinates) == 0:
            return []

        x, y = zip(*self.__coordinates)
        x_min = min(x)
        x_max = max(x)
        y_min = min(y)
        y_max = max(y)
        return [(x_min, y_min), (x_min, y_max), (x_max, y_max), (x_max, y_min)]

    def isEqual(self, polygon):
        '''Check if two convex polygons are equals'''

        return (self.__coordinates == polygon.__coordinates and
                self.__color == polygon.__color)

    def draw(polygons, nameImg):
        '''Draw convex polygons (with colors)
        in a PNG image'''

        image = Image.new('RGB', (PIXELS, PIXELS), color=(255, 255, 255))
        draw = ImageDraw.Draw(image)

        maxX, minX, maxY, minY = ConvexPolygon.__minMax(polygons)
        scale = max(maxX - minX, maxY - minY)
        for i in polygons:
            polygon = []
            for p in i.__coordinates:
                px = p[0] - (maxX + minX) / 2
                py = p[1] - (maxY + minY) / 2
                px /= scale
                py /= scale
                px += 0.5
                py += 0.5
                px *= SCALE
                py = SCALE - py*SCALE
                polygon.append((px, py))
            if i.__paint:
                draw.polygon(polygon, fill=i.__color)
            else:
                draw.polygon(polygon, outline=i.__color)
        image.save(nameImg)

    @staticmethod
    def __convexHull(coordinates):
        '''Compute the convex hull given a set of coordinates'''

        # empty and monogon skip
        if len(coordinates) < 2:
            return coordinates

        # get leftmost coordinate
        start = min(coordinates)
        coord = start
        hull = []
        hull.append(start)

        far_coord = None
        while far_coord is not start:
            c1 = None
            for c in coordinates:
                if c is coord:
                    continue
                c1 = c
                break
            far_coord = c1

            for c2 in coordinates:
                if c2 is coord or c2 is c1:
                    continue
                direct = ConvexPolygon.__getOrientation(coord, far_coord, c2)
                if direct > 0:
                    far_coord = c2

            hull.append(far_coord)
            coord = far_coord
        hull.reverse()
        return hull[:-1]

    @staticmethod
    def __getOrientation(origin, c1, c2):
        '''Get the direction from a origin point
        to two other points'''

        p1 = [c2[0] - origin[0], c2[1] - origin[1]]
        p2 = [c1[0] - origin[0], c1[1] - origin[1]]
        return p1[0] * p2[1] - p2[0] * p1[1]

    @staticmethod
    def __distance(c1, c2):
        '''Distance between two points'''

        xd = c1[0] - c2[0]
        yd = c1[1] - c2[1]
        return (xd ** 2 + yd ** 2) ** 0.5

    @staticmethod
    def __minMax(polygons):
        '''Get the minimum x,y and the maximum x,y
        of a set of polygons'''

        vectors = []
        for i in polygons:
            vectors += i.__coordinates
        pol1 = ConvexPolygon(vectors)
        boundingBx = pol1.boundingBox()
        maxX = boundingBx[3][0]
        maxY = boundingBx[1][1]
        minX = boundingBx[1][0]
        minY = boundingBx[3][1]
        return maxX, minX, maxY, minY
