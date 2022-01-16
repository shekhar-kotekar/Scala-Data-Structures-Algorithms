package edu.shekhar.algorithms.amazon

import edu.shekhar.algorithms.TestWrapper

class TestStaircaseAlgorithm extends TestWrapper {

  "Stair case algorithm" should "return number of possible combinations in which stair can be climbed" in {
    val staircaseAlgorithm: StaircaseAlgorithm = new StaircaseAlgorithm
    val actualResult: Int = staircaseAlgorithm.getSteps(4)
    val expectedResult: Int = 5
    actualResult shouldEqual expectedResult

    staircaseAlgorithm.getSteps(5) shouldEqual 8
    staircaseAlgorithm.getSteps(6) shouldEqual 13
    staircaseAlgorithm.getSteps(7) shouldEqual 21
  }

}
