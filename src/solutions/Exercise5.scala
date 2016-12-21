package solutions

import exercises.scala.{Const, Expression, Sum}

object Exercise5 extends App {
  def evaluate(expr: Expression): Int = expr match {
    case Const(v) => v
    case Sum(l, r) => evaluate(l) + evaluate(r)
  }

  val expr: Expression = Sum(Const(5), Sum(Const(1), Sum(Const(3), Const(2))))
  println(evaluate(expr)) // 11
}
