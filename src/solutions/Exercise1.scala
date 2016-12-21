package solutions

object Exercise1 extends App {
  def beforeLast(ls: List[Int]): Int = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => beforeLast(tail)
    case _ => throw new NoSuchElementException
  }


  val lst = List(2, 4, 2, 8, 5)
  println(beforeLast(lst)) // 8
}
