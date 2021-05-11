package edu.shekhar.algorithms.apple

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestSumOfThreeValues extends AnyFlatSpec with Matchers {

  "Sum Of Three Values algorithm" should "be able to find a triplet whose sum will be equal to given number" in {
    val algorithm = new SumOfThreeValues
    val array = Array(3, 7, 1, 2, 8, 4, 5)
    val targetSum = 20
    val expectedTriplet = Array(5, 7, 8)
    algorithm.findTriplet(array, targetSum) shouldBe expectedTriplet

    val anotherTargetSum = 12
    val expectedTriplets = Array(1, 3, 8)
    algorithm.findTriplet(array, anotherTargetSum) shouldBe expectedTriplets
  }

}
