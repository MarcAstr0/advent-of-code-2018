package com.marcastr0.adventofcode

object DayFive {

  def reactWith(a: String, b: String): String = {
    if (a == "") b
    else if (a.reverse.head == b.head) a + b
    else if (a.reverse.head.isUpper) {
      if (b.toUpperCase.head == a.reverse.head) a.reverse.tail.reverse.mkString else a + b
    } else {
      if (b.toLowerCase.head == a.reverse.head) a.reverse.tail.reverse.mkString else a + b
    }
  }

  def applyReactions(polymer: String): String = polymer.toList.map(_.toString).reduce(reactWith)

  def partOne(polymer: String): Int = applyReactions(polymer).length
}
