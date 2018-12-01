package com.marcastr0.adventofcode

object DayOne {

  def parseInput(input: String): List[Int] = {
    input.split("\n").map(x => x.toList.head match {
      case '+' => x.tail.mkString.toInt
      case '-' => x.tail.mkString.toInt * -1
    }).toList
  }

  def partOne(freqChanges: List[Int], initialFreq: Int): Int = freqChanges.foldLeft(initialFreq)(_ + _)

}
