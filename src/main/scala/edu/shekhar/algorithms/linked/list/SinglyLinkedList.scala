package edu.shekhar.algorithms.linked.list

import scala.annotation.tailrec

class SinglyLinkedList[T] extends LinkedList[T] {

  private var head: Option[Node[T]] = None

  override def add(item: T): Unit = {
    val newNode: Node[T] = Node(item)
    newNode.next = head
    this.head = Some(newNode)
  }


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

  /**
   * Search operation in the singly linked list is linear and
   * it scans each item one by one from head to tail hence
   * its time complexity is O(n)
   * @param itemToSearch
   * @return
   */
  override def search(itemToSearch: T): Option[Node[T]] = {
    @tailrec
    def loop(currentNode: Option[Node[T]], itemToSearch: T): Option[Node[T]] = {
      if(currentNode.isDefined){
        if(currentNode.get.data == itemToSearch) {
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
