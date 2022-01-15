package edu.shekhar.algorithms.linked.list

case class Node[T](data: T, var next: Option[Node[T]] = None) {
  override def toString: String = {
    s"[data: $data, next -> ] ${this.next}"
  }
}
