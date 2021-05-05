package edu.shekhar.algorithms

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestBinarySearch extends AnyFlatSpec with Matchers {

  private val items: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 15, 20, 30, 40)
  "Binary search algorithm" should "return index of an item if its found in an array" in {
    val algorithm: SearchAlgorithms[Int] = new BinarySearch[Int]
    val numberToSearch: Int = 20
    val actualIndex: Int = algorithm.find(numberToSearch, items)
    val expectedIndex: Int = 7
    actualIndex shouldEqual expectedIndex
  }

  "Binary search algorithm" should "return -1 if item NOT found in an array" in {
    val algorithm: SearchAlgorithms[Int] = new BinarySearch[Int]
    val numberToSearch: Int = 7508
    val actualIndex: Int = algorithm.find(numberToSearch, items)
    val expectedIndex: Int = -1
    actualIndex shouldEqual expectedIndex
  }

}
