package Chapter5




/**
 * Created by colmcavanagh on 5/9/14.
 */
//Q6
class Person(private var _age: Int) {//in the class its self
  if (_age < 0)
    _age = 0

  def age = _age
}
