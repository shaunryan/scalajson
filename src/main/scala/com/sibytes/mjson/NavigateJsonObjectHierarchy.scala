package com.sibytes.mjson

import mjson.Json

class NavigateJsonObjectHierarchy extends App{

  val jsonStr =
    """
      |{
      | "propName" : "propValue",
      | "propArray" : [
      |   {"element1":"value1"}
      |   {"element2":"value2"}
      | ]
      |}
      |""".stripMargin

  val json = Json.read((jsonStr))
  val jsonElement1 = json.at("propArray").at(0)

  println(jsonElement1)
  println(jsonElement1.up())
  println(jsonElement1.up().up())
  println(jsonElement1.up().up().up())
}
