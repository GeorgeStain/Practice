package org.kich.practice


object MatrixEx extends App {


  type Row = List[Int]
  type SubMatrix = List[Row]


  val matrix: List[Row] = List(List(1, 2, 3), List(4, 5, 6), List(9, 8, 7))

  val listOfRowCombination: List[SubMatrix]  = matrix.sliding(2, 1).toList

  val listOfSubMatrix = listOfRowCombination.map(row => row.sliding(2, 1))

//  val results = listOfSubMatrix.flatMap()


//
//  private def getSum(arr: List[List[Row]]): Int = {
//    arr.flatMap((a: Seq[Row]) => )
//  }

  println(3 / 2)




}
