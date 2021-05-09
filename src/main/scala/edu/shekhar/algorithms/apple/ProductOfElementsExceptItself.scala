package edu.shekhar.algorithms.apple

class ProductOfElementsExceptItself {

  /**
   * calculate product without using division operation
   * Algorithm:
   * 1. calculate product of items to the left of the item at index i. use below rules:
   *      a. if index is 0 or 1 then product is a[0]
   *      b. otherwise calculate product of items from a[i-1] to a[0]
   * b. calculate product of items to the right of the item at index i using below rules:
   *      a. if index == n or index == n -1 then product is a[n]
   *      b. else calculate product of items from a[i] to a[n]
   * c. for the items in the left and right array calculate product of items at index i
   * @param input
   * @return
   */
  def getProduct(input: Array[Int]): Array[Int] = {
    def prod(a: Int, b: Int): Int = {
      //println(s"$a * $b = ${a * b}")
      a * b
    }
    val leftProduct = input.scanLeft(1)(prod).slice(0, input.length)
    val rightProduct = input.scanRight(1)(prod).slice(1, input.length + 1)
    (leftProduct, rightProduct).zipped.map((left, right) => {
      left * right
    }).toArray
  }

  def getProductUsingDivision(input: Array[Int]): Array[Int] = {
    val total: Int = input.product
    println(total)
    input.map(total / _)
  }

}
