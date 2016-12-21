package solutions

import scala.collection.mutable

object Exercise3 extends App {
  val keywords = List("Apple", "Ananas", "Mango", "Banana", "Beer")

  def aggregateByFirstLetter(lst: List[String]): Map[Char, List[String]] = {
    lst.sorted.groupBy(_.head)
  }

  def aggregate2(lst: List[String]) = {
    val map: mutable.Map[Char, List[String]] = scala.collection.mutable.HashMap.empty[Char, List[String]].withDefaultValue(List.empty[String])
    lst.foreach(k => map += (k.head -> (map(k.head) ::: List(k))))
    map.mapValues(_.sorted)
  }

  println(aggregateByFirstLetter(keywords)) // Map(M -> List(Mango), A -> List(Ananas, Apple), B -> List(Banana, Beer))
  println(aggregate2(keywords)) // Map(M -> List(Mango), A -> List(Ananas, Apple), B -> List(Banana, Beer))
}


