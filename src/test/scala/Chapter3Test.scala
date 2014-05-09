/**
 * Created by colmcavanagh on 5/7/14.
 */


import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import scala.collection.mutable.ArrayBuffer
@RunWith(classOf[JUnitRunner])
class Chapter3Test extends FunSuite {
  //hes was using case classes
  test("test Sort Array pos to neg") {
    val b = ArrayBuffer(1.0,2.0,3.0,-1.0,2.0)
    val c = ArrayBuffer(1.0,2.0,3.0,2.0,-1.0)
    println("Sort Array: " + Chapter3.Chapter3.sortArrayPosToNeg(b))
    assert(Chapter3.Chapter3.sortArrayPosToNeg(b)==c)
  }
  test("test Swap Adjacent") {
    val b = Array(1,2,3,4,5)
    val c = Vector(2,1,4,3,5)
    println("Sort Array: " + Chapter3.Chapter3.swapAdajaentElements(b))
    assert(Chapter3.Chapter3.swapAdajaentElements(b)==c)
  }
}


