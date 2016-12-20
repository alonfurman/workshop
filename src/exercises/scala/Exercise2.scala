package exercises.scala

object Exercise2 extends App {
  def compress(lst: List[String]): List[String] = ???


  val lst = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
  println(compress(lst)) // List(a, b, c, a, d, e)
}
