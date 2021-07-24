package com.sibytes.mjson

import mjson.Json

object AppendingToJsonObjects extends App {

  val jsonStr =
    """
      |{
      | "firstname" : "John",
      | "courses": ["English"]
      |}
      |""".stripMargin
  val json = Json.read(jsonStr)

  val jsonAppendObjStr =
    """
      |{
      | "initial": "P",
      | "lastName": "Doe"
      |}
      |""".stripMargin
  val jsonObj = Json.read(jsonAppendObjStr)

  val jsonAppendArrStr =
    """
      |["French", "Spanish"]
      |""".stripMargin
  val jsonArr = Json.read(jsonAppendArrStr)

  println(json)
  println("")

  json.`with`(jsonObj)
  println(json)
  println("")

  json.at("courses").`with`(jsonArr)
  println(json)



}
