package Chapter5




/**
 * Created by colmcavanagh on 5/9/14.
 */
//Q6
class Person(var _age: Int = 0) {//intial value

///in the class its selfar a
  if (_age < 0)
    _age = 0

  def age = _age
}
