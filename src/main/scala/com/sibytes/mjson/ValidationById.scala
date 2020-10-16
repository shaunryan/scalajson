package com.sibytes.mjson

import mjson.Json

object ValidationById extends App{

  // a simple schema that only accepts JSON objects
  // with a mandatory property id

  val schemaObj = Json.`object`("type", "object", "required", Json.array("id"))
  val schema = Json.schema(schemaObj)

  val jsonValid = Json.`object`("id", 666, "name", "Britlan")
  val jsonInvalid = Json.`object`("ID",  666, "name", "Britlan")

  val jsonValidResult = schema.validate(jsonValid)
  val jsonInvalidResult = schema.validate(jsonInvalid)

  println(jsonValidResult)
  println(jsonInvalidResult)



}
