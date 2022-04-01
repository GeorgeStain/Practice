package org.kich.practice

import scala.util.Try

object AmazonTry extends App {


//  def searchSuggestions(repository: Array[String], customerQuery: String): Array[Array[String]] = {
//    customerQuery.toList.foldLeft(Array.empty[String]{
//      (a:Char, b:Char) => {
//        if((a.toString+b).length > 2) {
//          getSuggestions(repository, a.toString+b)
//        } else {""}
//      }
//    }
//  }
//
//  private def getSuggestions(repo: Array[String],query: String) = {
//   repo.filter(q => q.contains(query))
//  }
//
//  val t = "mouse"
//
//  println(List("a","c","aa","ab").sorted)
//
//  t.exists("a")
  val m = Map("aaaaaa"-> 3, "bb" -> 55)

  println(m.keySet.takeWhile(s => s.contains("aaaa")).mkString)

}
