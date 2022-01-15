package edu.shekhar.algorithms

import com.typesafe.scalalogging.LazyLogging

class AnagramFinder extends LazyLogging {

  def isAnagram(string1: String, string2: String): Boolean = {
    val cleanString1 = string1.replaceAll(" ", "")
    val cleanString2 = string2.replaceAll(" ", "")
    if (cleanString1.length == cleanString2.length) {
      val string1FrequencyMap: Map[Char, Long] = this.getCharacterFrequency(cleanString1)
      val string2FrequencyMap: Map[Char, Long] = this.getCharacterFrequency(cleanString2)
      string1FrequencyMap.foreach(kv => {
        if (!string2FrequencyMap.contains(kv._1) || string1FrequencyMap(kv._1) != string2FrequencyMap(kv._1)) {
          logger.info(s"$string2 is NOT anagram of $string1")
          return false
        }
      })
      logger.info(s"$string2 is anagram of $string1")
      true
    } else {
      logger.info(s"$string2 is NOT anagram of $string1")
      false
    }
  }

  def getCharacterFrequency(string: String): Map[Char, Long] = {
    var frequencyMap: Map[Char, Long] = Map.empty
    string.foreach(char => {
      if (frequencyMap.contains(char)) {
        frequencyMap = frequencyMap + (char -> (frequencyMap(char) + 1L))
      } else {
        frequencyMap = frequencyMap + (char -> 1)
      }
    })
    frequencyMap
  }

}
