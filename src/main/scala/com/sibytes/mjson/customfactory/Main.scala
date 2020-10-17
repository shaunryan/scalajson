package com.sibytes.mjson.customfactory

import mjson.Json

object Main extends App {

  Json.setGlobalFactory(new CaseInsensitiveFactory())
  val json1 = Json.read("\"abc\"")
  val json2 = Json.read("\"abc\"")
  val json3 = Json.read("\"Abc\"")

  println(json1.equals(json2))
  println(json1.equals(json3))
}