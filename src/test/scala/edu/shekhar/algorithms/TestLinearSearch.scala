package edu.shekhar.algorithms

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestLinearSearch extends AnyFlatSpec with Matchers {
  private val inputArray: Seq[Int] = Seq(10, 40, 600, 9999, 20, 49, 90, 13, 33, 45)

  "Linear search algorithm" should "return index position of the number if found in a given array" in {
    val algorithms: SearchAlgorithms[Int] = new LinearSearch[Int]
    val numberToSearch = 20
    val result : Int = algorithms.find(numberToSearch, inputArray)
    val expectedIndex = 4
    result shouldBe expectedIndex
  }

  "Linear search algorithm" should "return -1 if number NOT found in a given array" in {
    val algorithms: SearchAlgorithms[Int] = new LinearSearch[Int]
    val numberToSearch = 7508
    val result : Int = algorithms.find(numberToSearch, inputArray)
    val expectedIndex = -1
    result shouldBe expectedIndex
  }

}
