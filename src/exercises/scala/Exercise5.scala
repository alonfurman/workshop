package exercises.scala

import exercises.java.Finder

import scala.util.Random

object Exercise5 extends App {

  val finder = new Finder()

  def valueToUpper(key: Int = Random.nextInt(10)): Option[String] = ???

  valueToUpper(1).map(println(_)) //ONE
}
