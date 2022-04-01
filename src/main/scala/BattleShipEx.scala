package org.kich.practice

object BattleShipEx extends App {

  val board = Array(
    "..x..xx...",
    "......x...",
    "..........",
    "..x.xx....",
    "..x..x..xx",
    "..x.......",
    "......xx..",
    "..x....x..")


  def countShips(b: Array[String]): Array[Int] = {
    val res = Array.fill(3)(0)
    for {
      col <- 0 to b(0).length - 1
      row <- 0 to b.length - 1
    } {
      if (b(row).charAt(col).compare('x') == 0) {
        getShipType(row, col, b) match {
          case 1 => res(0) = res(0) + 1
          case 2 => res(1) = res(1) + 1
          case 3 => res(2) = res(2) + 1
        }
      }
    }
    res
  }

  def getShipType(x: Int, y: Int, board: Array[String]): Int = {
    if(x < 0 || y < 0 || x > board.length - 1  || y > board(x).length - 1 || board(x).charAt(y).compare('x') != 0) 0
    else {
      board(x) = board(x).zipWithIndex.map(c => if (c._2 == y) "." else c._1).mkString
      1 + (getShipType(x, y + 1, board) + getShipType(x + 1, y, board) + getShipType(x - 1, y, board))
    }
  }


  println(countShips(board).mkString(" "))


}
