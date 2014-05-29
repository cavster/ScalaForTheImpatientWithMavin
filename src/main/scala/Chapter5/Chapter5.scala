package Chapter5

import scala.beans.BeanProperty

/**
 * Created by colmcavanagh on 5/5/14.
 */


   class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
   }


/*  class Person(private var _age: Int) {//in the class its self
    if (_age < 0)
      _age = 0

    def age = _age

}*/
class Car(val manufacturer: String,
          val modelName: String,
          val modelYear: Int = -1,
          var licensePlate: String = "") {
}

