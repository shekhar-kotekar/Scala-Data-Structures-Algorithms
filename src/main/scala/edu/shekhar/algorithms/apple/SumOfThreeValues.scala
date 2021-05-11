package edu.shekhar.algorithms.apple

import jdk.internal.util.xml.impl.Input

import scala.annotation.tailrec

class SumOfThreeValues {

  def findTriplet(input: Array[Int], target: Int): Array[Int] = {
    val sortedInput = input.sorted
    val inputLength: Int = sortedInput.length
    println(s"sorted input: ${sortedInput.mkString(", ")}")
    for(index <- 0 to inputLength - 2) {
      var left = index + 1
      var right = inputLength - 1
      while(left < right) {
        val currentSum = sortedInput(index) + sortedInput(left) + sortedInput(right)
        currentSum match {
          case sum if sum == target =>
            return Array(sortedInput(index), sortedInput(left), sortedInput(right))
          case sum if sum < target =>
            left = left + 1
          case _ => right = right - 1
        }
      }
    }
    Array()
  }

//  @tailrec
//  private def findTripletRecursively(input: Array[Int], target: Int, left: Int, right: Int) : Array[Int] = {
//    if(left < right) {
//      input.head + input(left) + input(right) match {
//        case currentSum if currentSum == target => Array(input.head, input(left), input(right))
//        case currentSum if currentSum < target =>
//          findTripletRecursively(input, target, left + 1, right)
//        case _ => findTripletRecursively(input, target, left, right - 1)
//      }
//    } else {
//      Array()
//    }
//  }

}
