package Chapter5

/**
 * Created by colmcavanagh on 5/5/14.
 */
object Chapter5 extends App {
  val colm = new Counter()
  colm.increment()
  colm.increment()
  println(colm.current())//works
  val max = colm.current()
  val Bank = new BankAccount

  Bank.deposit(5000)
  Bank.withdraw(200)
  println("This is the balanace"+Bank)
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