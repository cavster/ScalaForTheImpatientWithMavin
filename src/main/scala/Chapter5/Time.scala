package Chapter5


/**
 * Created by colmcavanagh on 5/9/14.
 */
class Time (val hrs:Int, val min:Int){

  var h =  hrs * 60 - 1
  var m = min
  def hours = h

  def minutes = m



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
