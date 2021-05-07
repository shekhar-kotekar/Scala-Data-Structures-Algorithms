package edu.shekhar.algorithms.dynamic.programming

import scala.annotation.tailrec

class FibonacciGenerator {

  def get(n: Int): Int = {
    loop(n, 0 , 1)
  }

  @tailrec
  private def loop(n: Int, a: Int, b: Int): Int = n match {
    case 0 => a
    case 1 => b
    case _ => loop(n - 1, b, a + b)
  }

}
