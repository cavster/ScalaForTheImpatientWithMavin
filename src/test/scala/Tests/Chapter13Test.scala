package Tests

/**
 * Created by colmcavanagh on 5/12/14.
 */
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Chapter13._

@RunWith(classOf[JUnitRunner])
class Chapter13Test extends FunSuite {
  test("Mkstring "){
    val a = Array("Tom", "Fred", "Harry")
    Chapter13.mkString(a)
  }
  test("Return intergers"){
    val nameArray = Array("tom", "harry", "fred")
    val nameMap = collection.mutable.Map("tom" -> 3, "dick" -> 4, "fred" -> 5)
    println(Chapter13.convert(nameArray,nameMap))

  }
  test("IndexesQ2"){
    println(Chapter13.indexesQ2("Mississippi"))

  }
  test("indexes"){
   // val testMap =  Map(M -> 1, s -> 4, p -> 1, i -> 4)
    println(Chapter13.getIndexes("Mississippi"))
  }
  test("Char indexes"){
    println(Chapter13.charIndex("Mississippi",0))//start at zero
   //with recursion
  }

/*test("indexesImmutable"){
  val testMap =  Map(M -> 1, s -> 4, p -> 1, i -> 4)
  assert(Chapter13.Chapter13.indexesImmutable("Mississippi") == testMap)
}*/
  test("Remove zeros"){
  val testList =  collection.mutable.LinkedList(1,1,0)
  assert(Chapter13.removeZerosFromLinkedlist(testList) == List(1,1))
}
  test("MultiplyZipping"){
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)
    assert(Chapter13.multiply(prices,quantities) == List(50.0, 40.0, 9.95))

  }
  test(" 3d array"){
    val a = (1 to 9).toArray
    val x = Chapter13.arrayDim(a, 3)
    println(x.deep.mkString(","))

  }

}