package main.scala


import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.jackson.Serialization.read
import org.json4s.native.JsonMethods._

import scala.io.Source


object Interview extends App {

  implicit val formats = DefaultFormats

  val url = s"https://theunitedstates.io/congress-legislators/legislators-current.json"

  val path = s"/Users/george/PycharmProjects/Interview1/resource/data.json"


  val rawDataFromFile = Source.fromFile(path).mkString


  val rawDataFromUrl = Source.fromURL(url).mkString

//    val parsedJsonFromFile = parse(rawDataFromFile).filter((p: JValue) => ((p \ "bio") \ "gender") == "F")
//  val parsedJsonFromFile = parse(rawDataFromFile).asInstanceOf[List[Map[String, String]]]


  val parsedJsonFromFile: JValue = parse(rawDataFromFile)

  val parsedJsonFromUrl: JValue = parse(rawDataFromUrl)


  val jsonString = compact(render(parsedJsonFromUrl))

  val dt = read[List[Person]](rawDataFromUrl)

  val dtt = dt.filter(_.bio.gender == "F")

  case class Data(listOfPersons: List[Person])

  case class Person(bio: Bio, terms: List[Term])

  case class Bio(birthday: String, gender: String)

  case class Term(`type`: String, start: String, end: String)




  println(read[List[Person]](rawDataFromFile))










//  for {
//    JArray(objList) <- parsedJsonFromFile
//    JObject(obj) <- objList
//
//  }  yield println(obj)







}
