package com.sibytes.mjson

import mjson.Json

// modifying json objects
// we can't modify primitives this way since they are immutable

object ModifyingJsonObjects extends App{

  val jsonStr =
    """
      |{
      | "firstname" : null,
      | "lastname" : null,
      | "courses" : [null]
      |}
      |""".stripMargin

  val json = Json.read(jsonStr)
  println(json)

  // objects
  // setting
  json.set("firstname", "John")
  json.set("lastname", "Doe")
  // remove
  json.delAt("lastname")
  println(json)

  // arrays
  val jsonCourses = json.at("courses")

  // create and add
  // this is ok because it doesn' exist yet
  jsonCourses.set(0, "English")

  // add once created
  // this will fail because the array exists but the element doesn't
  // jsonCourses.add(1, "ComputerScience")
  jsonCourses.add("ComputerScience")

  // update existing
  jsonCourses.set(1, "Computer Science")
  println(json)

  // removing array element
  jsonCourses.delAt(1)
  println(json)



}
