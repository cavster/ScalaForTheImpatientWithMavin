package Chapter5


/**
 * Created by colmcavanagh on 5/9/14.
 *///Q7
  class PersonQ7(name: String) {
  // as one liner ;)
    override def toString = "Person(" + name.split("\\s+")(0) + ", " + name.split("\\s+")(1) + ")"

}
