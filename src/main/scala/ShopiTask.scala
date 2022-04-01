//package main.scala
//
//import scala.collection.mutable._
//
//object ShopiTask extends App {
//
//  var store = HashMap[String, List[FileSystem]]
//
//  store("/root/dir1" -> List(File("file1"), Directory("dir2")))
//  store("/root/dir1/dir2" -> List(File("file2"), File("file3")))
//
//  trait FileSystem
//
//  case class Directory(name: String) extends FileSystem
//
//  case class File(name: String) extends FileSystem
//
//
//  def ls(path: String):List[FileSystem] = {
//    val filePattern = ".*(\\.[a-zA-z]*)".r
//    path match {
//      case filePattern => store(path)
//      case _ => ???
//    }
////    1. isFilePath
////      1.1 return list of files
////    2.isDirPath
////      2.1 return list of all
//    ???
//  }
//
//
//
//
//}
