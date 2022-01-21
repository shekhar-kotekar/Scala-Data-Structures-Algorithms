package edu.shekhar.algorithms

import com.typesafe.scalalogging.LazyLogging

import scala.annotation.tailrec

class FactorialFinder extends LazyLogging {

  var cache: Map[Int, Int] = Map()

  def lookup(num: Int): Int = cache.getOrElse(num, 0)

  def calculateFactorial(x: Int): Int = x match {
    case x if (x == 0 || x == 1) => 1
    case x if (lookup(x) > 0) =>
      logger.info(s"Performing lookup of $x")
      lookup(x)
    case x =>
      logger.info(s"Calculating factorial for $x")
      val fact = x * calculateFactorial(x - 1)
      cache += x -> fact
      fact
  }

}
