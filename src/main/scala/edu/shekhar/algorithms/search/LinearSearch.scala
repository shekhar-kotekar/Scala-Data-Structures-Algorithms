package edu.shekhar.algorithms.search

import scala.annotation.tailrec

class LinearSearch[K] extends SearchAlgorithms[K] {
  /**
   * Try to find a given number is present in the given array
   *
   * @param numberToSearch Number to be searched
   * @param array          Array in which number to be searched
   * @return If number exists in the array then Some(index of the number) in given array; otherwise None
   */
  override def find(numberToSearch: K, array: Seq[K]): Int = {
    loop(numberToSearch, array, 0)
  }

  /**
   * If list has more elements then
   *      If number to search is present at the head location then return current index;
   *      otherwise increase current index by 1 and recursive call itself with remaining tail
   * else
   *      return value of current index as it is
   *
   * @param numberToSearch
   * @param items
   * @param currentIndex
   * @return
   */
  @tailrec
  private def loop(numberToSearch: K, items: Seq[K], currentIndex: Int): Int = items match {
    case head :: _ if head == numberToSearch => currentIndex
    case head :: tail if head != numberToSearch => loop(numberToSearch, tail, currentIndex + 1)
    case Nil => -1
  }

}
