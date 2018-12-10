package com.marcastr0.adventofcode

import org.scalatest.FlatSpec

class DayFiveSpec extends FlatSpec {

  "reactWith" should "return the resulting units after they react with each other" in {
    assert(DayFive.reactWith("a", "A") == "")
    assert(DayFive.reactWith("a", "b") == "ab")
    assert(DayFive.reactWith("a", "a") == "aa")
    assert(DayFive.reactWith("A", "A") == "AA")
    assert(DayFive.reactWith("bA", "a") == "b")
    assert(DayFive.reactWith("bA", "c") == "bAc")
  }

  "applyReactions" should "apply the reactions to the polymer" in {
    assert(DayFive.applyReactions("aA") == "")
    assert(DayFive.applyReactions("abBA") == "")
    assert(DayFive.applyReactions("abAB") == "abAB")
    assert(DayFive.applyReactions("aabAAB") == "aabAAB")
    assert(DayFive.applyReactions("dabAcCaCBAcCcaDA") == "dabCBAcaDA")
  }

  "partOne" should "return the number of units that remain after fully reacting the polymer" in {
    assert(DayFive.partOne("aA") == 0)
    assert(DayFive.partOne("abBA") == 0)
    assert(DayFive.partOne("abAB") == 4)
    assert(DayFive.partOne("aabAAB") == 6)
    assert(DayFive.partOne("dabAcCaCBAcCcaDA") == 10)
  }
}
