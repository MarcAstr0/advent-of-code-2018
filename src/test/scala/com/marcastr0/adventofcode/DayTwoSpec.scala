package com.marcastr0.adventofcode

import org.scalatest.FlatSpec

class DayTwoSpec extends FlatSpec {

  "countLetters" should "count the ocurrences of each letter in a string" in {
    assert(DayTwo.countLetters("abcdef") equals Map('a' -> 1, 'b' -> 1, 'c' -> 1, 'd' -> 1, 'e' -> 1, 'f' -> 1))
    assert(DayTwo.countLetters("bababc") equals Map('a' -> 2, 'b' -> 3, 'c' -> 1))
    assert(DayTwo.countLetters("abbcde") equals Map('a' -> 1, 'b' -> 2, 'c' -> 1, 'd' -> 1, 'e' -> 1))
    assert(DayTwo.countLetters("abcccd") equals Map('a' -> 1, 'b' -> 1, 'c' -> 3, 'd' -> 1))
    assert(DayTwo.countLetters("aabcdd") equals Map('a' -> 2, 'b' -> 1, 'c' -> 1, 'd' -> 2))
    assert(DayTwo.countLetters("abcdee") equals Map('a' -> 1, 'b' -> 1, 'c' -> 1, 'd' -> 1, 'e' -> 2))
    assert(DayTwo.countLetters("ababab") equals Map('a' -> 3, 'b' -> 3))
  }

  "partOne" should "calculate the checksum for a list of IDs" in {
    assert(DayTwo.partOne(List("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab")) == 12)
  }

  "differByOne" should "return true if the 2 strings differ by exactly one character and false if not" in {
    assert(!DayTwo.differByOne("abcde", "axcye"))
    assert(DayTwo.differByOne("fghij", "fguij"))
  }

  "partTwo" should "return the commen letters between the two correct box IDs" in {
    assert(DayTwo.partTwo(List("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")) == "fgij")
  }
}
