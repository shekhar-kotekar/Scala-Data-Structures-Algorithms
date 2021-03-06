package edu.shekhar.algorithms.linked.list

import com.typesafe.scalalogging.LazyLogging

trait LinkedList[T] extends LazyLogging {
  def add(item: T): Unit

  def getHead: Option[T]

  def size: Long

  def search(itemToSearch: T): Option[Node[T]]

  def getIndex(dataToSearch: T): Option[Long]

  def insert(itemToInsert: T, insertIndex: Long): Boolean

  def remove(itemToRemove: T): Unit
}
