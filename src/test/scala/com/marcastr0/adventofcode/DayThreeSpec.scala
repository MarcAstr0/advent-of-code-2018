package com.marcastr0.adventofcode

import org.scalatest.FlatSpec

class DayThreeSpec extends FlatSpec {

  "parseClaim" should "parse a claim string and convert it to a Claim object" in {
    assert(DayThree.parseClaim("#123 @ 3,2: 5x4") == Claim(123, 3, 2, 5, 4))
    assert(DayThree.parseClaim("#1 @ 1,3: 4x4") == Claim(1, 1, 3, 4, 4))
    assert(DayThree.parseClaim("#2 @ 3,1: 4x4") == Claim(2, 3, 1, 4, 4))
    assert(DayThree.parseClaim("#3 @ 5,5: 2x2") == Claim(3, 5, 5, 2, 2))
  }

  "getSquares" should "get the set of squares of fabric that correspond to the claim" in {
    val claim = DayThree.parseClaim("#3 @ 5,5: 2x2")
    assert(DayThree.getSquares(claim) == Set((5, 5), (6, 5), (5, 6), (6, 6)))
  }

  "overlappingSquares" should "count the number of squares of fabric that overlap between 2 claims" in {
    val claim1 = DayThree.getSquares(DayThree.parseClaim("#1 @ 1,3: 4x4"))
    val claim2 = DayThree.getSquares(DayThree.parseClaim("#2 @ 3,1: 4x4"))
    val claim3 = DayThree.getSquares(DayThree.parseClaim("#3 @ 5,5: 2x2"))
    assert(DayThree.overlappingSquares(claim1, claim2) == Set((3, 3), (3, 4), (4, 3), (4, 4)))
    assert(DayThree.overlappingSquares(claim1, claim3) == Set())
    assert(DayThree.overlappingSquares(claim1, claim3) == Set())
  }

  "partOne" should "count how many square inches of fabric are within two or more claims" in {
    val claim1 = DayThree.parseClaim("#1 @ 1,3: 4x4")
    val claim2 = DayThree.parseClaim("#2 @ 3,1: 4x4")
    val claim3 = DayThree.parseClaim("#3 @ 5,5: 2x2")
    val claims = List(claim1, claim2, claim3)
    assert(DayThree.partOne(claims) === 4)
  }
}
