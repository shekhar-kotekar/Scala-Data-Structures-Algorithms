package edu.shekhar.algorithms.apple

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestFirstNonRepeatingCharacter extends AnyFlatSpec with Matchers {

  "First non Repeating character algorithm" should "return first non repeating character given a string" in {
    val input : String = "geeksforgeeks"
    val algo = new FirstNonRepeatingCharacter
    val expectedFirstNonRepeatingCharacter: Char = 'f'
    val actualFirstNonRepeatingCharacter: Option[Char] = algo.find(input)
    actualFirstNonRepeatingCharacter.isDefined shouldBe true
    actualFirstNonRepeatingCharacter.get shouldEqual expectedFirstNonRepeatingCharacter
  }

}
