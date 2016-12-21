package solutions

import exercises.scala._


object Exercise4 extends App {
  def leafCount(t: Tree): Int = {
    t match {
      case Node(_, l, r) => leafCount(l) + leafCount(r)
      case Leaf => 1
    }
  }

  val tree: Tree = Node(1, Node(2, Leaf, Node(3, Leaf, Leaf)), Leaf)
  println(leafCount(tree))  // 4
}

