import polygons


def main():
    cordenadas1 = [(0.1, 0.4), (0.5, 0.5), (0.5, 0.2), (0.3, 0.3), (0.3, 0.1), (0.9, 0.6), (0.7, 0), (0, 0)]
    cordenadas2 = [(0.3, 0.3), (0.3, 0.1), (0.5, 0.2)]
    # cordenadas1 = [[2, 2.5], [1, 1.5]]
    cordenadas3 = [(0.4, 0.2), (0.5, 0.4), (0.7, 0.4), (1, 0.1)]
    point = (0.14, 0.19)
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

    polygones = []
    polygones.append(polygon1)
    polygones.append(polygon3)
    colors = [(1, 0, 0), (0, 1, 0)]
    polygons.ConvexPolygon.draw(colors, polygones)

if __name__ == "__main__":
    main()
