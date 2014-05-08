/**
 * Created by colmcavanagh on 5/5/14.
 */

package sfti.examples

object Chapter6Q6{

  object PlayingCardSuit extends Enumeration {
    type PlayingCardSuit = Value
    val Club = Value("\u2663")
    val Diamond = Value("\u2666")
    val Heart = Value("\u2665")
    val Spade = Value("\u2660")
  }

  import PlayingCardSuit._

  def isRed(s: PlayingCardSuit) = {
    if (s == Heart || s == Diamond) "red"
    else "is not red"
  }

  for (s <- PlayingCardSuit.values) println(isRed(s))
}