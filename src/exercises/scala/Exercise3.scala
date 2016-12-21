package exercises.scala

object Exercise3 extends App {
  val keywords = List("Apple", "Ananas", "Mango", "Banana", "Beer")

  def aggregateByFirstLetter(lst: List[String]): Map[Char, List[String]] = ???

  println(aggregateByFirstLetter(keywords)) // Map(M -> List(Mango), A -> List(Ananas, Apple), B -> List(Banana, Beer))
}
