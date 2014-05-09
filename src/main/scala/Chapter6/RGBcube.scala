package Chapter6

/**
 * Created by colmcavanagh on 5/9/14.
 */
object RGBcube extends Enumeration with App{
  type PlayingCardSuit = Value
  val Red = Value("0xff0000")
  val Diamond = Value("\u2666")
  val Heart = Value("\u2665")
  val Spade = Value("\u2660")
  println(Red)
  //not sure about this one??
}
/*
Red: 200C #C41E3A
Green: 347C #009E60
Blue: 293C #0051BA
Orange: 021C "Pantone Orange" #FF5800
Yellow: 012C "Pantone Yellow" #FFD500
White: N/A #FFFFFF
*/

