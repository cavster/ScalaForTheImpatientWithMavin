package Chapter3

import scala.util.Sorting
import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import scala.collection.mutable.ArrayBuffer

/**
 * Created by colmcavanagh on 5/9/14.
 */
object Chapter3 extends App {
  //Q1
  def fillArray(nums: Array[Int]): Array[Int] = {
    val r = scala.util.Random
    val x = for (i <- 0 until nums.length) {
      nums(i) = r.nextInt(nums.length)
    }
    println((nums.mkString(", ")))
    nums
  }

  val nums = new Array[Int](15)
  println(nums.length)
  fillArray(nums)

  //Q2 + //Q3
  def swapAdajaentElements(arr: Array[Int]) = {
    val newArray = for (i <- 0 until arr.length) yield {
      if (i % 2 == 0 && i < arr.length - 1)
        arr(i + 1)
      else if (i % 2 != 0 && i > 0)
        arr(i - 1)
      else
        arr(i)
    }
    newArray
  }


  //Q4
  val b = ArrayBuffer[Double](3, 2, -5, 7, -15, 18, -1, 3, 3, 3);

  def sortArrayPosToNeg(b: ArrayBuffer[Double]): ArrayBuffer[Double] = {
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
    d ++= c.toArray
    d
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