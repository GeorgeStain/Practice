//package org.kich.practice
//
//object ParseCsv extends App {
//  val file = io.Source.fromFile("/Users/george/Downloads/Data_Engineering_Challenge/files/vehicles.csv")
//  val data: Iterator[Array[String]] = for {
//    line <- file.getLines()
//  } yield line.split(",").map(_.trim)
//
//  for (line <- data){println(line.toList.toString())}
//
//
//}
////                          [pg 0]  [pg 1]  [pg 2]      [pg 82] [pg 83
////dblist = [73, 18, 52, 19, 42, 77, 60, 39, 20, 12,..., 16, 109, 3]
////Pg 83] [pg 84][pg85]
////(page_size=2, pivot=42, page_number=2) -> [20, 12]
////(page_size=2, pivot=42, page_number=96) -> []
////
////Def func(dblist:List[Int],pageSize:Int, pivot: Int, pageNumber: Int): List[Int] = {
////  Val zeroPageIndex =
////  searchFirstPageIndex(dbList, pivot) % dblist.length
////  Val pageHead = zeroPageIndex
////  Val pageTail = zeroPageIndex + pageSize - 1
////
////  Fro {
////  pageIndex <- 0 to pageNumber
////  I <- zeroPageIndex to dbList.length, by = page_size
////  }
////  result(page_number)
////
////
////
////
////  Def searchFirstPageIndex(dbList: List[Int], pivot: Int): Int = {
////  Val index = For {
////  Index <- 0 to dblist.length
////  I <- dblist if i == pivot i
////
////  } yield index.head
////
////  }
////
////  Search for the pivot value
////  Two pointers i-> pivot index, j -> pivot index + pageSize - 1
////  J < dblist.length
