package Chapter8

/**
 * Created by colmcavanagh on 5/9/14.
 *///Q9
class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override def range = 2

}

