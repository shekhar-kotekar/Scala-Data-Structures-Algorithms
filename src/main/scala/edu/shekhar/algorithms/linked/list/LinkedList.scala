package edu.shekhar.algorithms.linked.list

import com.typesafe.scalalogging.LazyLogging

trait LinkedList[T] extends LazyLogging {
  def add(item: T): Unit

  def getHead: Option[T]

  def size: Long
}
