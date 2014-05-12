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
  val max = a.reduceLeft(( x , y ) => if (x > y)x else y)//goes through whole array
  println(max)
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
}