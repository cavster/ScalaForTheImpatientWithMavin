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
  test("Bank Saveings Account"){
    val saveingAccount=new SavingsAccount(500)
    saveingAccount.deposit(1)
    saveingAccount.deposit(1)
    saveingAccount.deposit(1)
    saveingAccount.deposit(1)
    assert(saveingAccount.checkBalance == 503)
  }

  test("Test Bundle Methods"){
    val bundle = new Chapter8.Bundle(items = List(//had two names with Bundle
      new SimpleItem(price = 55, description = "Colm new item"),
      new SimpleItem(price = 14, description = "Colm new item ")))
      assert(bundle.price == 69)
  }
  //fix this later

}
