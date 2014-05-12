/**
 * Created by colmcavanagh on 5/9/14.
 */
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import scala.collection.mutable.{Map, ArrayBuffer}
//import Chapter4._

@RunWith(classOf[JUnitRunner])
class Chapter4Test extends FunSuite{
  test("test getDiscount") {
    val items: Map[String, Double]   = Map("phone" -> 100.5, "Iphone" -> 4000, "Colm" -> 6045)
    val newItems: Map[String,Double] = Map("Colm" -> 5440.5, "Iphone" -> 3600.0, "phone" -> 90.45);
    println("ReturnedMap: " + Chapter4.Chapter4.computeDiscountItems(items))
    assert(Chapter4.Chapter4.computeDiscountItems(items)==newItems)
  }
  test("test MinMax"){
    val testArray:Array[Int]  = Array(1,1,2,3,4,5)
    val returnedTuple =Tuple2(1,5)
    println("ReturnedArray: " + Chapter4.Chapter4.minmax(testArray))
    assert(Chapter4.Chapter4.minmax(testArray)==returnedTuple)
  }
  test("test lteggt"){
    val testArray:Array[Int]  = Array(1,1,2,3,4,5)
    val p =3
    val returnedTuple =Tuple3(3,2,1)
    println("ReturnedTuple " + Chapter4.Chapter4.lteggt(testArray,3))
    assert(Chapter4.Chapter4.lteggt(testArray,3)==returnedTuple)
  }
}

