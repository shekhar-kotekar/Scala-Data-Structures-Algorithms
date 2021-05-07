package edu.shekhar.algorithms.search

trait SearchAlgorithms[K] {

  /**
   * Try to find a given number is present in the given array
   * @param numberToSearch Number to be searched
   * @param array Array in which number to be searched
   * @return If number exists in the array then index of the number in given array; otherwise -1
   */
  def find(numberToSearch: K, array: Seq[K]): Int

}
