package com.marcastr0.adventofcode

object DayTwo {

  def countLetters(input: String): Map[Char, Int] = input.toList.groupBy(identity).mapValues(_.size)

  def partOne(ids: List[String]): Int = {
    val counts = (for {
      id <- ids
    } yield (
      if (countLetters(id).filter(_._2 == 2).size > 0) 1 else 0,
      if (countLetters(id).filter(_._2 == 3).size > 0) 1 else 0
    )).foldLeft((0, 0))((a, b) => (a._1 + b._1, a._2 + b._2))
    counts._1 * counts._2
  }
}
