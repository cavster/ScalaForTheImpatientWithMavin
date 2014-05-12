
/**
 * Created by colmcavanagh on 5/5/14.
 */
package Chapter6


object Reverse   {
  def main (args: Array[String]) {
//  println(args.reverse.mkString("hi are you "))
  }
  println("Hello World")
}
object Conversions{//Q1

  def inchesToCentmeters(inches:Double) = {inches*2.54}
  def gallonsToLiters(gallons:Double) = {gallons*3.78541}
  def milesToKilometers(miles:Double) = {miles*1.60934}

}
//different approch/Q2
abstract class Conversions{
  def Convert(theValue:Double):Double
}
object InchesToCentmeters extends Conversions{
  def  Convert(theValue:Double):Double = {
    theValue*2.54
  }
}
object GallonsToLiters extends Conversions{
  def  Convert(theValue:Double):Double = {
    theValue*3.78541
  }
}
object MilesToKilometers extends Conversions{
  def  Convert(theValue:Double):Double = {
    theValue*1.60934
  }
}
//Q3
object Orgin extends java.awt.Point{


}
//  Q4
class Point(var x: Int, var y: Int) {
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}



