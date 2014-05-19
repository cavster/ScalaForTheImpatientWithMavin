package Tests

/**
 * Created by colmcavanagh on 5/12/14.
 */
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Chapter13Test extends FunSuite {
  /*test("indexes"){
    val testMap =  Map(M -> 1, s -> 4, p -> 1, i -> 4)
    assert(Chapter13.indexes("Mississippi") == testMap)
  }*/


/*test("indexesImmutable"){
  val testMap =  Map(M -> 1, s -> 4, p -> 1, i -> 4)
  assert(Chapter13.Chapter13.indexesImmutable("Mississippi") == testMap)
}*/
  test("Remove zeros"){
  val testList =  collection.mutable.LinkedList(1,1,0)
  assert(Chapter13.Chapter13.removeZerosFromLinkedlist(testList) == List(1,1))
}
}