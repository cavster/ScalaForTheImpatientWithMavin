package Chapter10

/**
 * Created by colmcavanagh on 5/6/14.
 */
import java.awt.Point
import scala.math.Ordered
//got this one online 2
object MainQ2 extends  App{
  class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
    def compare(that: Point) = {
      if (x < that.x || (x == that.x && y < that.y))
        -1
      else if (x > that.x || (x == that.x && y > that.y))
        1
      else
        0
    }
  }

  val op1 = new OrderedPoint(5, 10)
  val op2 = new OrderedPoint(10, 5)

  println (op1 < op2)
  println(op2 < op1)
}

