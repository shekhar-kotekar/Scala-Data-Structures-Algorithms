package edu.shekhar.algorithms.dynamic.programming

object UniquePaths {

  def findUniquePaths(m: Int, n: Int): Int = {
    val dp = Array.ofDim[Int](m, n)
    for (i <- 0 until m) {
      for (j <- 0 until n) {
        if (i == 0 || j == 0) {
          dp(i)(j) = 1
          println(s"if :: dp[$i][$j] = ${dp(i)(j)}")
        } else {
          println(s"else :: i = $i, j = $j")
          println(s"dp(i - 1)(j) = ${dp(i - 1)(j)}, dp(i)(j - 1) = ${dp(i)(j - 1)}")
          dp(i)(j) = dp(i - 1)(j) + dp(i)(j - 1)
          println(s"else :: dp[$i][$j] = ${dp(i)(j)}")
        }
      }
    }
    dp(m - 1)(n - 1)
  }

  def main(args: Array[String]): Unit = {
    // void == Unit
    val m = 3
    val n = 4
    val uniquePaths = findUniquePaths(m, n)
    println(s"unique paths: $uniquePaths")
  }

}
