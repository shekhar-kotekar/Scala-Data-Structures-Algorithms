package edu.shekhar.algorithms.dynamic.programming

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestGridTraveler extends  AnyFlatSpec with Matchers {

  "Grid traveler algorithm" should "be able to find path with minimum cost" in {
    val traveler = new GridTraveler
    val rowCount = 1
    val columnCount = 1
//    val output = traveler.travel(rowCount, columnCount)
//    val expectedOutput = 1
//    output shouldEqual expectedOutput
  }

}
