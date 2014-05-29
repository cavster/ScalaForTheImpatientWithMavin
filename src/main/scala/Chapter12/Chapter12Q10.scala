package Chapter12

/**
 * Created by colmcavanagh on 5/12/14.
 */
object Chapter12Q10 extends App {

  def testUnless(condition:Boolean)(block: => Unit){
    if (!condition){
      block
    }
  }
  val x = 4
  testUnless(x != 5 ){
    println("The code works woo!")//This test wont work in the test class

  }
}
