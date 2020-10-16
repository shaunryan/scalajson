package com.sibytes.mjson
import scala.io.Source
import mjson.Json

object ValidationBySchema extends App{

  // a simple schema that only accepts JSON objects
  // with a mandatory property id
  val html = Source.fromURL("http://google.com")
  val s = html.mkString

  val schemaObj = Json.`object`("type", "object", "required", Json.array("id"))
  val schema = Json.schema(schemaObj)

  val jsonValid = Json.`object`("id", 666, "name", "Britlan")
  val jsonInvalid = Json.`object`("ID",  666, "name", "Britlan")

  val jsonValidResult = schema.validate(jsonValid)
  val jsonInvalidResult = schema.validate(jsonInvalid)
  
  println(jsonValidResult)
  println(jsonInvalidResult)



}

