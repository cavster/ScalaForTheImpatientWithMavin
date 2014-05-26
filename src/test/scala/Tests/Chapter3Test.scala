package Tests

/**
 * Created by colmcavanagh on 5/7/14.
 */


import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import Chapter3.Chapter3._
import org.scalatest.BeforeAndAfter


@RunWith(classOf[JUnitRunner])
class Chapter3Test extends FunSuite with BeforeAndAfter{
  test("Fill Array Test")
  {
    println(fillArray(5).mkString(", "))
    assert (fillArray(5).length == 5)
  }//not sure what to test


  test("test Sort Array pos to neg Full Array") {
    val b = Array(1.0,2.0,3.0,-1.0,2.0)
    val c = Array(1.0,2.0,3.0,2.0,-1.0)
    println("Sort Array: " + Chapter3.Chapter3.sortArrayPosToNeg(b))

    assert(Chapter3.Chapter3.sortArrayPosToNeg(b).deep == c.deep)
  }

  test("test Swap  Array of size 2") {
    val b = Array(1,2)
    val c = Array(2,1)
    println("Sort Array: " + Chapter3.Chapter3.swapAdajaentElements(b))

    assert(Chapter3.Chapter3.swapAdajaentElements(b).deep == c.deep)
  }



  test("test Swap Adjacent") {
    val b = Array(1,2,3,4,5)
    val c = Array(2,1,4,3,5)
    println("Sort Array: " + Chapter3.Chapter3.swapAdajaentElements(b))
    println(b.deep.mkString(" "))
    println(c.deep.mkString(" "))
    val d  = Chapter3.Chapter3.swapAdajaentElements(b)//wasnt sure how to do this neater I am tired
    assert(d.deep == c.deep)
  }
  test("test no dubs") {
    val b = Array(1,1,3,4,5)
    val c = Array(1,3,4,5)
    println("Sort Array: " + Chapter3.Chapter3.ArrayNoDups(b))
    println(b.deep.mkString(" "))
    println(c.deep.mkString(" "))
    val d  = Chapter3.Chapter3.ArrayNoDups(b)
    println(d.deep.mkString(" "))
    assert(d.deep == c.deep)
  }
}


