package org.kich.practice

import scala.::
import scala.collection.mutable

object InterviewKit extends App {
//  val ar = Array(1, 2, 1, 2, 1, 2, 3)
//
//  val arr = Array(10, 20, 20, 10, 10, 30, 50, 10, 20)
//
//  def sockPairs(ar: Array[Int]) = {
//    ar.groupBy(identity)
//      .map(a => a._2.length / 2)
//      .filter(_ != 0)
//      .foldLeft(0)(
//        (a, b) => a + b
//      )
//  }
//
//  val path = s"UDDDUDUUDD"
//
//  def countingValleys(steps: Int, path: String): Int = {
//    var newValley = true
//    var counter = 0
//    val newPath = path.map(st => if (st.compare('U') == 0) 1 else -1)
//    newPath.toList
//      .foldLeft(0) {
//        (a, b) => {
//          if (a + b == -1 & newValley) {
//            newValley = false
//            counter += 1
//            a + b
//          } else {
//            newValley = if (a + b == 0) true else newValley
//            a + b
//          }
//        }
//      }
//    counter
//  }
//
////  println(countingValleys(path.length,path))
//
//
//  val a = List(10, -1, 9, -8, 12, 8)
//
//  def sumZero(arr: List[Int]): List[Int] = {
//    arr
//      .zipWithIndex
//      .groupBy(_._1.abs)
//      .filter(_._2.size > 1)
//      .map(_._2.map(_._2))
//      .flatten.toList
//  }
//
//  def isAllCharsUnique(str: String): Boolean = {
//    str.toCharArray.groupBy(identity).filter(lt => lt._2.length > 1).isEmpty
//  }
//
//  def isPermutationOf(str1: String, str2: String): Boolean = {
//    str1.sortWith(_ < _).equals(str2.sortWith(_ < _))
//  }
//
//  println(isPermutationOf("abc","cda"))
//
//
//
////  def foo1(arr: Array[Int]): Array[Int] = {
////    var numMap = mutable.HashMap.empty[Int,_]
////    val arrMap = arr.zipWithIndex
////    for {
////      i <- 0 to arr.length - 1
////    } if(numMap.contains(arr(i).abs)) return Array(numMap.get(arr(i)).getOrElse(0), i) else numMap()
////  }


  def revString(str: String): String = {
    var res = mutable.ListBuffer[String]()
    val charArray = str.toArray
    for {
      i <- str.length - 1 to 0 by -1
    } res += charArray(i).toString
    res.mkString
  }

  println(revString("hello"))


  def jumpingOnClouds(c: Array[Int]): Int = {
    // Write your code here

  }

}
