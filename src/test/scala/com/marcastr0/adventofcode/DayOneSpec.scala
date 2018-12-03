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

  "partTwo" should "return the first frequency that is reached twice" in {
    assert(DayOne.partTwo(List(1, -2, 3, 1), 0) == 2)
    assert(DayOne.partTwo(List(1, -1), 0) == 0)
    assert(DayOne.partTwo(List(3, 3, 4, -2, -4), 0) == 10)
    assert(DayOne.partTwo(List(7, 7, -2, -7, -4), 0) == 14)
  }

}
