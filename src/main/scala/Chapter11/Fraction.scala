package Chapter11

/**
 * Created by colmcavanagh on 5/6/14.
 */
//got this one online as well as the next one
object Fraction {
   def apply(n: Int, d: Int) = new Fraction(n, d)
  }
class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)
    override def toString = num + "/" + den
    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

      def +(rhs: Fraction) : Fraction = {
        val newNum = num + rhs.num
        val newDen = den + rhs.den
        val newGcd = gcd(newNum, newDen)
        Fraction(newNum / newGcd, newDen / newGcd)
      }

      def -(rhs: Fraction) : Fraction = {
        val newNum = num - rhs.num
        val newDen = den - rhs.den
        val newGcd = gcd(newNum, newDen)
        Fraction(newNum / newGcd, newDen / newGcd)
      }

      def *(rhs: Fraction) : Fraction = {
        val newNum = num * rhs.num
        val newDen = den * rhs.den
        val newGcd = gcd(newNum, newDen)
        Fraction(newNum / newGcd, newDen / newGcd)
      }

      def /(rhs: Fraction) : Fraction = {
        val newNum = num / rhs.num
        val newDen = den / rhs.den
        val newGcd = gcd(newNum, newDen)
        Fraction(newNum / newGcd, newDen / newGcd)
      }
  }

object FrationTest extends App{
    val frac1 = Fraction(15, -6)
    println(frac1.toString)

     val frac2 = Fraction(2, 3)
    println(frac1 * frac2)
  }
