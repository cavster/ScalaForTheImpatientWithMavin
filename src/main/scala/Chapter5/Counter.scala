package Chapter5



/**
 * Created by colmcavanagh on 5/9/14.
 */
class Counter {

  private var value = Int.MaxValue - 2

  def increment() {
    if (value + 1 < Int.MaxValue) {
      value += 1
    }
  }

  def current() = value
}
