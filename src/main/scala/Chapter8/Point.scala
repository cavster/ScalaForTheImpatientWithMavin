package Chapter8

/**
 * Created by colmcavanagh on 5/5/14.
 */
class Point(val x:Double , val y:Double)
class LabledPoint(val lableValue:String,override val x:Double ,override val y:Double) extends Point(x , y){//dont need the var or def in superclasses for subclasses
//note use of override keyword if class is not abstract
  //note need val var for get/set etc
}
object PointObject extends App {
  val  test = new LabledPoint("Black Thursday", 1929 , 230.07)
  println(test.x)
  println(test.lableValue)
}

