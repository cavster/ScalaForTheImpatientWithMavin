package Chapter10

/**
 * Created by colmcavanagh on 5/9/14.
 */
//Q7
trait Animal {//Didnt test this one becasue it was my example
  def msg = "ROAR"
  def log(msg: String){ println(msg)}
  val speed = 15
  val size:Double//abstract have to say there sizes
  //all animals travel at 15 speed in my world
}

trait Cat extends Animal {
  abstract override def msg = "Meow -> " + super.msg
  override def log(msg: String){ println("cat "+msg)}
}

trait Dog extends Animal {
  abstract override def msg = "Woof -> " + super.msg

}

trait Cow extends Animal {
  abstract override def msg = "Mooooo -> " + super.msg
}

class MyAnimals extends Dog with Cat with Animal with Cow {
  override def msg = "Noice -> " + super.msg
  val size =15.0
}
class Cats extends Cat{
  val size =20.3
}
