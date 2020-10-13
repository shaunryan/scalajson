package com.sibytes.mjson

import mjson.Json


object CreateJsonObjects extends App with MyJsonDocument {

  // read returns a json object (as opposed to make that returns a string)
  val json = Json.read(jsonString)
  println(json)

}
