package Chapter12

/**
 * Created by colmcavanagh on 5/12/14.
 */
object Chapter12 extends App{

  //Q1
  def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(i => (i, fun(i)))
  //adds the range each time with regards to its map so 8*8 frist time and does the whole range


  //Q2

  def getMax(a:Array[Int]) = a.reduceLeft(( x , y ) => if (x > y) x else y)//goes through whole array
 // println(max)
  //with recursion def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

  //Q3
  def Factorial2(n:Int):Int = (1 to n).reduceLeft(_ * _)


  //Q4

  def factorial(n: Int) = (1 to n).foldLeft(1)(_ * _)

  //Q5
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(fun).max
  }

  //Q6
  def largestTwo(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (x, fun(x))).reduceLeft((x,y) => if (x._2 > y._2) x else y)._1

  //Q7//use tubles

  def adjustToPair(fun: (Int, Int) => Int) : ((Int, Int)) => Int = {
    case(x, y) => fun(x, y)//call the funotin on the two varables
  }


  //Q8
  def Corresponding(strings: Seq[String], lengths: Seq[Int]) =
    strings.corresponds(lengths)(_.length == _)
}