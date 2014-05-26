package Tests

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
    assert(Bank.balance == 200)
  }
  test("test bankWithdraw"){
    val Bank = new BankAccount()
    Bank.deposit(200)
    Bank.withdraw(100)
    println("ReturnedBank: " + Bank.balance)
    assert(Bank.balance == 100)
  }

  test("test Time"){
    val time = new Time(22,11)
    println("ReturnedTime: " + time.h+time.m)
    val time2 = new Time(23,10)
    assert(time.before(time2))
  }
  test("test Person"){
    val person = new Person(-5)
    println("ReturnedAge: " + person.age)
    assert(person.age == 0)
  }
  test("test Student"){
    val student = new Student("colm" , 12)
    println("Returned Name + ReturnedAge: " + student.getName + student.getId)
    assert(student.getName == "colm")
  }
  test("Test Car"){
    val car = new Car("colm" ,"Ford"  )
    println("Car VAUES" +car.licensePlate + car.manufacturer + car.modelName +car.modelYear)
     assert(car.modelYear == -1)//uses default values
    }
  test("Test Person"){
    val colm = new PersonQ7("Colm Cavanagh"  )

   assert("Person(Colm, Cavanagh)" == colm.toString)
  }


}
