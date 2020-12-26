class ConvexPolygon:

    coordinates = []

    # Construct a convex polygon given by the coordinates of a set of points
    def __init__(self, coordinates):
        coordinates = ConvexPolygon.convexHull(coordinates)
        self.coordinates = coordinates

    # Check whether a point is inside another convex polygon
    def containsPoint(self, point):
        A, B, C = [], [], []

        for i in range(len(self.coordinates)):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % len(self.coordinates)]

            # calculate A, B and C
            a = -(c2[1] - c1[1])
            b = c2[0] - c1[0]
            c = -(a * c1[0] + b * c1[1])

            A.append(a)
            B.append(b)
            C.append(c)

        D = []
        for i in range(len(A)):
            d = A[i] * point[0] + B[i] * point[1] + C[i]
            D.append(d)

        p1 = all(d >= 0 for d in D)
        p2 = all(d <= 0 for d in D)
        return p1 or p2

    # Check whether a convex polygon is inside another convex polygon
    def containsPolygon(self, polygon):
        return all(self.containsPoint(point) for point in polygon.coordinates)

    # Get the number of vertices and edges of a convex polygon
    def getVerticesEdges(self):
        n = len(self.coordinates)
        # empty polygon
        if n == 0:
            return 0, 0
        # monogon
        elif n == 1:
            return 1, 0
        # digon
        elif n == 2:
            return 2, 1
        else:
            return n, n

    # Get the length of the perimeter of a convex polygon
    def getPerimeter(self):
        length = 0
        for i in range(len(self.coordinates)):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % len(self.coordinates)]
            length += ConvexPolygon.distance(c1, c2)
        return round(length, 3)

    # Get the area of a convex polygon
    def getArea(self):
        psum, nsum = 0, 0
        for i in range(len(self.coordinates)):
            sindex = (i + 1) % len(self.coordinates)
            prod = self.coordinates[i][0] * self.coordinates[sindex][1]
            psum += prod

        for i in range(len(self.coordinates)):
            sindex = (i + 1) % len(self.coordinates)
            prod = self.coordinates[sindex][0] * self.coordinates[i][1]
            nsum += prod

        return round(abs(psum - nsum) / 2, 3)

    # Get the coordinates of the centroid of a convex polygon
    def getCoordCentroid(self):
        centroid = [0, 0]
        det = 0
        for i in range(len(self.coordinates)):
            c1 = self.coordinates[i]
            c2 = self.coordinates[(i + 1) % len(self.coordinates)]

            # compute the determinant
            tempDet = c1[0] * c2[1] - c2[0] * c1[1]
            det += tempDet

            centroid[0] += (c1[0] + c2[0]) * tempDet
            centroid[1] += (c1[1] + c2[1]) * tempDet

        # divide by the total mass of the polygon
        centroid = map(lambda x: round(x / float(3 * det), 3), centroid)
        return centroid

    # Check if a convex polygon is regular
    def isRegular(self, polygon):
        print(polygon)

    # Compute the intersection of two convex polygons
    def intersection(self, polygon1, polygon2):
        print(polygon1)

    # Compute the convex union of two convex polygons
    def union(self, polygon1, polygon2):
        print(polygon1)

    # Compute the bounding box of a convex polygon
    def boudingBox(self, polygon):
        print(polygon)

    # Draw convex polygons (with colors) in a PNG image
    def draw(self, polygons):
        print(polygons)

    def printTest(self):
        for i in self.coordinates:
            print(i)

    # Compute the convex hull given a set of coordinates
    @staticmethod
    def convexHull(coordinates):
        # empty, monogon and digon polygons skip
        if len(coordinates) < 2:
            return sorted(coordinates)

        # get leftmost coordinate
        start = min(coordinates)
        coord = start
        hull = []
        hull.append(start)

        farCoord = None
        while farCoord is not start:
            c1 = None
            for c in coordinates:
                if c is coord:
                    continue
                c1 = c
                break
            farCoord = c1

            for c2 in coordinates:
                # do not compare to self or pivot point
                if c2 is coord or c2 is c1:
                    continue
                direction = ConvexPolygon.getOrientation(coord, farCoord, c2)
                if direction > 0:
                    farCoord = c2

            hull.append(farCoord)
            coord = farCoord
        hull.reverse()
        return hull[:-1]

    @staticmethod
    def getOrientation(origin, c1, c2):
        p1 = [c2[0] - origin[0], c2[1] - origin[1]]
        p2 = [c1[0] - origin[0], c1[1] - origin[1]]
        return p1[0] * p2[1] - p2[0] * p1[1]

    @staticmethod
    def distance(c1, c2):
        xd = c1[0] - c2[0]
        yd = c1[1] - c2[1]
        return (xd ** 2 + yd ** 2) ** 0.5
