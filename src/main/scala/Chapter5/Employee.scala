package Chapter5


/**
 * Created by colmcavanagh on 5/12/14.
 */

class Employee(defName: String = "John Q. Public", defSalary: Double = 0.0) {
  val name: String = defName
  var salary: Double = defSalary
}
object Test extends App{
  new Employee("Colm Cavanagh")
  new Employee(defSalary = 10000000)
  // If this is not desired, then the first/former might be preferred.
}
