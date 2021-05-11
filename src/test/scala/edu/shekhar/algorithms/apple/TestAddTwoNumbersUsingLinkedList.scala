package edu.shekhar.algorithms.apple

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestAddTwoNumbersUsingLinkedList extends AnyFlatSpec with Matchers {

  private val algo = new AddTwoNumbersUsingLinkedList

  "Algorithm" should "be able to add numbers using linked list" in {

    // representation of 342
    val list1 = AddTwoNumbersUsingLinkedList.toLinkedList(Array(2, 4, 3))
    println(list1)
    // representation of 465
    val list2 = AddTwoNumbersUsingLinkedList.toLinkedList(Array(5, 6, 4))
    println(list2)

    val result = algo.add(list1, list2)
    val expectedOutput = 807
    result.toInt() shouldEqual expectedOutput

    println("-------------------------------------")
  }

  "Algorithm" should "be able to add even if number of digits in each list are different" in {
    val l3 = AddTwoNumbersUsingLinkedList.toLinkedList(Array(1, 0, 9, 9))
    AddTwoNumbersUsingLinkedList.printLinkedList(Some(l3))

    val l4 = AddTwoNumbersUsingLinkedList.toLinkedList(Array(7, 3, 2))
    AddTwoNumbersUsingLinkedList.printLinkedList(Some(l4))

    val expectedOutput2 = 10138
    val result2 = algo.add(l3.next.get, l4.next.get)
    AddTwoNumbersUsingLinkedList.printLinkedList(Some(result2))
    result2.toInt() shouldEqual expectedOutput2
  }

}
