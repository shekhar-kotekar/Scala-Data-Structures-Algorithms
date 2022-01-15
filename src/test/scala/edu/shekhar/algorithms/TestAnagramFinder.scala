package edu.shekhar.algorithms

class TestAnagramFinder extends TestWrapper {

  "Anagram finder" should "return true if two strings are anagrams of each other" in {
    val anagramFinder: AnagramFinder = new AnagramFinder()
    val string1 = "apple"
    val string2 = "pplea"
    anagramFinder.isAnagram(string1, string2) shouldEqual true
  }

  it should "return false if two strings are not anagrams of each other" in {
    val anagramFinder: AnagramFinder = new AnagramFinder()
    val string1 = "apple"
    val string2 = "pplea not anagram"
    val result: Boolean = anagramFinder.isAnagram(string1, string2)
    result shouldEqual false
  }

}
