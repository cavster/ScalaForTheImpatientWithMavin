package Chapter13

/**
 * Created by colmcavanagh on 5/8/14.
 */

import java.util.TreeMap
import collection.JavaConversions._
import scala.collection.mutable._
import scala.collection

/**
 * Created by colmcavanagh on 5/7/14.
 */
object Chapter13 extends App {
  //works but is not sorted
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

  getIndexes("Mississipi")

  //differnt method from github

  def indexes(s: String) = {
    var res = new HashMap[Char, LinkedHashSet[Int]]()

    for ((c, i) <- s.zipWithIndex) {
      val set = res.getOrElse(c.toChar, new LinkedHashSet[Int])
      set += i
      res(c.toChar) = set
    }

    res
  }



  val x = indexes("Missisipi")
  println(x)
  //from page 171 in book//counts the occurane of each letter
  println((Map[Char, Int]()/: "Mississipi"){(m,c)=>m+(c->(m.getOrElseUpdate(c,0)+1))})//creates a new set each time
  val linkedListWithZeros = collection.mutable.LinkedList(1, -2, -3, 0, 0, 0, 12, 10, 0)
  println(linkedListWithZeros.filter(_ != 0))//keep everything that is not equal to zero
  println(linkedListWithZeros.filter(_ == 0))//just keep zeros
  println(linkedListWithZeros.partition(_ != 0))//splits them keeps both

  val nameArray =Array("tom","harry","fred")
  val nameMap = collection.mutable.Map("tom"->3,"dick"->4,"fred"->5)
  println(nameMap.keys)
  def convert(a:Array[String],b:Map[String,Int]) =a.toList.map(b.get(_)).flatMap(x => x)
  //with out flat map returns some or none and flatmap gets rid of it
  //.get returns value associated with _ as an option if found none if not found
  println(convert(nameArray,nameMap))
  println(nameMap.mkString("//"))
  println(nameMap.filter({case( name, number) => number<4}))//smart scala!

  val frist =List(1,2,3,4,5,6,7,8,9,10,-23,324,-44)
  val q = (frist :\ List[Int]())(_ :: _)
  println(q)
  val s = (List[Int]()/:frist)(_ :+ _)
  println(s)
  //from github
  println((List[Int]() /: frist) { (q, s) => s :: q })
  //q7
  val prices = List( 5.0, 20.0, 9.95)
  val quantities = List(10,2,1)
  println((prices zip quantities) map (p=>p._1*p._2))//as in book p171
  val tuble=(x:Double,y:Int) => x * y
  val answer=(prices zip quantities).map(tuble.tupled)
  println(answer)//multiples them together as is done in tuble
}

