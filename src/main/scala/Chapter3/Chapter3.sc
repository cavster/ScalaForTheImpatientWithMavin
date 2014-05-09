import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}
import scala.collection.mutable.ArrayBuffer
import scala.util.{Sorting, Random}

/**
 * Created by colmcavanagh on 5/2/14.
 */
val nums = new Array[Int](15)
println(nums.length)


val r = scala.util.Random
val x= for(i <-0 until nums.length){
  r.nextInt(nums.length)
}yield r
println(x)

println(nums)

def fillArray(arr:Array[Int],value:Int,index:Int){
  if(index<arr.length){
    arr(index)=value
    fillArray(arr:Array[Int],value,index+1)

  }
}
fillArray(nums,Random.nextInt(),0)
println(nums)

//needs 3 I ne
val b = ArrayBuffer[Double](3,2,-5,7,-15,18,-1,3,3,3);
val c = ArrayBuffer[Double]()
val d = ArrayBuffer[Double]()
for (elem<-b) {
  if (elem>=0) {
    d+=elem
  } else {
    c+=elem
  }
}
d++=c.toArray
d.sum
d.length
val adverage= d.sum/d.length
d.reverse
d.distinct
import java.util.TimeZone.getAvailableIDs
val array=getAvailableIDs()
(for (zone <- java.util.TimeZone.getAvailableIDs if zone.startsWith("America")) yield zone.drop(8)).toBuffer.sorted
val timezones = java.util.TimeZone.getAvailableIDs
val americas = timezones.filter(k => k.contains("America")).map(k => k.split("/")(1))
Sorting.quickSort(americas)
val flavMap = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val natives = flavMap.getNativesForFlavor(DataFlavor.imageFlavor)
/*
val arr =  getAvailableIDs() for (elem<-arr if (elem.contains(“America”)))yield elem
/*
var first = true
println(first)
val indexes=for (i <- 0 until d.length if first || d(i) >= 0)yield{
  if(d(i)<0) first=false; i
}
  for(j <- 0 until indexes.length)d(j) = d(indexes(j))
d.trimEnd(d.length-indexes.length)
/*
val z={for(i <- element.length if element(i)>0){
  element +=(i)
}
for(i <- element.length if element(i)<0){
element +=(i)
}}
println(z)
/*
val a = ArrayBuffer(1,2,3,4,5)
for (i<-0 until a.length){
  if (i%2==0) println(a(i))
  else println(a(i-1)) }
val p = 1 to 15 filter { _ > 0 } map { Random.nextInt(_) }
//this makes a new array*/
/*
val b= for (i<-0 until a.length)yield{
  if (i%2==0) println(a(i+1))
  else println(a(i-1)) }