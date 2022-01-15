package edu.shekhar.algorithms.linked.list

import scala.annotation.tailrec

class SinglyLinkedList[T] extends LinkedList[T] {

  private var head: Option[Node[T]] = None

  override def add(item: T): Unit = {
    val newNode: Node[T] = Node(item)
    newNode.next = head
    this.head = Some(newNode)
  }

  override def toString: String = head.toString

  override def size: Long = {
    var current: Option[Node[T]] = this.head
    var size: Long = 0
    while (current.isDefined) {
      size = size + 1
      current = current.get.next
    }
    size
  }

  override def getHead: Option[T] = {
    this.head match {
      case Some(value) => Some(value.data)
      case None => None
    }
  }

  override def insert(itemToInsert: T, insertIndex: Long): Boolean = {
    @tailrec
    def loop(currentNode: Option[Node[T]], itemToInsert: T, insertIndex: Long, currentIndex: Long): Boolean = {
      if (currentNode.isDefined) {
        if (currentIndex == (insertIndex - 1)) {
          val newNode: Node[T] = Node(itemToInsert)
          newNode.next = currentNode.get.next
          currentNode.get.next = Some(newNode)
          true
        } else {
          loop(currentNode.get.next, itemToInsert, insertIndex, currentIndex + 1)
        }
      } else {
        false
      }
    }

    loop(this.head, itemToInsert, insertIndex, 0)
  }

  override def getIndex(dataToSearch: T): Option[Long] = {
    @tailrec
    def loop(currentNode: Option[Node[T]], dataToSearch: T, index: Long): Option[Long] = {
      if (currentNode.isDefined) {
        if (currentNode.get.data == dataToSearch) Some(index)
        else loop(currentNode.get.next, dataToSearch, index + 1)
      }
      else {
        None
      }
    }

    loop(this.head, dataToSearch, 0)
  }

  /**
   * Search operation in the singly linked list is linear and
   * it scans each item one by one from head to tail hence
   * its time complexity is O(n)
   *
   * @param itemToSearch
   * @return
   */
  override def search(itemToSearch: T): Option[Node[T]] = {
    @tailrec
    def loop(currentNode: Option[Node[T]], itemToSearch: T): Option[Node[T]] = {
      if (currentNode.isDefined) {
        if (currentNode.get.data == itemToSearch) {
          currentNode
        } else {
          loop(currentNode.get.next, itemToSearch)
        }
      } else {
        None
      }
    }

    loop(this.head, itemToSearch)
  }
}
