package Tests

/**
 * Created by colmcavanagh on 5/9/14.
 */

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import Chapter6._
import Chapter6.Chapter6Q6.PlayingCardSuit
import Chapter6.Chapter6Q6.PlayingCardSuit.PlayingCardSuit
import Chapter6._

//import Chapter6Q6._
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Chapter6Test extends FunSuite {

  test("test Conversion inchesToCentmeters") {
    assert(Conversions.inchesToCentmeters(556) == 1412.24)
  }
  test("test Conversion gallonsToLitres") {
    assert(Conversions.gallonsToLiters(4345) == 16447.60645)//use double equals!
  }

  test("test Conversion MilesToKilometers"){
    assert (Conversions.milesToKilometers(20) == 32.1868)
}
  test("test Point"){
    val Point = Pointx(3,6)//no new
    assert (Point.isInstanceOf[Point])
  }
  test("test Question 7"){

     PlayingCardSuit.isRed(PlayingCardSuit.Club)

  }
   test("Test Revese"){//wasnt sure how to test this one
     println(Reverse.main(Array("Hi","My","Name")))

   }

}

