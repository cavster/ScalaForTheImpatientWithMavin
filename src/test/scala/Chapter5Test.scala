import org.junit.runner.RunWith
import org.scalatest.FunSuite
//import Chapter5._
import org.scalatest.junit.JUnitRunner

//need this

/**
 * Created by colmcavanagh on 5/9/14.
 */
import Chapter5._
@RunWith(classOf[JUnitRunner])
class Chapter5Test extends FunSuite{
  test("test deposite Bank") {
    println("Hi")
    val Bank = new BankAccount()
    Bank.deposit(200)
    println("ReturnedBank: " + Bank.balance)
    assert(Bank.balance==200)
  }
  test("test bankWithdraw"){
    val Bank = new BankAccount()
    Bank.deposit(200)
    Bank.withdraw(100)
    println("ReturnedBank: " + Bank.balance)
    assert(Bank.balance==100)
  }

  test("test Time"){
    val time = new Time(22,11)
    println("ReturnedTime: " + time.h+time.m)
    val time2 = new Time(10,10)
    assert(time.before(time2)==false)
  }
  test("test Person"){
    val person = new Person(-5)
    println("ReturnedAge: " + person.age)
    assert(person.age==0)
  }
}
