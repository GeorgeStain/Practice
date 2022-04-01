package org.kich.practice

//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//  By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.


import scala.annotation.tailrec

object EvenFibonacciNumbers extends App {

  def evenFibonacciNumbers(fibonacciSequence: List[Int]): Int = {
    fibonacciSequence.map(num => if(num % 2 == 0) num else 0).sum
  }


  @tailrec
  def getFibonacciSequence(fibo: List[Int], acc: Int): List[Int] = {
    if (acc >= 4000000) fibo
    else {
      val newAcc = if (fibo.takeRight(2) == 2) fibo.takeRight(2).sum + 1 else fibo.takeRight(2).sum
      getFibonacciSequence(fibo :+ fibo.takeRight(2).sum, newAcc)
    }
  }


  println(evenFibonacciNumbers(getFibonacciSequence(List(1), 1)))

}