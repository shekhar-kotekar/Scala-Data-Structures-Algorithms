package edu.shekhar.algorithms

class TestFactorialFinder extends TestWrapper {

  "Factorial finder algorithm" should "find factorial for positive number" in {
    val ff = new FactorialFinder
    val input = 5
    val fact = ff.calculateFactorial(5)
    logger.info(s"Factorial of $input = $fact")
    fact shouldEqual 120
  }

}
