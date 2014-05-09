package Chapter8


/**
 * Created by colmcavanagh on 5/5/14.
 */
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(val price: Double,  val description: String) extends Item

class Bundle(var items: List[Item] = Nil) extends Item {
  def price = items.map(_.price).sum//so for all prices get sum of items list
  def description = items.map(_.description).mkString(", ")
}

object Test extends App {
val test = new SimpleItem(500,"Colms Item")
  println(test)
  println(test.price)
  println(test.description)
  val bundle = new Bundle(items = List(
    new SimpleItem(price = 55, description = "Colm new item"),
    new SimpleItem(price = 14, description = "Colm new item the new second item")))
  println(bundle.price)
  println(bundle.description)

}