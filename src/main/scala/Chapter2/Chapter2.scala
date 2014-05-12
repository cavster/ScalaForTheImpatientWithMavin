package Chapter2


/**
 * Created by colmcavanagh on 5/2/14.
 */
object Chapter2 {
  //Question one
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
  //Questions 2,3,4
  def empty()={}//its type is Unit
  var y=2
  var x:Unit=y=1
//Question 4 write a scala equivalent for the Java Loop
  for(i <- 1 to 10){
    println(i)
  }

// write a procedual countdown(n:Int) from n to zero
  def countDown(n:Int) {
    for (n <-(1 to n).reverse) {
      println(n)
    }
  }
  //write a for loop that computes the unicode of a string
  def unicodeProductLoop(s: String): Long = {
    var product = 1L
    for (c <- s) product *= c.toLong
    product
  }
  //DoThe previouse excersize without a loop
  def unicodeProductNoLoop(s: String): Long = {
    s.foldLeft(1L)(_ * _)
  }
  /* 9) Make the function of the previous exercise a recursive function. */
  def recUnicodeProductRecursive(s: String): Long = {
    s.length match {
      case 0 => 1L
      case _ => s.head.toLong * recUnicodeProduct(s.drop(1))
    }
  }

  def positive(n:Int) = n > 0
  def negative(n:Int) = n < 0
  def even(n:Int) = n%2 == 0
  def isNotEven(n:Int) = !even(n)//not equal too
  def power(x: Double, n: Int) : Double = {
    if (positive(n) && even(n)) power(x, n/2) * power(x,n/2)
    else if (positive(n)) x * power(x, n-1)
    else if (n == 0)1
    else  1 / power(x, -n)
  }
  println(power(1,2))

  println(power(2,1))

  println(power(2,0))

  println(power(2,-4))
  def recUnicodeProduct(s: String): Long = {
    s.length match {
      case 0 => 1L
      case _ => s.head.toLong * recUnicodeProduct(s.drop(1))
    }
  }


  def main(args: Array[String]): Unit = {
    println("Hello World");
    println(unicodeProductLoop("Hello"))
  }
}