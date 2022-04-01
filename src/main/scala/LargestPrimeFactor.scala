package org.kich.practice

import java.util.concurrent.Future
import scala.annotation.tailrec
import scala.collection.immutable.Nil.tail
import scala.concurrent.Future
import scala.math.sqrt

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor o  `f the number 600851475143 ?

//Source: Wikipedia
//
//  Bertrand's postulate (actually a theorem) states that if n > 3 is an integer,
//  then there always exists at least one prime number p with n < p < 2n − 2.
//  A weaker but more elegant formulation is:
//  for every n > 1 there is always at least one prime p such that n < p < 2n.
object LargestPrimeFactor extends App {

  // Goal find the full primeTree Map(number -> prime)
  //  1.find minimal prime factor for given number
  //  1.1 start check if divided by 2
  //  1.2 if yes divide , store the prime and repeat  1.1 for result
  //  1.3 if not get next prime (3, 5, 7...) and repeat 1.1 with bigger prime


  def getLargestPrimeFactor(number: Long) = {
    require(number > 1, "There is no factorization factor for Int less then 1")
    @tailrec
    def getLargestPrimeFactor(number: Long, factor: Int): Int = {
      if (number == factor | factor > number) factor
      else getLargestPrimeFactor(number/getPrimeFactor(number), getPrimeFactor(number))
    }
    getLargestPrimeFactor(number, 2)
  }

  private def getPrimeFactor(num: Long): Int = {
    @tailrec
    def getPrimeFactor(num: Long, primeFactor: Int): Int ={
      if (isPrime(num)) return num.toInt
      if (num % primeFactor == 0) primeFactor
      else getPrimeFactor(num, getNextPrime(primeFactor))
    }
    getPrimeFactor(num, 2)
  }

  private def isPrime(n: Long): Boolean = {
    if (n <= 1) return false
    if (n <= 3) return true

    if (n % 2 == 0 | n % 3 == 0) false
    else {
      val x = sqrt(n).toInt
      val numbers = { 5 to x }.toList
      numbers.map(n % _ == 0).filter(_ == true).isEmpty
    }
  }

  private def getNextPrime(n: Int): Int = {
    @tailrec
    def nextPrime(n: Int, isPrimeNum: Boolean): Int = {
      if (isPrimeNum) n
      else {nextPrime(n + 1, isPrime(n + 1))}
    }
    nextPrime(n + 1, isPrime(n + 1))
  }

//600851475143L
  println(getLargestPrimeFactor(600851475143L))


}
