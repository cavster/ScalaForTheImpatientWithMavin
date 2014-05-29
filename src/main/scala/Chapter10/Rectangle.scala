package sfi.examples.Chapter10

/**
 * Created by colmcavanagh on 5/6/14.
 */
object Main {
  //Q1
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

}