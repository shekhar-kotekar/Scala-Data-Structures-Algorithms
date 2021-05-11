package edu.shekhar.algorithms.dynamic.programming

import scala.annotation.tailrec

class FibonacciGenerator {

  def get(n: Int): Long = dynamicProgrammingFib(n, 0, 1)

  /**
   * This implementation does not use dynamic programming and recomputes results for sub problems repeatedly
   * @param n
   * @return
   */
  def naiveFib(n: Int): Long = {
    if(n < 2) {
      1
    } else {
      println(s"n = $n")
      naiveFib(n - 1) + naiveFib(n - 2)
    }
  }

  @tailrec
  private def dynamicProgrammingFib(n: Int, a: Long, b:Long) : Long = n match {
    case 0 =>
      println(s"n = $n, a = $a, b = $b")
      a
    case _ =>
      println(s"n = $n, a = $a, b = $b")
      dynamicProgrammingFib(n -1, b, a+b)
  }
}
