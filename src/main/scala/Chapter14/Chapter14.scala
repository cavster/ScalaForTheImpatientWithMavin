package Chapter14

/**
 * Created by colmcavanagh on 5/8/14.
 */
object Chapter14 extends App {
  //ripped from git hub
  /* def javas(dir:File):Array[File] = {
     val filedirs = dir.listFiles
     val dirs = filedirs.filter(_.isDirectory)
     val files = filedirs.filter(_.getName.endsWith(".java"))
     files ++ dirs.flatMap(javas)
   }

   var caseCount = 0
   var fallCount = 0
   val casePattern = """case [^:]+:""".r
   val fallPattern = """[Ff]alls? thr""".r

   for (java <- javas(new File("/Users/liuhe/src"))) {
     val code = scala.io.Source.fromFile(java).mkString
     caseCount += casePattern.findAllIn(code).length
     fallCount += fallPattern.findAllIn(code).length
   }

   println(caseCount)
   println(fallCount)
   println(fallCount.toDouble / caseCount.toDouble * 100 + "%")
 */
  //Q2
  def swap(p: Tuple2[Int, Int]) = p match {
    case (x, y) => (y, x)
  }

  //use tuples

  /*
    //Q3
    def swapArray(p:Array[Int]):Array[Int] = p.splitAt(2) match {
    //took awhile to figture out snytax
      case (Array(x,y) ,z) => Array(y,x) ++z

    }*/
  //Ripped from github but the point is I learned somethin
  // Q3
  def swapArray(a: Array[Int]) = a match {
    case Array(x, y, rest@_*) => Array(y, x) ++ rest
    case _ => a
  }

  //Q4 in items

  //Q5
  def leafSum(lst: List[Any]): Int = {
    if (lst.isEmpty) 0
    else (lst.head match {
      case h: Int => h
      case h: List[Any] => leafSum(h) //recursion so (3,8 comes in goes in again becomes case one)
      case _ => 0
    }) + leafSum(lst.tail)
  }

  //Q5 done with for loop from github
  /*def sumLeaf2(list: List[Any]) : Int = {
    (for(elem <- list) yield (
      elem match {
        case x: List[Int] => sumLeaf2(x)
        case x: Int => x
        case _ => 0
      }
      )).sum
  }*/
  //Q5 with mapping
  val y = List(List(3, 8), List(2), List(5)) //for all lists I did wasnt sure how to account for bit in the middle

  //Q5 with mapping
  def leafSumQ5(lst: List[Any]): Int = lst.map(_ match {
    case l: List[Any] => leafSum(l)
    case i: Int => i
  }).sum

  //Q7,8
  def eval(tree: BinaryTree): Int = {
    tree match {
      case Node(c: Char, r@_*) => if (c == '+') r.map(eval).sum else if (c == '*') r.map(eval).reduceLeft(_ * _) else r.map(eval).foldLeft(0)(_ - _)
      case Leaf(v) => v
    }
  }

  //got from git hub Q9 alterative solution
  def list: List[Option[Int]] = {
    List(Option(-1), None, Option(2))
  }


  //Q10
  type T = Double => Option[Double]

  def compose(f: T, g: T): T = {
    (x: Double) => f(x) match {
      case Some(x) => g(x)
      case None => None
    }
  }

  import scala.math.sqrt

  def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  val h = compose(f, g)

}


