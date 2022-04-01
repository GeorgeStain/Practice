package org.kich.practice

import scala.annotation.tailrec

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

object LargestPalindromeProduct extends App {

  //  go over all products of 3 digit numbers
  //  fix one number to 999
  //  check for each product if palindrome

  def getLargestPalindrome: Int = {
    val palindromes = for {
      i <- 100 to 999
      j <- 999 to 100 by -1
    } yield {
      if (isPalindrome(i * j)) i * j else 0
    }
    palindromes.max
  }


  def getPalindromes(prod: Int) = {
    100 to 999 map {
      _ * prod
    } filter (isPalindrome(_))

  }


  def isPalindrome(num: Int): Boolean = {
    @tailrec
    def reverseNumber(num: Int, newNum: Int): Int = {
      if (num == 0) newNum
      else {
        val digit = num % 10
        reverseNumber(num / 10, newNum * 10 + digit)
      }
    }

    val reversedNumber = reverseNumber(num, 0)
    if (num == reversedNumber) true else false
  }

  //  println(isPalindrome(112210))
  println(getLargestPalindrome)

}


