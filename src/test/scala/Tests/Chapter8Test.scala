package Tests

/**
 * Created by colmcavanagh on 5/9/14.
 */

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import Chapter8._
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Chapter8Test extends FunSuite {
//test the bank account classes
  test("Test Person"){
    val colm = new Person("Colm")
    println(colm.name)
    assert(colm.name == "Colm")
  }

  test("Test Rectangle"){
    val rec = new Rectanglex( new Point(24,24) ,new Point(25,25) )
    println(rec.centerPoint)
    println(rec.bottomRight)
   // assert(colm.name == "Colm")
  }

  test("Test Point"){
    val point = new Point( 36 , 12 )
    println(point.x)
    println(point.y)
    val LabledPointx = new LabledPoint("My Point" , 23 , 55)
    println(LabledPointx.lableValue)
    // assert(colm.name == "Colm")
  }

  test("Test Bank Accounts"){
    val Bank = new BankAccount(500)
    Bank.deposit(100)

    assert(Bank.checkBalance == 600)
  }

  test("Bank Saveings Account"){
    val saveingAccount=new SavingsAccount(500)
    saveingAccount.deposit(1)
    saveingAccount.deposit(1)
    saveingAccount.deposit(1)
    saveingAccount.deposit(1)
    assert(saveingAccount.checkBalance == 503)
  }
  test("items"){
    val test = new SimpleItem(500,"Colms Item")
    println(test)
    println(test.price)
    println(test.description)
    val bundle = new Bundle(items = List(
      new SimpleItem(price = 55, description = "Colm new item"),
      new SimpleItem(price = 14, description = "Colm new item the new second item")))
    println(bundle.price)
    println(bundle.description)

  }

  test("Test Bundle Methods"){
    val bundle = new Chapter8.Bundle(items = List(//had two names with Bundle
      new SimpleItem(price = 55, description = "Colm new item"),
      new SimpleItem(price = 14, description = "Colm new item ")))
      assert(bundle.price == 69)
  }
  test("Test Shapes"){
    val r = new Rectanglex(new Point(0,0), new Point(10, 10))
    println(r)

    val c = new Circle(new Point(7, 7), 10)
    println(c)

  }
  test("Test Squor"){

    val squareOne = new Square()
    println(squareOne)

    val squareTwo = new Square(8)
    println(squareTwo)

  }
  //fix this later

}
