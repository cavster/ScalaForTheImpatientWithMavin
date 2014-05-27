package Tests



import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Chapter10._
import Chapter10.MainQ2._

@RunWith(classOf[JUnitRunner])
class Chapter10Test extends FunSuite {

    test("Order By"){
    val op1 = new OrderedPoint(5, 10)
    val op2 = new OrderedPoint(10, 5)
    assert(op1<op2)
  }


}
