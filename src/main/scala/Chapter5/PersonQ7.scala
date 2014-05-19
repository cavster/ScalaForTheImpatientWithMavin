package Chapter5


/**
 * Created by colmcavanagh on 5/9/14.
 *///Q7
  class PersonQ7(name: String) {
    val fName = name.split("\\s+")(0)
    val lName = name.split("\\s+")(1)
    override def toString = "Person(" + fName + ", " + lName + ")"

}
