package Tests



import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Chapter10._
import Chapter10.MainQ2._
import sfi.examples.Chapter10.Main.RectangleLike

@RunWith(classOf[JUnitRunner])
class Chapter10Test extends FunSuite {

    test("Order By"){
    val op1 = new OrderedPoint(5, 10)
    val op2 = new OrderedPoint(10, 5)
    assert(op1<op2)
  }
  test("Rectangle Like"){
    val egg = new
        java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, -10)
    egg.grow(10, 20)

    println(egg.getX())
    println(egg.getY())
    println(egg.getWidth())
    println(egg.getHeight())

  }


}
