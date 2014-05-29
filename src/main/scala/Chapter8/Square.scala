package Chapter8

/**
 * Created by colmcavanagh on 5/9/14.
 */

  import java.awt.Rectangle
class Square(x : Int, y: Int, width: Int) extends Rectangle(x, y, width, width) {
  def this() = this(0, 0, 0)
  def this(width: Int) = this(0, 0, width)
}



