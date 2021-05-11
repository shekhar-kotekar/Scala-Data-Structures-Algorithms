package edu.shekhar.algorithms.apple

import edu.shekhar.algorithms.apple.AddTwoNumbersUsingLinkedList.printLinkedList

import scala.annotation.tailrec

class AddTwoNumbersUsingLinkedList {

  def add(l1: Node, l2: Node): Node = {
    val result = Node(Integer.MIN_VALUE)
    this.loop(Some(l1), Some(l2), 0, result)
  }

  private def addNumbers(n1: Int, n2: Int, carry: Int): (Int, Int) = {
    val tmp = n1 + n2 + carry
    val lastDigit = tmp % 10
    val carryForward = tmp / 10
    println(s"n1: $n1, n2: $n2, last digit: $lastDigit, previous carry: $carry, new carry forward: $carryForward")
    (carryForward, lastDigit)
  }

  @tailrec
  private def loop(list1: Option[Node], list2: Option[Node], carry: Int, result:Node): Node = (list1, list2) match {
    case (Some(n1), Some(n2)) =>
      val (newCarry, sum) = addNumbers(n1.data, n2.data, carry)
      val newNode = Node(sum, result.next)
      result.next= Some(newNode)
      printLinkedList(Some(result))
      loop(n1.next, n2.next, newCarry, result)
    case (Some(n1), None) =>
      val currentResult = addNumbers(n1.data, 0, carry)
      val newNode = Node(currentResult._2, result.next)
      result.next= Some(newNode)
      loop(n1.next, None, currentResult._1, result)
    case (None, Some(n2)) =>
      val currentResult = addNumbers(0, n2.data, carry)
      val newNode = Node(currentResult._2, result.next)
      result.next= Some(newNode)
      loop(None, n2.next, currentResult._1, result)
    case (None, None) =>
      if(carry > 0) {
        val newNode = Node(carry, result.next)
        result.next = Some(newNode)
      }
      result
  }

}

object AddTwoNumbersUsingLinkedList {

  class LinkedList {
    val head: Node = Node(Integer.MIN_VALUE)
  }

  def toLinkedList(array: Array[Int]): Node = {
    val head = Node(Integer.MIN_VALUE)
    array.foldRight(head){(currentNumber, accumulator) => makeLinkList(currentNumber, accumulator) }
  }
  private def makeLinkList(currentNumber: Int, accumulator: Node): Node = {
    val newNode = Node(currentNumber, accumulator.next)
    accumulator.next = Some(newNode)
    accumulator
  }

  @tailrec
  def printLinkedList(node: Option[Node]): Unit = node match {
    case None => println(s"EOLL")
    case node: Option[Node] => print(s"${node.get.data} -> ")
      printLinkedList(node.get.next)
  }
}

case class Node(data: Int, var next: Option[Node] = None) {
  def toInt(): Int = {
    this.deepToString().toInt
  }

  def deepToString(): String = {
    @tailrec
    def loop(node: Node, accumulator: String): String = node.next match {
      case None => s"$accumulator${node.data.toString}"
      case Some(next) =>
        val newAccumulator: String = if(node.data == Integer.MIN_VALUE) "" else s"$accumulator${node.data.toString}"
        loop(next, newAccumulator)
    }

    loop(this, "")
  }
}