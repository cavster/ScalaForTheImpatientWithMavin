package Chapter13

/**
 * Created by colmcavanagh on 5/8/14.
 */

import java.util.TreeMap
import collection.JavaConversions._
import scala.collection.mutable._
import scala.collection
import scala.collection.{immutable, SortedMap, mutable}

/**
 * Created by colmcavanagh on 5/7/14.
 */
object Chapter13 extends App {
  //works but is not sorted
  //Q1

  def getIndexes(theString: String) = {
    val results: TreeMap[Char, Set[Int]] = new TreeMap[Char, Set[Int]]()
    for (i <- 0 until theString.size) {
      if (results.contains(theString(i))) {
        results(theString(i)) += i
      } else {
        results(theString(i)) = Set(i)
      }

    }
    println(results)
    results
  }

  //Q2

  def indexesQ2(s: String): immutable.Map[Char, List[Int]] =
    s.zipWithIndex.groupBy(_._1).map(x => (x._1, x._2.map(_._2).toList))


  //Indexes
def charIndex(str: String, index: Int): SortedMap[Char, SortedSet[Int]] = {
  if (str.isEmpty) {
    SortedMap()
  }
  else {
    val nextMap = charIndex(str.tail, index + 1)
    nextMap + (str(0)
      -> (nextMap.getOrElse(str(0), SortedSet[Int]()) ++ SortedSet(index)))
  }
}
  //differnt method from github

  def indexesImmutable(s: String) = {
    var res = new HashMap[Char, LinkedHashSet[Int]]()

    for ((c, i) <- s.zipWithIndex) {
      val set = res.getOrElse(c.toChar, new LinkedHashSet[Int])
      set += i
      res(c.toChar) = set
    }
    res
  }


  //from page 171 in book//counts the occurane of each letter


  //Q3
  println((Map[Char, Int]() /: "Mississipi") {
    (m, c) => m + (c -> (m.getOrElseUpdate(c, 0) + 1))
  })
  //creates a new set each time
  val linkedListWithZeros = collection.mutable.LinkedList(1, -2, -3, 0, 0, 0, 12, 10, 0)

  println(linkedListWithZeros.filter(_ != 0)) //keep everything that is not equal to zero
  println(linkedListWithZeros.filter(_ == 0)) //just keep zeros
  println(linkedListWithZeros.partition(_ != 0))

  //splits them keeps both
  def removeZerosFromLinkedlist(list: mutable.LinkedList[Int]): LinkedList[Int] = {
    list.filter(_ != 0)
  }


  //Q4
  def convert(a: Array[String], b: Map[String, Int]) = a.toList.flatMap(b.get(_))//2 FOr 1 yeh!
//wasnt sure how to change this one
  //Im too tired to change this
  //with out flat map returns some or none and flatmap gets rid of it
  //.get returns value associated with _ as an option if found none if not found

  //smart scala!
  //Q5
  def mkString[T](s: Seq[T], sep: String = ", "): String = s.map(_.toString)reduceLeft(_.toString + sep + _.toString)
 //q6
  val frist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -23, 324, -44)
  val q = (frist :\ List[Int]())(_ :: _)
  println(q)
  val s = (List[Int]() /: frist)(_ :+ _)
  println(s)
  //from github
  println((List[Int]() /: frist) {
    (q, s) => s :: q
  })


  //q7
  val prices = List(5.0, 20.0, 9.95)
  val quantities = List(10, 2, 1)

  def multiply(prices: List[Double], quantities: List[Int]) = {
    (prices zip quantities) map (p => p._1 * p._2)
    //as in book p171
    val tuble = (x: Double, y: Int) => x * y
    val answer = (prices zip quantities).map(tuble.tupled)
    answer
  }

  //multiples them together as is done in tuble
  val returnx = multiply(prices, quantities)
  println("This is the answer "+returnx)

  //Q8
  def arrayDim(a: Array[Int], numOfDim: Int) = a.grouped(numOfDim).toArray

}

