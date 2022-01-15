package edu.shekhar.algorithms.linked.list

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
}
