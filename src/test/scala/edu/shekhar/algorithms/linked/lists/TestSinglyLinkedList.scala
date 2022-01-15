package edu.shekhar.algorithms.linked.lists

import com.typesafe.scalalogging.LazyLogging
import edu.shekhar.algorithms.linked.list.{LinkedList, Node, SinglyLinkedList}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TestSinglyLinkedList extends AnyFlatSpec with should.Matchers with LazyLogging {

  "A singly linked list" should "add elements at the start of the list" in {
    val singlyLinkedList: LinkedList[Int] = new SinglyLinkedList()
    val dataToAdd: Int = 10
    singlyLinkedList.add(dataToAdd)
    val currentHead: Option[Int] = singlyLinkedList.getHead
    currentHead.isDefined shouldBe true
    currentHead.get shouldEqual dataToAdd

    val nextDataToAdd: Int = 20
    singlyLinkedList.add(nextDataToAdd)
    val newHead: Option[Int] = singlyLinkedList.getHead
    newHead.isDefined shouldBe true
    newHead.get shouldEqual nextDataToAdd
    singlyLinkedList.size shouldEqual 2
  }

  it should "return a node if item to be searched is present in the list" in {
    val singlyLinkedList: LinkedList[Int] = new SinglyLinkedList[Int]
    singlyLinkedList.add(10)
    singlyLinkedList.add(20)
    singlyLinkedList.add(30)
    val result: Option[Node[Int]] = singlyLinkedList.search(20)
    result.isDefined shouldBe true
    result.get.data shouldEqual 20
  }

  it should "return None if item to be searched is present in the list" in {
    val singlyLinkedList: LinkedList[Int] = new SinglyLinkedList[Int]
    singlyLinkedList.add(10)
    singlyLinkedList.add(20)
    singlyLinkedList.add(30)
    val result: Option[Node[Int]] = singlyLinkedList.search(9999)
    result.isEmpty shouldBe true
  }

}
