package com.marcastr0.adventofcode

import org.scalatest.FlatSpec

class DayFourSpec extends FlatSpec {

  "parseRecord" should "parse a record and return a Record object" in {
    assert(DayFour.parseRecord("[1518-11-01 00:00] Guard #10 begins shift") == Record(8, 1, 1, 0, "Guard #10 begins shift"))
    assert(DayFour.parseRecord("[1518-11-01 00:05] falls asleep") == Record(8, 1, 1, 5, "falls asleep"))
    assert(DayFour.parseRecord("[1518-11-01 00:25] wakes up") == Record(8, 1, 1, 25, "wakes up"))
    assert(DayFour.parseRecord("[1518-11-01 00:30] falls asleep") == Record(8, 1, 1, 30, "falls asleep"))
    assert(DayFour.parseRecord("[1518-11-01 00:55] wakes up") == Record(8, 1, 1, 55, "wakes up"))
    assert(DayFour.parseRecord("[1518-11-01 23:58] Guard #99 begins shift") == Record(8, 1, 1, 58, "Guard #99 begins shift"))
    assert(DayFour.parseRecord("[1518-11-02 00:40] falls asleep") == Record(8, 1, 2, 40, "falls asleep"))
    assert(DayFour.parseRecord("[1518-11-02 00:50] wakes up") == Record(8, 1, 2, 50, "wakes up"))
    assert(DayFour.parseRecord("[1518-11-03 00:05] Guard #10 begins shift") == Record(8, 1, 3, 5, "Guard #10 begins shift"))
    assert(DayFour.parseRecord("[1518-11-03 00:24] falls asleep") == Record(8, 1, 3, 24, "falls asleep"))
    assert(DayFour.parseRecord("[1518-11-03 00:29] wakes up") == Record(8, 1, 3, 29, "wakes up"))
    assert(DayFour.parseRecord("[1518-11-04 00:02] Guard #99 begins shift") == Record(8, 1, 4, 2, "Guard #99 begins shift"))
    assert(DayFour.parseRecord("[1518-11-04 00:36] falls asleep") == Record(8, 1, 4, 36, "falls asleep"))
    assert(DayFour.parseRecord("[1518-11-04 00:46] wakes up") == Record(8, 1, 4, 46, "wakes up"))
    assert(DayFour.parseRecord("[1518-11-05 00:03] Guard #99 begins shift") == Record(8, 1, 5, 3, "Guard #99 begins shift"))
    assert(DayFour.parseRecord("[1518-11-05 00:45] falls asleep") == Record(8, 1, 5, 45, "falls asleep"))
    assert(DayFour.parseRecord("[1518-11-05 00:55] wakes up") == Record(8, 1, 5, 55, "wakes up"))
  }
}
