package Chapter12

/**
 * Created by colmcavanagh on 5/12/14.
 */
object Chapter12 extends App{
  def values(fun: (Int) => Int, low: Int, high: Int):Int = {
    (low to high).map(i => (i, fun(i)))
    values(x => x * x, -8, 5)

  }

}
