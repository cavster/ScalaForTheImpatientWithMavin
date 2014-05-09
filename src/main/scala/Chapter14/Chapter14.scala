package Chapter14

/**
 * Created by colmcavanagh on 5/8/14.
 */
object Chapter14 extends App{
  import java.io.File
  //ripped from git hub
  def javas(dir:File):Array[File] = {
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

  def swap(p:Tuple2[Int,Int]) = p match {
    case (x,y) => (y,x)
    case _ => Nil
  }
  //use tuples

  val test = new Tuple2(1,2)
  println(swap(test))
  //could just tuble.swap
  println(test.swap)
  def swapArray(p:Array[Int]):Array[Int] = p.splitAt(2) match {//took awhile to figture out snytax
    case (Array(x,y) ,z) => Array(y,x) ++z

  }
  val testArray=Array(1,2,3,4,5,6,7)
  val NewArray=swapArray(testArray)
  println(NewArray.deep.mkString(" "))//works


}


