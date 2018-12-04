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
  println("The first frequency the device reaches twice is "
    + DayOne.partTwo(DayOne.parseInput(dayOneInput), 0).toString)
  println

  /*
  * Solution for Day 2: https://adventofcode.com/2018/day/2
  */
  val dayTwoInput = Source.fromResource("DayTwo.txt").getLines.toList
  println("--- Day 2: Inventory Management System ---")
  println("The checksum for the list of box IDs is " + DayTwo.partOne(dayTwoInput))
  println("The common letters between the two correct box IDs are " + DayTwo.partTwo(dayTwoInput))
  println

  /*
  * Solution for Day 3: https://adventofcode.com/2018/day/3
  */
  val dayThreeInput = Source.fromResource("DayThree.txt").getLines.toList.map(DayThree.parseClaim)
  println("--- Day 3: No Matter How You Slice It ---")
  println("The number of square inches of fabric that are within two or more claims is " +
    DayThree.partOne(dayThreeInput))
  println
}
