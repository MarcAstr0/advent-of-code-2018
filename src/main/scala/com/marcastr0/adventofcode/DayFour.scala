package com.marcastr0.adventofcode

case class Record(year: Int, month: Int, day: Int, minute: Int, action: String)

object DayFour {

  def parseRecord(record: String): Record = {
    val recordPattern = "^\\[(\\d){4}-(\\d){2}-(\\d){2} \\d{2}:(\\d{2})\\] (.*)".r
    record match {
      case recordPattern(y, m, d, min, a) => Record(y.toInt, m.toInt, d.toInt, min.toInt, a)
    }
  }
}
