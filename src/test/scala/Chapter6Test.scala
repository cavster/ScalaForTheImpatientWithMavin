/**
 * Created by colmcavanagh on 5/9/14.
 */

import com.sun.jdi.Value
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import Chapter6._
import Chapter6Q6._
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

}

