import polygons


def main():
    cordenadas1 = [(0.1, 0.4), (0.5, 0.5), (0.5, 0.2), (0.3, 0.3), (0.3, 0.1), (0.9, 0.6), (0.7, 0), (0, 0)]
    cordenadas2 = [(0.3, 0.3), (0.3, 0.1), (0.5, 0.2)]
    # cordenadas1 = [[2, 2.5], [1, 1.5]]
    cordenadas3 = [(0.4, 0.2), (0.5, 0.4), (0.7, 0.4), (1, 0.1)]
    point = (0.8, 0.2)
    p1 = polygons.ConvexPolygon([(0, 0), (0, 1), (1, 1), (0.2, 0.8)])
    p2= polygons.ConvexPolygon([(0, 0), (1, 0), (1, 1)])
    polygon1 = polygons.ConvexPolygon(cordenadas1)
    polygon2 = polygons.ConvexPolygon(cordenadas2)
    polygon3 = polygons.ConvexPolygon(cordenadas3)

    print("Contains Point: " + str(p2.containsPoint(point)))
    print("Contains Poligon: " + str(p1.containsPolygon(p2)))
    print("(NumV, NumE): " + str(p1.getVerticesEdges()))
    print("Perimeter: " + str(p1.getPerimeter()))
    print("Area: " + str(p1.getArea()))
    print("Centroid: " + str(p1.getCoordCentroid()))
    print("Regular: " + str(p1.isRegular()))
    print("Bounding Box: " + str(p1.boudingBox()))
    print("Convex union: " + str(p1.union(p2)))
    print("Intersection: " + str(p1.intersection(p2)))

    polygones = []
    polygones.append(p1)
    polygones.append(p2)
    colors = [(1, 0, 0), (0, 1, 0)]
    polygons.ConvexPolygon.draw(colors, polygones)

if __name__ == "__main__":
    main()
