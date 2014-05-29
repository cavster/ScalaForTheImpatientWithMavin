package Chapter4

import scala.collection.mutable

object Chapter4 extends App {


  val items: collection.immutable.Map[String, Double] = Map("phone" -> 100.5, "Iphone" -> 4000, "Colm" -> 6045)

  //Q1 with a for loop
  def computeDiscountItems(items: collection.mutable.Map[String, Double]) = for ((k, v) <- items) yield (k, v * 0.9)

  //with mapValues
  val newItems2 = items.mapValues(_ * 0.9)
  //with case classes

  val newItems3 = items.map {
    case (k, v) => (k, v * 0.9)
  }

  //Q2,3,4

 def countWords: Unit =
  {
    val in = new java.util.Scanner(new java.io.File("/Users/colmcavanagh/Developer/scalaMavinForTheImpatient/Text.txt")).useDelimiter("\\s")
    val map = new scala.collection.mutable.HashMap[String, Int]
    while (in.hasNext) {
      val s = in.next()
      map(s) = map.getOrElse(s, 0) + 1 //so everytime s is true add one
      print(s + " ") //
    }
    println()
    println(map)
  }



//another way of doing it
  /*
  val words = new scala.collection.mutable.HashMap[String, Int]
  val in = new java.util.Scanner(new java.io.File("/Users/colmcavanagh/Developer/scalaTest/text.txt"))
  while (in.hasNext()) {
    val word = in.next();
    if (words.contains(word))
      words(word) = words(word) + 1
    else
      words(word) = 1
  }
  println(words)
  */
  //3rd way
  //Q4
  def countWordsWithSortedMap:collection.immutable.Map[String, Int] = {
    val in = new java.util.Scanner(new java.io.File("/Users/colmcavanagh/Developer/scalaMavinForTheImpatient/Text.txt")).useDelimiter("\\s")
    var map = scala.collection.mutable.Map[String, Int]() //P44
    while (in.hasNext) {
      val s = in.next()
      map = map + (s -> (map.getOrElse(s, 0) + 1)) //so everytime s is true add one//No new var for the immuteable colm!
      print(s + " ") //
      // println(map)
    }
    map.toMap//for immutable
  }

  println(countWordsWithSortedMap) //Works!
  //Q6

  import scala.collection.mutable.LinkedHashMap

  val daysOfTheWeek = LinkedHashMap(
    "Monday" -> java.util.Calendar.MONDAY,
    "Tuesday" -> java.util.Calendar.TUESDAY,
    "Wednesday" -> java.util.Calendar.WEDNESDAY,
    "Thursday" -> java.util.Calendar.THURSDAY,
    "Friday" -> java.util.Calendar.FRIDAY,
    "Saturday" -> java.util.Calendar.SATURDAY,
    "Sunday" -> java.util.Calendar.SUNDAY)
  println(daysOfTheWeek)


  import java.util.Calendar

  val daysLinkedMap = new scala.collection.mutable.LinkedHashMap[String, Int]
  daysLinkedMap += ("Monday" -> Calendar.MONDAY) //HAS TO BE STRING TO map right
  daysLinkedMap += ("Tuesday" -> Calendar.TUESDAY)
  daysLinkedMap += ("Wednesday" -> Calendar.WEDNESDAY)
  daysLinkedMap += ("Thursday" -> Calendar.THURSDAY)
  daysLinkedMap += ("Friday" -> Calendar.FRIDAY)
  daysLinkedMap += ("Saturday" -> Calendar.SATURDAY)
  daysLinkedMap += ("Sunday" -> Calendar.SUNDAY)

//Q7

  import scala.collection.JavaConversions.propertiesAsScalaMap
  val props = propertiesAsScalaMap(System.getProperties())

  val maxkey = props.keySet.map(_.length).max

  for( (k,v) <- props ) printf("%-" + maxkey + "s | %s\n", k, v)
  def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))


  //Q8
  //done with tubles

  val b = Array[Int](3, 2, -5, 7, -15, 18, -1, 3, 3, 3)

  def minmax(values: Array[Int]): (Int, Int) = {
     (values.min, values.max)
  }

  minmax(b)

  //done without a tuple or funotions
  def minmaxTwo(values: Array[Int]): (Int, Int) = {
    //slightly buggy noticed this in test
    var min: Int = 0 //bad design if nothing negative will always return 0 as smallest value
    var max: Int = 0 //also doesn't account for small arrays
    for (v <- values) {
      if (v > max) {
        //does two loops
        max = v
      }
      else if (v < min) {
        min = v
      }
    }
    (min, max)
  }

  minmaxTwo(b)

  //by counts it means sum???
  //with loops
  /*
  def lteggt(values: Array[Int], p: Int): (Int, Int, Int) = {
    var lessThen: Int = 0
    var greaterThen = 0
    var Equal = 0
    for (v <- values) {
      if (v > p) {
        greaterThen += 1
      }
      else if (v < p) {
        lessThen += 1
      }
      else if (v == p) {
        Equal += 1
      }
    }
    (lessThen, greaterThen, Equal)
  }
  *//*
  def lteqgt(values: Array[Int], v : Int) = (
    values.count(_ < v),
    values.count(_ == v),
    values.count(_ > v)
    )
  lteggt(b, 3)
*/
  //Done with tubles got of github
  //Q9
  def lteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v)) //- note use of done alot
  }

  lteqgt(b, 3)
  val Hello = "Hello"
  val World = "World"
  Hello.zip(World)
}

/*
val props: Map[String, String] = System.getProperties
val largestKey = props.keySet.foldLeft(0)((i, s) => i max s.length)
for ((k, v) <- props) {
  print(k + (" " * (largestKey - k.length)) + "| " + v + '\n')
}
//starts Sunday at one
//no idea why that wont work
/*
import scala.collection.JavaConversions.mapAsScalaMap
val in = new java.util.Scanner(new java.io.File("/Users/colmcavanagh/Developer/scalaTest/text.txt"))
var a: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
while (in.hasNext()) {
  val v = in.next()
  var count = a.getOrElse(v, 0)
  count+=1
  println("->"+v+" "+count)
  a = a + (v->count)
}

//println(countWordsWithTreeMap)//Works!
//does apabetatly

*/

/*
val in = new java.util.Scanner(new java.io.File("text.txt"));
var a=Map[String, Int](); while (in.hasNext())
{ val v = in.next()
  var count = a.getOrElse(v, 0)
  count+=1
  println("->"+v+" "+count)
  a = a + (v->count)
}*/
}*/

