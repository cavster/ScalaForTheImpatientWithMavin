package Chapter8



/**
 * Created by colmcavanagh on 5/9/14.
 */


class Point(val x: Int, val y: Int) {
  override def toString = "Point(%d, %d)".format(x, y)
}

abstract class Shape {
  def centerPoint: Point
  override def toString =  "%s(Center: %s)".format(this.getClass.getSimpleName, centerPoint.toString)
}

class Rectanglex(val topLeft: Point, val bottomRight: Point) extends Shape {
  override val centerPoint = new Point((bottomRight.x - topLeft.x) / 2, (bottomRight.y - topLeft.y) / 2)
}

class Circle(override val centerPoint: Point, val radius: Int) extends Shape
