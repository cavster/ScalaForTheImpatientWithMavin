package Chapter5

/**
 * Created by colmcavanagh on 5/9/14.
 */
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
