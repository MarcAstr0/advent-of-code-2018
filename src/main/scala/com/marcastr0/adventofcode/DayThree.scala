package com.marcastr0.adventofcode

case class Claim(id: Int, x: Int, y: Int, width: Int, height: Int)

object DayThree {

  def parseClaim(claim: String): Claim = {
    val claimPattern = "#(\\d+) @ (\\d+),(\\d+): (\\d+)x(\\d+)".r
    claim match {
      case claimPattern(id, x, y, w, d) => Claim(id.toInt, x.toInt, y.toInt, w.toInt, d.toInt)
    }
  }

  def getSquares(claim: Claim): Set[(Int, Int)] = {
    (for {
      i <- claim.x until (claim.x + claim.width)
      j <- claim.y until (claim.y + claim.height)
    } yield (i, j)).toSet
  }

  def overlappingSquares(a: Claim, b: Claim): Set[(Int, Int)] = getSquares(a) intersect getSquares(b)

  //FIXME this solution runs very slow, must think of a better one
  def partOne(claims: List[Claim]): Int = {
    val combinations = claims.combinations(2).toList.map(x => (x.head, x.tail.head))
    combinations.map(y => overlappingSquares(y._1, y._2)).reduce(_ union _).size
  }
}
