package main.scala

import scala.util.Random

object FindPage extends App {
  val db = List.fill(21)(Random.nextInt())

  def func(db: List[Int], pageNumber: Int, pageSize: Int, pivot: Int) = {
    val pivotIndex = db.indexOf(pivot)
    val pageNIndex = pageSize * pageNumber
    val realIndex = if (pageNIndex < pivotIndex ) pageNIndex + pivotIndex else pageNIndex - pivotIndex
    db.slice(realIndex, realIndex + pageSize)
  }


  val db1 = List(1, 3, 10, 8, 15, 42, 16, 13, 83, 75)

  println(func(db1, 2, 2, 8))

}
