package edu.shekhar.algorithms.apple

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProductOfElementsExceptItself extends AnyFlatSpec with Matchers {

  "Product Of Elements Except Itself algorithm" should "return product of all the elements in a given array except itself using DIVISION" in {
    val algo = new ProductOfElementsExceptItself()
    val input = Array(1, 2, 3, 4)
    val expectedOutput = Array(24, 12, 8, 6)
    val actualOutput = algo.getProductUsingDivision(input)
    actualOutput shouldBe expectedOutput
  }
  "Product Of Elements Except Itself algorithm" should "return product of all the elements in a given array except itself" in {
    val algo = new ProductOfElementsExceptItself()
    val input = Array(1, 2, 3, 4)
    val expectedOutput = Array(24, 12, 8, 6)
    val actualOutput = algo.getProduct(input)
    actualOutput shouldBe expectedOutput

    val secondInput = Array(-1, 1, 0, -3, 3)
    val secondExpectedOutput = Array(0, 0, 9, 0, 0)
    val secondActualOutput = algo.getProduct(secondInput)
    secondActualOutput shouldBe secondExpectedOutput
  }

}
