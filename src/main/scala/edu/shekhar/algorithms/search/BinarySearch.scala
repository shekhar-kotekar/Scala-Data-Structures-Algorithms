package edu.shekhar.algorithms.search

import scala.annotation.tailrec

class BinarySearch[K <: Int] extends SearchAlgorithms[K] {
  /**
   * Try to find a given number is present in the given array
   *
   * @param numberToSearch Number to be searched
   * @param array          Array in which number to be searched
   * @return If number exists in the array then index of the number in given array; otherwise -1
   */
  override def find(numberToSearch: K, array: Seq[K]): Int = {
    loop(0, array.length - 1, array, numberToSearch)
  }

  /**
   *
   * @param first
   * @param last
   * @param array
   * @return
   */
  @tailrec
  private def loop(first: Int, last: Int, array: Seq[K], numberToSearch: K): Int = {
    if(first <= last) {
      val midPoint: Int = Math.floor((first + last) / 2).toInt
      val numberAtMid: K = array(midPoint)
      if(numberAtMid == numberToSearch) {
        midPoint
      } else if(numberAtMid > numberToSearch) {
        loop(first, midPoint - 1, array, numberToSearch)
      } else {
        loop(midPoint + 1, last, array, numberToSearch)
      }
    } else {
      -1
    }
  }
}
