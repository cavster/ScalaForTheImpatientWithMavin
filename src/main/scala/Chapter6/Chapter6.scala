
/**
 * Created by colmcavanagh on 5/5/14.
 */
package Chapter6


object Reverse   {
  def main (args: Array[String]) {
    for (arg <- args.reverse) println(arg)
  }
  Reverse.main(Array("Hi","My","Name"))//works
}
object Conversions{//Q1

  def inchesToCentmeters(inches:Double) = {inches*2.54}
  def gallonsToLiters(gallons:Double) = {gallons*3.78541}
  def milesToKilometers(miles:Double) = {miles*1.60934}

}
//different approch/Q2
abstract class Conversions{
  def convert(theValue:Double):Double
}
object InchesToCentmeters extends Conversions{
  def  convert(theValue:Double):Double = {
    theValue*2.54
  }
}
object GallonsToLiters extends Conversions{
  def  convert(theValue:Double):Double = {
    theValue*3.78541
  }
}
object MilesToKilometers extends Conversions{
  def  convert(theValue:Double):Double = {
    theValue*1.60934
  }
}
//Q3
object Orgin extends java.awt.Point{

}
//  Q4
class Point( x: Int,  y: Int) extends java.awt.Point {
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}



