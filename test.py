import polygons


def main():
    cordenadas1 = [[1, 4], [5, 5], [5, 2], [3, 3], [3, 1], [9, 6], [7, 0], [0, 0]]
    cordenadas2 = [[3, 3], [3, 1], [5, 2]]
    # cordenadas1 = [[2, 2.5], [1, 1.5]]
    cordenadas3 = [[4, 2], [5, 4], [7, 4], [10, -1]]
    point = [1.4, 1.9]
    polygon1 = polygons.ConvexPolygon(cordenadas1)
    polygon2 = polygons.ConvexPolygon(cordenadas2)
    polygon3 = polygons.ConvexPolygon(cordenadas3)

    print("Contains Point: " + str(polygon1.containsPoint(point)))
    print("Contains Poligon: " + str(polygon1.containsPolygon(polygon2)))
    print("(NumV, NumE): " + str(polygon1.getVerticesEdges()))
    print("Perimeter: " + str(polygon1.getPerimeter()))
    print("Area: " + str(polygon1.getArea()))
    print("Centroid: " + str(polygon1.getCoordCentroid()))
    print("Regular: " + str(polygon1.isRegular()))
    print("Bounding Box: " + str(polygon1.boudingBox()))
    print("Convex union: " + str(polygon1.union(polygon3)))
    print("Intersection: " + str(polygon1.intersection(polygon3)))


if __name__ == "__main__":
    main()
