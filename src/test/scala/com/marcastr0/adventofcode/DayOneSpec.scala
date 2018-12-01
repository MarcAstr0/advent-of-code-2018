package com.marcastr0.adventofcode

import org.scalatest.FlatSpec

class DayOneSpec extends FlatSpec {

  "parseInput" should "convert the string input to a list of integers" in {
    val input =
      """+1
        |+1
        |-2""".stripMargin
    assert(DayOne.parseInput(input) == List(1, 1, -2))
  }

  "partOne" should "return the correct resulting frequency" in {
    assert(DayOne.partOne(List(1, 1, 1), 0) == 3)
    assert(DayOne.partOne(List(1, 1, -2), 0) == 0)
    assert(DayOne.partOne(List(-1, -2, -3), 0) == -6)
  }

}
