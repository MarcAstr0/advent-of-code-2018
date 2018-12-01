package com.marcastr0.adventofcode

import scala.io.Source

object Main extends App {

  val christmasTree =
    """
      |         *
      |        /|\
      |       /*|O\
      |      /*/|\*\
      |     /X/O|*\X\
      |    /*/X/|\X\*\
      |   /O/*/X|*\O\X\
      |  /*/O/X/|\X\O\*\
      | /X/O/*/X|O\X\*\O\
      |/O/X/*/O/|\X\*\O\X\
      |        |X|
      |        |X|
      |
      |ADVENT OF CODE 2018
      |
    """.stripMargin

  println(christmasTree)

  /*
   * Solution for Day 1: https://adventofcode.com/2018/day/1
   */
  val dayOneInput = Source.fromResource("DayOne.txt").getLines.mkString("\n")
  println("--- Day 1: Chronal Calibration ---")
  println("The resulting frequency after all of the changes in frequency have been applied is "
    + DayOne.partOne(DayOne.parseInput(dayOneInput), 0).toString)
  println

}
