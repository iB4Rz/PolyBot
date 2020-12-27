import polygons


def main():
    # cordenadas1 = [[1, 4], [5, 5], [5, 2], [3, 3], [3, 1], [9, 6], [7, 0], [0, 0]]
    cordenadas2 = [[1.4, 1.9], [1.7, 2.20]]
    cordenadas1 = [[2, 2.5], [1, 1.5]]
    point = [1.4, 1.9]
    polygon1 = polygons.ConvexPolygon(cordenadas1)
    polygon2 = polygons.ConvexPolygon(cordenadas2)

    print("Contains Point: " + str(polygon1.containsPoint(point)))
    print("Contains Poligon: " + str(polygon1.containsPolygon(polygon2)))
    print("(NumV, NumE): " + str(polygon1.getVerticesEdges()))
    print("Perimeter: " + str(polygon1.getPerimeter()))
    print("Area: " + str(polygon1.getArea()))
    print("Centroid: " + str(polygon1.getCoordCentroid()))
    print("Regular: " + str(polygon1.isRegular()))
    print("Bounding Box: " + str(polygon1.boudingBox()))


if __name__ == "__main__":
    main()
