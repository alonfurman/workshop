package exercises.scala

object Exercise2 {
  def compress(lst: List[Int]): List[Int] = {
    lst match {
      case Nil => Nil
      case h :: tail => h :: compress(tail.dropWhile(_ == h))
    }
  }
}
