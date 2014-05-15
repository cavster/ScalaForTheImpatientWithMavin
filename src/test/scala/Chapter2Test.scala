/**
 * Created by colmcavanagh on 5/7/14.
 */


import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import Chapter2.Chapter2._
@RunWith(classOf[JUnitRunner])
class Chapter2Test extends FunSuite {
//hes was using case classes
 test("test signum") {
    println("signum(1): " + getSignum(1))
    assert(getSignum(1)== 1)
    println("signum(0): " + getSignum(0))
    assert(getSignum(0) == 0)
    println("signum(-1): " + getSignum(-1))
    assert(getSignum(-1) == -1)
    println("signum(-123): " + getSignum(-123))
    assert(getSignum(-123) == -1)
    println("signum(123): " + getSignum(123))
    assert(getSignum(123) == 1)
  }
  test("test recUnicodeProductLoop") {
    println("""unicodeProductLoop("Hello"): """ + recUnicodeProduct("Hello"))
    assert(recUnicodeProduct("Hello") == 9415087488L)
  }
  test("test unicodeProductLoop") {
    println("""unicodeProductLoop("Hello"): """ + unicodeProductLoop("Hello"))
    assert(unicodeProductLoop("Hello") == 9415087488L)
  }
  test("test unicodeProductNoLoop") {
    println("""unicodeProductNoLoop("Hello"): """ + unicodeProductNoLoop("Hello"))
    assert(unicodeProductNoLoop("Hello") == 9415087488L)
  }
  test("test unicodeProductRecursion") {
    println("""unicodeProductRecursion("Hello"): """ + recUnicodeProductRecursive("Hello"))
    assert(recUnicodeProductRecursive("Hello") == 9415087488L)
  }
  test("test Power") {
    println("""Power(2, 2): """ + power(2, 2))
    assert(power(2, 2) == 4.0)
    println("""Power(10, 2): """ + power(10, 2))
    assert(power(10, 2) == 100.0)
    println("""Power(2, 0): """ + power(2, 0))
    assert(power(2, 0) == 1.0)
    println("""Power(2, 1): """ + power(2, 1))
    assert(power(2, 1) == 2.0)
    println("""Power(2, -4): """ + power(2, -4))
    assert(power(2, -4) == 0.0625)
  }
}

