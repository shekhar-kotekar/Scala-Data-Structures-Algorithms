package edu.shekhar.algorithms.dynamic.programming

import scala.annotation.tailrec
import scala.collection.immutable.LazyList.cons

class FibonacciGenerator {

  /**
   * This implementation uses accumulator which saves intermediate results and thus
   * saves us from calling function for leaf nodes again and again
   * Time complexity of this algorithm is O(n)
   * Space complexity is O(n)
   *
   * @param n
   * @return
   */
  def get(n: Int): Long = {
    @tailrec
    def loop(n: Int, intermediate: Long, accumulator: Long): Long = n match {
      case 1 =>
        println(s"n = $n, intermediate = $intermediate, accumulator = $accumulator")
        accumulator
      case _ =>
        println(s"n = $n, intermediate = $intermediate, accumulator = $accumulator")
        loop(n - 1, accumulator, intermediate + accumulator)
    }

    loop(n, 0, 1)
  }


  /**
   * This implementation does not use dynamic programming and
   * recomputes results for sub problems repeatedly
   * LEVEL - 1                                        fib(5)
   * LEVEL - 2                 fib(4)                                 fib(3)
   * LEVEL - 3        fib(3)              fib(2)             fib(2)              fib(1)
   * LEVEL - 4 fib(2)        fib(1)     fib(1)        fib(1)
   * LEVEL - 5 fib(1)
   *
   * Time complexity of this function is O(2^n) because
   * - each recursive call to fib() is placed into the stack and
   * - at each level in the tree number of function calls are multiplied by 2
   *
   * Space complexity of this function is O(n) because
   * - at any time only one branch is getting evaluated and
   * - height of tree = n
   *
   * @param n
   * @return
   */
  def naiveFib(n: Int): Long = {
    if (n < 2) {
      1
    } else {
      println(s"n = $n")
      naiveFib(n - 1) + naiveFib(n - 2)
    }
  }

}
