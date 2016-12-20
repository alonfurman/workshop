package exercises.scala

object Exercise1 {
  def beforeLast(ls: List[Int]): Int = ls match {
    case h :: _ :: Nil => h
    case _ :: tail     => beforeLast(tail)
    case _             => throw new NoSuchElementException
  }
}
