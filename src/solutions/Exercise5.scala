package exercises.scala

import exercises.java.Finder

import scala.util.Random

object Exercise5 extends App {

  val finder = new Finder()

  def valueToUpper(key: Int = Random.nextInt(10)): Option[String] = {
    Option(finder.find(key)).map(_.toUpperCase)
  }

  valueToUpper(1).map(println(_)) //ONE
}
