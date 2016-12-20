package exercises.scala

object Main extends App {
  1 to 20 foreach { _ =>
    val randomNumber = RandomGenerator.maybeNextInt
    randomNumber.map(_ * 2).map(println(_))
  }

  println(List(1, 2, 3, 4, 5).find(_ > 2))
}

