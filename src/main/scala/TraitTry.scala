package org.kich.practice

import scala.annotation.tailrec

object TraitTry extends App {

  case class Data(name: String, value: Int)

  val listOfData = Seq(Data("dt1", 2), Data("dt2", 5), Data("dt3", 3), Data("dt4", 8))

  val subList = Seq(Data("dt5", 1))


  val t = listOfData.filter(i => subList.map(_.name).contains(i.name))


  def foo(l: Seq[Data], sl: Seq[Data]) = {
    if (l.size >= sl.size ) {
      val bundle = l.filter(i => sl.map(_.name).contains(i.name))
      if (bundle.nonEmpty) countPattern(bundle, sl)
      else 0
    } else 0
  }

  def countPattern(ls:Seq[Data],pt:Seq[Data]) = {
    val ptMap = pt.map(i => (i.name, i.value)).toMap
    @tailrec
    def countBundle(ls:Seq[Data], acc:Int):Int = {
     if (ls.filter(i => (i.value - ptMap(i.name)) < 0).nonEmpty) acc
     else {
       val newLs = ls.map(i => i.copy(value = i.value - ptMap(i.name)))
       countBundle(newLs, acc + 1)
     }
    }
    countBundle(ls,0)
  }

  println(foo(listOfData, subList))


}
