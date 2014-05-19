package Chapter3

import scala.util.Sorting
import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import scala.collection.mutable.ArrayBuffer

/**
 * Created by colmcavanagh on 5/9/14.
 */
object Chapter3 extends App {
  //Q1
  def fillArray(n:Int): Array[Int] = {
    val r = scala.util.Random
    val nums = new Array[Int](n-1)
    for (i <- 0 until nums.length) {
      nums(i) = r.nextInt()
    }
    println((nums.mkString(", ")))
    nums
  }

  val n = 15
  fillArray(n)

  //Q2 + //Q3
  /*
  def swapAdajaentElements(arr: Array[Int]):Array[Int] = {
     for(i <- 0 until(arr.length, 2) if i < arr.length-1) {
      val tmp = arr(i)
      arr(i) = arr(i+1)
      arr(i+1) = tmp
    }
    arr
  }
  def swapAdajaentElements(arr: Array[Int]):Array[Int] = {
    arr.grouped(2).flatMap(_.reverse).toArray//Done with funotions
  }*/

  //case Classes for exception
  def swapAdajaentElements(arr: Array[Int]):Array[Int] =arr match {
    case _ if arr.length < 2 =>   arr//maybe put in messgae for error
    case _ if arr.length > 2 =>   arr.grouped(2).flatMap(_.reverse).toArray
  }
  val arraytest= Array(1,2,3,4,5)
  val newt = swapAdajaentElements(arraytest)
  println("New Array ")
  println(newt.deep.mkString(" "))


  //Q4
  val b = Array[Double](3, 2, -5, 7, -15, 18, -1, 3, 3, 3);

  def sortArrayPosToNeg(b: Array[Double]): Array[Double] = {//Kinda Hard to do without ArrayBuffer
    val c = ArrayBuffer[Double]()
    val d = ArrayBuffer[Double]()
    for (elem <- b) {
      if (elem >= 0) {
        d += elem
      }else {
        c += elem
      }
    }
    println(d)
    println(c)
    d ++= c.toArray//need to turn it to array
    d.toArray

  }

  //Q5,6,7
  val d = sortArrayPosToNeg(b)
  d.sum
  d.length
  val adverage = d.sum / d.length
  d.reverse
  d.distinct
  //Q9


  //One way of doing it
  val array = (for (timeZone <- java.util.TimeZone.getAvailableIDs if timeZone.startsWith("America")) yield timeZone.drop(8)).toBuffer.sorted
  println(array)
  //With mapping
  val timezones = java.util.TimeZone.getAvailableIDs
  val americas = timezones.filter(k => k.contains("America")).map(k => k.split("/")(1))
  Sorting.quickSort(americas)
  println(americas.deep.mkString(" "))

  //Q10
  val flavMap = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val natives = flavMap.getNativesForFlavor(DataFlavor.imageFlavor)

  //carys method
  def americanTimeZones: Array[String] = {
    java.util.TimeZone.getAvailableIDs.filter(_.startsWith("America/")).map(_.substring("America/".length)).sortWith(_ < _)
  }
  //val arr =  getAvailableIDs()for(elem <- arr if (elem.contains("America")))yield elem

}
//Some Alterative soloutions

/*
var first = true
println(first)
val indexes=for (i <- 0 until d.length if first || d(i) >= 0)yield{
  if(d(i)<0) first=false; i
}
  for(j <- 0 until indexes.length)d(j) = d(indexes(j))
d.trimEnd(d.length-indexes.length)

val z={for(i <- element.length if element(i)>0){
  element +=(i)
}
for(i <- element.length if element(i)<0){
element +=(i)
}}
println(z)

val a = ArrayBuffer(1,2,3,4,5)
for (i<-0 until a.length){
  if (i%2 == 0) println(a(i))
  else println(a(i-1)) }
val p = 1 to 15 filter { _ > 0 } map { Random.nextInt(_) }
//this makes a new array

val X = for (i<-0 until a.length)yield{
  if (i%2==0) println(a(i+1))
  else println(a(i-1)) }

}*/