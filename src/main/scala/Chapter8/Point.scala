package Chapter8

/**
 * Created by colmcavanagh on 5/5/14.
 */
//Q5
abstract class Pointx(val x:Double , val y:Double)
class LabledPoint(val lableValue:String, x:Double , y:Double) extends Pointx(x , y){//dont need the var or def in superclasses for subclasses
//note use of override keyword if class is not abstract
  //note need val var for get/set etc
  //ask cary about that?
}
object PointObject extends App {
  val  test = new LabledPoint("Black Thursday", 1929 , 230.07)
  println(test.x)
  println(test.lableValue)
}

