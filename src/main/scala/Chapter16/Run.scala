package Chapter16

/**
 * Created by colmcavanagh on 5/10/14.
 */
object Run extends App {
//Q1
  val x = <ul>
    <li>Opening bracket: [</li>
    <li>Closing bracket: ]</li>
    <li>Opening brace: {{</li>
    <li>Closing brace: }}</li>
  </ul>
  //use double brackets
  println(x)

 //Q2
 //  val xml2 = <li>Fred</li> match {case <li>{Text(t)}</li> => t}
 //  val xml3 = <li>{"Fred"}</li> match {case <li>{Text(t)}</li> => t}
  //Q4

  //val images = (html \\ "img").filterNot(_.attributes("alt").isDefined)
  //import scala.xml.XML
  //val root = XML.loadFile("test.xml")
  //val src = (html \\ "img").flatMap(_.attributes("src"))
  //todo FInish off html chapter and funotions tomoro when you wake up do coursera lab and understand stuff for jon
  //Q7
  def MapToHtml(x: Map[String, String]) = {
    <dl>{for ((k,v) <- x) yield <dt>{k}</dt><dd>{v}</dd>}</dl>
  }

  val test = Map("A" -> "1", "B" -> "2")

  println(MapToHtml(test))
}
