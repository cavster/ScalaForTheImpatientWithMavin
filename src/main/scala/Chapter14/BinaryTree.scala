package Chapter14



/**
 * Created by colmcavanagh on 5/10/14.
 */
//Q 6 ,7,8
sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(ch : Char , tr: BinaryTree*) extends BinaryTree

object Test extends App {

  def eval(tree: BinaryTree): Int = {
    tree match {
      case Node(c : Char , r @ _*) => if( c == '+') r.map(eval).sum else if (c == '*') r.map(eval).reduceLeft(_ * _) else r.map(eval).foldLeft(0)(_ - _)
      case Leaf(v) => v
    }
  }


}
