/**
 * Created by colmcavanagh on 5/5/14.
 */

package Chapter6


object Chapter6Q6{

  object PlayingCardSuit extends Enumeration {
    type PlayingCardSuit = Value
    val Club = Value("\u2663")
    val Diamond = Value("\u2666")
    val Heart = Value("\u2665")
    val Spade = Value("\u2660")

    def isRed(s: PlayingCardSuit):Boolean = {
      if (s == Heart || s == Diamond) true
      else false
    }

  }


}