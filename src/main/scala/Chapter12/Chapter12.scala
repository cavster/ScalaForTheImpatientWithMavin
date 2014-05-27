package Chapter12

/**
 * Created by colmcavanagh on 5/12/14.
 */
object Chapter12 extends App{

  //Q1
  def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(i => (i, fun(i)))
  //adds the range each time with regards to its map so 8*8 frist time and does the whole range
  println(values(x => x * x , -8 , 5))//pass in the fun its self
  println(values(x => x + x , -8 , 5))

  //Q2
  val a = Array(1,2,3,4,5)
  def getMax(a:Array[Int]) = a.reduceLeft(( x , y ) => if (x > y) x else y)//goes through whole array
  println(getMax(a))
 // println(max)
  //with recursion def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  //Q3
  //def Factorial(n:Int):Int = (1 to n).reduceleft(_ * _)
  //println(Factorial(5))
  //doesnt like using ranges with reduceleft

  //Q4

  def factorial(n: Int) = (1 to n).foldLeft(1)(_ * _)
  println(factorial(5))
  println(factorial(10))//will return 1
  //Q5
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(fun).max
  }
  println(largest(x => 10 * x - x * x,1 to 10))

  //Q6
  def largestTwo(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (x, fun(x))).reduceLeft((x,y) => if (x._2 > y._2) x else y)._1

  println(largestTwo(x => 10 * x - x * x, 1 to 10))

  //Q7//use tubles
  val pairs = (1 to 10) zip (11 to 20)
  println(pairs)
  def adjustToPair(fun: (Int, Int) => Int) : ((Int, Int)) => Int = {
    case(x, y) => fun(x, y)//call the funotin on the two varables
  }
  val answer = pairs.map(adjustToPair(_ + _))
  println(answer)

  //Q8
  def corresponds[A, B](a: Seq[A], b: Seq[B], f: (A, B) => Boolean) = (a zip b).map(x => f(x._1, x._2)).count(!_) == 0

  val o = Array("Hello", "Everyone", "Maddness", "!")
  val p = o.map(_.length)

  println(o.mkString(", "))
  println(p.mkString(", "))

  val y = corresponds(o, p, (p: String, o: Int) => p.length == o)

  println(y)
}