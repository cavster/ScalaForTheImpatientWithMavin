package Tests

/**
 * Created by colmcavanagh on 5/10/14.
 */
import Chapter14._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import scala.math._
import scala.Some


@RunWith(classOf[JUnitRunner])
class Chapter14Test extends FunSuite {

  test("swap") {
    assert(Chapter14.swap(1, 2) ==(2, 1))
  }
  test("Question 5 eval"){
    val y = List(List(3, 8),List(2), List(5))
    assert(Chapter14.leafSumQ5(y) == 18)
  }
  test("swap Array") {
    val testArray: Array[Int] = Array(1, 2, 3)
    val returnedTestArray: Array[Int] = Array(2, 1, 3)
    assert(Chapter14.swapArray(testArray).deep == returnedTestArray.deep)
    //.deep for the arrys
  }
  test("Leaf sum ordinary"){
    val x = List(List(3, 8), 2, List(5))
    println(Chapter14.leafSum(x))
    assert(Chapter14.leafSum(x) == 18)
  }
  test("leafSum") {
    val r = Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5)))
    assert(Chapter14.eval(r) == 21)
  }
  test("Combose") {
    def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None
    def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
    val goo = Chapter14.compose(f, g)
    println(goo.toString())
  }
  test("Test Q9"){
    val x =  Chapter14.list
    println(x.map(_.getOrElse(0)).sum)
  }
  test("items and bundles") {
    //Im skipping this test//import packages at top of classes
    val ItemsOfIntrest =new Bundle ("Father's day special", 20.0,
      Multiple (1, Article ("Scala for the Impatient", 39.95) ),
      Bundle ("Anchor Distillery Sampler", 10.0,
        Multiple (15,Article("Old Potrero Straight Rye Whiskey", 79.95)),
        Article ("Junípero Gin", 32.95)
      )
    )
    println(ItemsOfIntrest)

  }

}
