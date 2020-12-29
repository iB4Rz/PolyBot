from PIL import Image, ImageDraw

RAW = 400
SCALE = 398
RGB = 255
DECIMAL_NUM = 3


class ConvexPolygon:

    coordinates = []
    color = (0, 0, 0)

    def __init__(self, coordinates):
        '''Construct a convex polygon given by
        the coordinates of a set of points'''

        # tengo que normalizar las coord
        coordinates = ConvexPolygon.convexHull(coordinates)
        self.color = (0, 0, 0)
        self.coordinates = coordinates

    def containsPoint(self, point):
        '''Check whether a point is inside
        another convex polygon'''

        n = len(self.coordinates)
        # empty
        if n == 0:
            return False
        # monogon
        if n == 1:
            return self.coordinates[0] == point

        A, B, C = [], [], []

        for i in range(n):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % n]

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

        return all(self.containsPoint(point) for point in polygon.coordinates)

    def getVerticesEdges(self):
        '''Get the number of vertices
        and edges of a convex polygon'''

        return len(self.coordinates)

    def getPerimeter(self):
        '''Get the length of the perimeter of
        a convex polygon'''

        length = 0
        for i in range(len(self.coordinates)):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % len(self.coordinates)]
            length += ConvexPolygon.distance(c1, c2)
        return round(length, DECIMAL_NUM)

    def getArea(self):
        ''' Get the area of a convex polygon'''

        n = len(self.coordinates)
        sum1, sum2 = 0, 0
        for i in range(n):
            index = (i + 1) % n
            prod = self.coordinates[i][0] * self.coordinates[index][1]
            sum1 += prod

        for i in range(n):
            index = (i + 1) % n
            prod = self.coordinates[index][0] * self.coordinates[i][1]
            sum2 += prod

        return round(abs(sum1 - sum2) / 2, DECIMAL_NUM)

    def getCoordCentroid(self):
        '''Get the coordinates of the centroid of
        a convex polygon'''

        n = len(self.coordinates)
        # empty
        if n == 0:
            return []
        # monogon
        if n == 1:
            return self.coordinates[0]
        # digon
        if n == 2:
            c1 = self.coordinates[0]
            c2 = self.coordinates[1]
            c1[0] = round(float(c1[0] + c2[0]) / 2, DECIMAL_NUM)
            c1[1] = round(float(c1[1] + c2[1]) / 2, DECIMAL_NUM)
            return c1

        centroid = [0, 0]
        det = 0
        for i in range(n):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % n]

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
        for i in range(len(self.coordinates)):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % len(self.coordinates)]
            if i != 0:
                if dist != ConvexPolygon.distance(c1, c2):
                    return False
            dist = ConvexPolygon.distance(c1, c2)
        return True

    def intersection(self, polygon):
        '''Compute the intersection of two convex polygons
        (it is actually the union function)'''

        return self.union(polygon)

    def union(self, polygon):
        '''Compute the convex union of two convex polygons'''

        union = self.coordinates + polygon.coordinates
        return ConvexPolygon.convexHull(union)

    def boundingBox(self):
        '''Compute the bounding box of a convex polygon'''

        # empty
        if len(self.coordinates) == 0:
            return []

        x, y = zip(*self.coordinates)
        x_min = min(x)
        x_max = max(x)
        y_min = min(y)
        y_max = max(y)
        return [(x_min, y_min), (x_min, y_max), (x_max, y_max), (x_max, y_min)]

    def isEqual(self, polygon):
        '''Check if two convex polygons are equals'''

        return self.coordinates == polygon.coordinates

    def draw(polygons):
        '''Draw convex polygons (with colors)
        in a PNG image'''

        image = Image.new('RGB', (RAW, RAW), color=(255, 255, 255))
        draw = ImageDraw.Draw(image)
        for i in polygons:
            polygon = tuple([(SCALE * x[0], SCALE - (SCALE * x[1]))
                            for x in i.coordinates])
            draw.polygon(polygon, outline=i.color)
        image.save("image.png")

    def addColor(self, color):
        ''' Add color to a convex polygon'''

        colorRGB = tuple([RGB * x for x in color])
        self.color = colorRGB

    @staticmethod
    def convexHull(coordinates):
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
                direction = ConvexPolygon.getOrientation(coord, far_coord, c2)
                if direction > 0:
                    far_coord = c2

            hull.append(far_coord)
            coord = far_coord
        hull.reverse()
        return hull[:-1]

    @staticmethod
    def getOrientation(origin, c1, c2):
        '''Get the direction from a origin point
        to two other points'''

        p1 = [c2[0] - origin[0], c2[1] - origin[1]]
        p2 = [c1[0] - origin[0], c1[1] - origin[1]]
        return p1[0] * p2[1] - p2[0] * p1[1]

    @staticmethod
    def distance(c1, c2):
        '''Distance between two points'''

        xd = c1[0] - c2[0]
        yd = c1[1] - c2[1]
        return (xd ** 2 + yd ** 2) ** 0.5
