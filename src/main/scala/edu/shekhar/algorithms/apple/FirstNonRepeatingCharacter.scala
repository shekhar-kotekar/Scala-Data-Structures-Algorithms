package edu.shekhar.algorithms.apple

import scala.collection.immutable.HashMap

class FirstNonRepeatingCharacter {

  def find(input: String): Option[Char] = {
    var counts: HashMap[Char, Long] = new HashMap[Char, Long]()
    input.foreach(character => {
      if(counts.contains(character)) {
        counts += (character -> (counts(character) + 1))
      } else {
        counts += (character -> 1)
      }
    })
    Some(counts.find(entry => entry._2 == 1).get._1)
  }

//
//  private val seedChar: Char = '\u0000'
//  def find(input: String): Option[Char] = this.loop(input, seedChar)
//
//  @tailrec
//  private def loop(input: String, previousCharacter: Char): Option[Char] =
//    input.headOption match {
//      case Some(head) if(previousCharacter.compareTo(seedChar) == 0 || head.compareTo(previousCharacter) == 0) =>
//        loop(input.tail, head)
//      case Some(head) if(head.compareTo(previousCharacter) != 0) => Some(head)
//      case None => Some(previousCharacter)
//    }

}
