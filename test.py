import polygons


def main():
    # cordenadas1 = [[1, 4], [5, 5], [5, 2], [3, 3], [3, 1], [9, 6], [7, 0], [0, 0]]
    # cordenadas2 = [[3, 3], [5, 2], [3, 1]]
    cordenadas1 = [[1, 4], [9, 6]]
    cordenadas2 = [[13, 7]]
    polygon1 = polygons.ConvexPolygon(cordenadas1)
    polygon2 = polygons.ConvexPolygon(cordenadas2)
    point = [5, 5]

    if polygon1.containsPoint(point):
        print(True)
    else:
        print(False)

    print(polygon1.getVerticesEdges())


if __name__ == "__main__":
    main()
