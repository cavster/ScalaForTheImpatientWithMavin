package Tests

/**
 * Created by colmcavanagh on 5/9/14.
 */
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import scala.collection.mutable
import Chapter4.Chapter4._

@RunWith(classOf[JUnitRunner])
class Chapter4Test extends FunSuite{
  test("test getDiscount") {
    val items: mutable.Map[String, Double]   = mutable.Map("phone" -> 100.5, "Iphone" -> 4000, "Colm" -> 6045)
    val newItems: mutable.Map[String,Double] = mutable.Map("Colm" -> 5440.5, "Iphone" -> 3600.0, "phone" -> 90.45);
    println("ReturnedMap: " + computeDiscountItems(items))
    assert(computeDiscountItems(items) == newItems)
  }
  test("test MinMax"){
    val testArray:Array[Int]  = Array(1,1,2,3,4,5)
    val returnedNumbers =(1,5)
    println("ReturnedArray: " + minmax(testArray))
    assert(minmax(testArray) == returnedNumbers)
  }/*
  test("test lteqgt"){
    val testArray:Array[Int]  = Array(1,1,2,3,4,5)
    val returnedTuple =Tuple3(3,2,1)
    println("ReturnedTuple " + lteqgt(testArray,3))
    assert(lteqgt(testArray,3) == returnedTuple)
  }*/
}

