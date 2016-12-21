package exercises.scala


sealed trait Tree

case class Node(data: Int, left: Tree, right: Tree) extends Tree
case object Leaf extends Tree


object Exercise4 extends App {
  def leafCount(t: Tree): Int = ???

  val tree: Tree = Node(1, Node(2, Leaf, Node(3, Leaf, Leaf)), Leaf)
  println(leafCount(tree))  // 4
}
