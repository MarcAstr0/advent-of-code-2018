package com.marcastr0.adventofcode

object DayOne {

  def parseInput(input: String): List[Int] = {
    input.split("\n").map(x => x.toList.head match {
      case '+' => x.tail.mkString.toInt
      case '-' => x.tail.mkString.toInt * -1
    }).toList
  }

  def partOne(freqChanges: List[Int], initialFreq: Int): Int = freqChanges.foldLeft(initialFreq)(_ + _)

  def partTwo(freqChanges: List[Int], initialFreq: Int): Int = {
    var foundDuplicate = false
    var freq = initialFreq
    var i = 0
    var resultingFreq = Set(initialFreq)
    while(!foundDuplicate) {
      freq += freqChanges(i % freqChanges.length)
      if (resultingFreq.contains(freq)) {
        foundDuplicate = true
      }
      resultingFreq += freq
      i += 1
    }
    freq
  }

}
