package com.sibytes.mjson

import mjson.Json

object CreateJsonObjectMethods extends App{

  val jsonAddress = Json.`object`(
    "streetAddress", "21 2nd Street",
          "city", "New York",
          "state", "NY",
          "postalCode", "10021-3100")

  val jsonPhone1 = Json.`object`(
    "type", "home",
          "number", "212 555-1234")

  val jsonPhone2 = Json.`object`(
    "type", "office",
    "number", "646 555-4567")

  val jsonPerson = Json.`object`(
    "firstName","John",
          "lastName", "Smith",
          "isAlive", true,
          "age", 25,
          "address", "jsonAddress",
          "phoneNumbers", Json.array(jsonPhone1, jsonPhone2),
          "children", Json.array(),
          "spouse", Json.nil(),
  )

  println(jsonPerson)

}
