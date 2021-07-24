package com.sibytes.mjson
import scala.io.Source
import mjson.Json

object ValidationBySchema extends App{

  val schemaStrUrl = Source.fromURL("https://raw.githubusercontent.com/shaunryan/scalajson/main/files/mjson_schema.json").mkString
  val schemaStrFile = Source.fromFile("./files/mjson_schema.json").mkString

  val json1 = Json.read("""{"name":"John Doe","age":35}""")
  val json2 = Json.read("""{"name":"John Doe","age":65}""")
  val json3 = Json.read("""{"name":"John Doe","age":35}""")
  val json4 = Json.read("""{"age":35}""")

  val schema = Json.schema(Json.read(schemaStrFile))

  println(schema.validate(json1))
  println(schema.validate(json2))
  println(schema.validate(json3))
  println(schema.validate(json4))

}

