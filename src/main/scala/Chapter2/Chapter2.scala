package Chapter2


/**
 * Created by colmcavanagh on 5/2/14.
 */
object Chapter2 {
  //Question one
  def getSignum(x: Int) = {
    if (x > 0) {
      1
    }
    else if (x < 0) {
      -1
    }
    else 0
  }

  //Questions 2,3,4



  def empty() = {}

  //its type is Unit
  var y = 2
  var x: Unit = y = 1
  //Question 4 write a scala equivalent for the Java Loop

  def printOneToTen()= {
    for (i <- 1 to 10) {
      println(i)
    }
  }

  // write a procedual countdown(n:Int) from n to zero

  def countDown(n: Int) {
    for (n <- (1 to n).reverse) {
      println(n)
    }
  }

  //write a for loop that computes the unicode of a string
  //Q7
  def unicodeProductLoop(s: String): Long = {
    var product = 1L
    for (c <- s) product *= c.toLong
    product
  }
  //Q8
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

  //Q10
  /*
  def positive(n: Int) = n > 0

  def negative(n: Int) = n < 0

  def even(n: Int) = n % 2 == 0

  def isNotEven(n: Int) = !even(n)

  def power(x: Double, n: Int): Double = {
    if (positive(n) && even(n)) power(x, n / 2) * power(x, n / 2)
    else if (positive(n)) x * power(x, n - 1)
    else if (n == 0) 1
    else 1 / power(x, -n)
  }
def power(x: Double, n: Int): Double = n match {
  if (positive (n) && even (n) ) power (x, n / 2) * power (x, n / 2)
  else if (positive (n) ) x * power (x, n - 1)
  else if (n == 0) 1
  else 1 / power (x, - n)
  }*/
  //Q10 done with cases
  def power(x: Double, n: Int): Double = n match {
    case _ if n > 0 && n % 2 == 0 => math.pow(power(x, n / 2), 2)//recursion call  funotion again
    case _ if n > 0 => x * power(x, n - 1)
    case _ if n == 0 => 1
    case _ if n < 0 => 1 / power(x, -n)
  }

  def recUnicodeProduct(s: String): Long = {
    s.length match {
      case 0 => 1L
      case _ => s.head.toLong * recUnicodeProduct(s.drop(1))
    }
  }


  def main(args: Array[String]): Unit = {
    println(unicodeProductLoop("Hello"))
  }
}