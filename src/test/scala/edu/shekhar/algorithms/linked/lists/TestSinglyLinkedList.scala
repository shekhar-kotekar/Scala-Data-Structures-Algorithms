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

  it should "insert at given index in the list" in {
    val singlyLinkedList: LinkedList[Int] = new SinglyLinkedList[Int]
    singlyLinkedList.add(10)
    singlyLinkedList.add(20)
    singlyLinkedList.add(30)
    singlyLinkedList.add(40)
    this.logger.info(singlyLinkedList.toString)

    val insertAtIndex: Int = 2
    val currentIndex: Option[Long] = singlyLinkedList.getIndex(20)
    currentIndex.isDefined shouldBe true
    currentIndex.get shouldEqual insertAtIndex

    val valueToInsert: Int = 99999
    singlyLinkedList.insert(valueToInsert, insertAtIndex)
    this.logger.info(singlyLinkedList.toString)
    val indexOfInsertedValue: Option[Long] = singlyLinkedList.getIndex(valueToInsert)
    indexOfInsertedValue.isDefined shouldBe true
    indexOfInsertedValue.get shouldEqual insertAtIndex
  }

  it should "be able to remove an item from the list" in {
    val singlyLinkedList: LinkedList[Int] = new SinglyLinkedList[Int]
    singlyLinkedList.add(10)
    singlyLinkedList.add(20)
    singlyLinkedList.add(30)
    singlyLinkedList.add(40)
    singlyLinkedList.add(50)
    singlyLinkedList.add(60)
    this.logger.info(singlyLinkedList.toString)

    singlyLinkedList.remove(60)
    singlyLinkedList.getHead.get shouldEqual 50

    singlyLinkedList.remove(30)
    singlyLinkedList.getIndex(20).get shouldEqual 2
  }

}
