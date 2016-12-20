package exercises.scala

object Exercise3 {
  def leafCount(t: Tree): Int = {
    t match {
      case Node(_, l, r) => leafCount(l) + leafCount(r)
      case Leaf => 1
    }
  }
}
