package org.kich.practice

object MultiplyOf3And5 extends App {

  val arr = Array(1,2,3,4,5,6,7,8,9,10)

  def multiplyOf3And5(n: Int) = {
    val arr = Array.range(1, n)
    if(arr.nonEmpty) {
      arr.map {
        num => if (num % 3 == 0 | num % 5 == 0) num else 0
      }.sum
    } else 0

  }

  println(multiplyOf3And5(1000))

}

