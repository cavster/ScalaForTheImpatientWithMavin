package Tests

/**
 * Created by colmcavanagh on 5/12/14.
 */



import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Chapter12.Chapter12Q10
import Chapter12._


@RunWith(classOf[JUnitRunner])
class Chapter12Test extends FunSuite {

  test("Factorial") {
    assert(Chapter12.factorial(5) == 120)
  }
  test("Factorial2") {
    assert(Chapter12.Factorial2(5) == 120)
  }
  test("Largest") {
    assert(Chapter12.largest(x => 10 * x - x * x, 1 to 10) == 25)
  }

  test("Get Max") {
    val a = Array(1, 2, 3, 4, 5)
    assert(Chapter12.getMax(a) == 5)
  }
  //
  test("Pair with currying"){
    val x = Chapter12.adjustToPair(_ * _)((6, 7))
    assert(x == 42)

  }
  test("Pair") {
    val pairs = (1 to 10) zip (11 to 20)
  val answer = pairs.map(Chapter12.adjustToPair(_ + _))
  println(answer)
 }
  test("Test Cooresponds"){
    val o = Array("Hello", "Everyone", "Maddness", "!")
    val p = o.map(_.length)

    println(o.mkString(", "))
    println(p.mkString(", "))

    val y = Chapter12.Corresponding(o, p)
    println(y)
  }
  test("Largest2"){
    println(Chapter12.largestTwo(x => 10 * x - x * x, 1 to 10))

  }

  test("Values"){

      println(Chapter12.values(x => x * x , -8 , 5))//pass in the fun its self

    }


}
