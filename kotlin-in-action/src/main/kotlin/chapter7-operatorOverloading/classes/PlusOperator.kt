package `chapter7-operatorOverloading`.classes

import `chapter7-operatorOverloading`.model.Point

/*
    operator keyword indicates you need to override plus operation.
    and we can call p1+p2 on the two objects.
 */
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}