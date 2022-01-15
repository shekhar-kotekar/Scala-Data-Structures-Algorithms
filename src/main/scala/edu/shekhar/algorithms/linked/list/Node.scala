package edu.shekhar.algorithms.linked.list

case class Node[T](data: T, var next: Option[Node[T]] = None)
