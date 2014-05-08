package sfti.examples
/**
 * Created by colmcavanagh on 5/3/14.
 */
object Chapter4 {
  def run {
    val items: Map[String, Double] = Map("phone" -> 100.5, "Iphone" -> 4000, "Colm" -> 6045) //you need to declare types remember!
    val newItems = (for ((k, v) <- items) yield (k, v * 0.9))
    println(newItems)
  }
  def main(args: Array[String]): Unit = {
    println("Hello World")
    run
  }
}

