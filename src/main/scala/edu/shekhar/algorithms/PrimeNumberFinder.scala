package edu.shekhar.algorithms

import com.typesafe.scalalogging.LazyLogging

object PrimeNumberFinder extends LazyLogging {

  def main(args: Array[String]): Unit = {
    logger.info(primes.take(15).toList.toString())
  }

  val primes: LazyList[Int] = 2 #:: LazyList.from(3).filter(x => {
    logger.info(s"x = $x, square root x = ${math.sqrt(x)}")
    val squareRootOfPrimes = primes.takeWhile(y => {
      logger.debug(s"y = $y, $y <= square root of $x ?? ${y <= math.sqrt(x)}")
      y <= math.sqrt(x)
    })
    logger.info(s"list of numbers which are less than square root of x = $x => ${squareRootOfPrimes.toList}")
    val exists: Boolean = !squareRootOfPrimes.exists(y => {
      logger.info(s"$x is divisible by $y == 0? ${x % y == 0} (if true then $x is not a prime number)")
      x % y == 0
    })
    logger.info(s"$x? is prime? $exists")
    exists
  })

}
