import polygons


def main():
    cordenadas1 = [[1, 4], [5, 5], [5, 2], [3, 3], [3, 1], [9, 6], [7, 0], [0, 0]]
    cordenadas2 = [[3, 3], [5, 2], [3, 1]]
    polygon1 = polygons.ConvexPolygon(cordenadas1)
    polygon2 = polygons.ConvexPolygon(cordenadas2)

    print(polygon1.getVerticesEdges())

    print("Perimeter: " + str(polygon1.getPerimeter()))
    print("Area: " + str(polygon1.getArea()))
    print("Centroid: " + str(polygon1.getCoordCentroid()))

if __name__ == "__main__":
    main()
