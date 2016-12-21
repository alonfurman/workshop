package solutions


object Exercise2 extends App {
  def compress(lst: List[String]): List[String] = {
    lst match {
      case Nil => Nil
      case h :: tail => h :: compress(tail.dropWhile(_ == h))
    }
  }

  val lst = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
  println(compress(lst))
}
