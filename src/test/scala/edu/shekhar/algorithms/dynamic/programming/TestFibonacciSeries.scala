package edu.shekhar.algorithms.dynamic.programming

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestFibonacciSeries extends AnyFlatSpec with Matchers {
  
  "A Fibonacci sequence generator" should "be able to generate Nth number correctly when N is greater than 0" in {
    val fibGenerator = new FibonacciGenerator()
    val n = 6
    val expectedFibOf6 = 8
    fibGenerator.get(n) shouldEqual expectedFibOf6

    val expectedFibOf7 = 13
    fibGenerator.get(7) shouldEqual expectedFibOf7

    val expectedFibOf8 = 21
    fibGenerator.get(8) shouldEqual expectedFibOf8
    val fibOf47: Long = 12586269025L
    fibGenerator.get(50) shouldEqual fibOf47
  }

}
