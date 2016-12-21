package solutions

import exercises.java.Finder

import scala.util.Random

object Exercise6 extends App {

  val finder = new Finder()

  def valueToUpper(key: Int = Random.nextInt(10)): Unit = {
    Option(finder.find(key)).map(_.toUpperCase).map(println(_))
  }

  valueToUpper(1) //ONE
//  val l = List.fill(10)(valueToUpper())
//  l.map(_.map(println(_)))
}
