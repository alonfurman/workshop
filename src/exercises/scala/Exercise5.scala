package exercises.scala

sealed trait Expression

case class Const(value: Int) extends Expression
case class Sum(exp1: Expression, expr2: Expression) extends Expression

object Exercise5 extends App {
  def evaluate(expr: Expression): Int = ???

  val expr: Expression = Sum(Const(5), Sum(Const(1), Sum(Const(3), Const(2))))
  println(evaluate(expr)) // 11
}
