package Chapter8


/**
 * Created by colmcavanagh on 5/5/14.
 */
//Q4
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double,  val description: String) extends Item

class Bundle(var items: List[Item] = Nil) extends Item {
  def price = items.map(_.price).sum//so for all prices get sum of items list
  def description = items.map(_.description).mkString(", ")//for all describesions do same
}

