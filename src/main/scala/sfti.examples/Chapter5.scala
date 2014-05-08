package sfti.examples

import sun.management.counter.Counter



/**
 * Created by colmcavanagh on 5/5/14.
 */
object Chapter5  {
  val colm = new Counter()
  colm.increment()
  colm.increment()
  println(colm.current())
  val max = colm.current()
  val Bank = new BankAccount

  Bank.deposit(5000)
  Bank.withdraw(200)
  println(Bank.bal)
  val time = new Time(10, 30)
  val time2 = new Time(20, 22)
  val time3 = new Time(7, 18)
  println(time.before(time2))
  println(time.before(time3))
/*  val nameStudentOne = new Student("colm", 5)
  println(nameStudentOne.getId)
  println(nameStudentOne.getName)
  val PersonOne = new Person(5)
  println(PersonOne.age)
  val PersonTwo = new Person(-4)
  println(PersonTwo.age)
*/
  class Counter {
    private var value = Int.MaxValue - 2

    //var chagess
    def increment() {
      if (value + 1 < Int.MaxValue) {
        value += 1
      }
    }

    def current() = value
  }

  class BankAccount {
    //read only
    var bal = 0

    def deposit(amount: Int) {
      bal += amount
    }

    def balance = bal

    def withdraw(withdrawAmmount: Int) {
      bal -= withdrawAmmount
    }
  }

  //read only

  class Time {

    var h = 0
    var m = 0

    def hours = h

    def minutes = m

    def this(hrs: Int, min: Int) {
      //constrators
      this()
      this.h = hrs * 60 - 1
      this.m = min
    }

    def before(other: Time): Boolean = {

      if (this.h < other.h)
        true
      else if (this.h > other.h)
        false
      else if (this.m < other.m)
        true
      else
        false
    }
  }

}
  /* read only

   class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
   }
  class Person(private var _age: Int) {//in the class its self
    if (_age < 0)
      _age = 0

    def age = _age
  }
}
class Car(val manufacturer: String,
          val modelName: String,
          val modelYear: Int = -1,
          var licensePlate: String = "") {
}

*/