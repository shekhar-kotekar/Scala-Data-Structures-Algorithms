package edu.shekhar.algorithms.dynamic.programming

import scala.annotation.tailrec

class FibonacciGenerator {

  def get(n: Int): Long = fib(n, 0, 1)

  @tailrec
  private def fib(n: Int, a: Long, b:Long) : Long = n match {
    case 0 => a
    case _ =>
      println(s"n = $n, a = $a, b = $b")
      fib(n -1, b, a+b)
  }
}
