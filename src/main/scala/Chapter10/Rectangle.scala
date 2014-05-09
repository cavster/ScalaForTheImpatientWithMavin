package sfi.examples.Chapter10

/**
 * Created by colmcavanagh on 5/6/14.
 */
object Main {
  trait RectangleLike extends java.awt.geom.Ellipse2D.Double {

    def translate(x: Int, y: Int) {
      this.x += x
      this.y += y
    }

    def grow(width: Int, height: Int) {
      this.width += width
      this.height += height
    }
  }

  val egg = new
      java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  egg.translate(10, -10)
  egg.grow(10, 20)

  println(egg.getX())
  println(egg.getY())
  println(egg.getWidth())
  println(egg.getHeight())
}