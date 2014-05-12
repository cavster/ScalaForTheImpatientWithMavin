import scala.math.BigInt
import scala.util.Random

/**
 * Created by colmcavanagh on 5/2/14.
 */
def getSignum(x:Int)={
  if(x>0)
  {
    1
  }
  else if(x<0)
  {
    -1
  }
  else 0
}
getSignum(2)
getSignum(-5)
getSignum(0)
def empty()={}
var y=2
var x:Unit=y=1
for(i <- 1 to 10){
  println(i)
}
























def countDown(n:Int) {
  for (n <-(1 to n).reverse) {
    println(n)
  }
}
//countDown(14)
//countDown(12)
def computeUniCode(z:String)= {
  var sum = 0
  for (i <- z) {
    sum += i.toInt
    println(sum)
  }
 sum
}
  computeUniCode("Hello")















/*var prod =0
for(c <- "Hello") prod*=c.toInt
*/
object Product {
  def unapply[T: Numeric](xs: Seq[T]) = Some(xs.product)
}
val Product(prod) = for(i <- "Hello") yield BigInt(i)
computeUniCode("Hello")
















"Hello".map(_.toInt).product
def positive(n:Int) =n>0
def negative(n:Int) = n<0
def even(n:Int)= n%2==0
def isNotEven(n:Int)= !even(n)//not equal too
def power(x: Double, n: Int) : Double = {
  if (positive(n) && even(n))power(x, n/2)*power(x,n/2)
  else if (positive(n))x * power(x, n-1)
  else if (n == 0)1
  else  1 / power(x, -n)
}
println(power(1,2))



println(power(2,1))



println(power(2,0))



println(power(2,-4))




