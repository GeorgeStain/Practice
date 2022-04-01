package org.kich.practice

import scala.annotation.tailrec


//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
object SmallestDivisibleBy extends App {




  def smallestDivisibleBy(upTo: Int): Long = {
    val divisibleBy = 1 to upTo
    val upper = divisibleBy.product
    val upper1 = divisibleBy.foldLeft(1)(_ * _)
//    @tailrec
//    def smallestDivisibleBy(divisibleBy: Seq[Int], ): Long = {
//      if()
//    }
    ???
  }

  def isNumberDivisible(number: Int, listOfNumbers: Seq[Int]): Boolean = {
    listOfNumbers.map(number % _).filter(_ > 0).isEmpty
  }

  def isPrimeNumber(number: Int): Boolean = {
    ???

  }

  println((1 until 10).product)

}
