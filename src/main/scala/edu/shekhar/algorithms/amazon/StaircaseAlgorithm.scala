package edu.shekhar.algorithms.amazon

import com.typesafe.scalalogging.LazyLogging

import scala.annotation.tailrec

/**
 * source : https://www.youtube.com/watch?v=5o-kdjv7FD0
 */
class StaircaseAlgorithm extends LazyLogging {

  /**
   * Calculates number of steps needed using dynamic programming
   * Time complexity O(n) because it calls recursive function n times
   * space complexity O(n) because
   * for each recursive call one stack frame is added in the stack and
   * n calls are made recursively
   *
   * @param n
   * @return
   */
  def getSteps(n: Int): Int = {
    @tailrec
    def loop(n: Int, answer: Int, accumulator1: Int, accumulator2: Int): Int = n match {
      case 0 =>
        println(s"number = $n, acc1 = $accumulator1, acc2 = $accumulator2, answer = $answer")
        answer
      case _ =>
        println(s"number = $n, acc1 = $accumulator1, acc2 = $accumulator2, answer = $answer")
        loop(n - 1, accumulator1, accumulator2, (accumulator1 + accumulator2))
    }

    println(s"Calculating number of steps for $n")
    loop(n, 0, 1, 2)
  }

}
