
/**
 * Created by colmcavanagh on 5/5/14.
 */
package Chapter6

object Chapter6 extends App {

  println(Conversions.inchesToCentmeters(556))
  println(Conversions.gallonsToLiters(4345))
  println(Conversions.milesToKilometers(20))
  println(MilesToKilometers.Convert(50))
  println(GallonsToLiters.Convert(55))
  println(MilesToKilometers.Convert(46))
  println(Point(5,6))
 // println(args.reverse.mkString("Hello World"))
}

object Reverse  {

  //println(args.reverse.mkString("hi are you "))
  println("Hello World")
}
object Conversions{//Q1

  def inchesToCentmeters(inches:Double)={inches*2.54}
  def gallonsToLiters(gallons:Double)={gallons*3.78541}
  def milesToKilometers(miles:Double)={miles*1.60934}

}
//different approch/Q2
abstract class Conversions{
  def Convert(theValue:Double):Double
}
object InchesToCentmeters extends Conversions{
  def  Convert(theValue:Double):Double={
    theValue*2.54
  }
}
object GallonsToLiters extends Conversions{
  def  Convert(theValue:Double):Double={
    theValue*3.78541
  }
}
object MilesToKilometers extends Conversions{
  def  Convert(theValue:Double):Double={
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



