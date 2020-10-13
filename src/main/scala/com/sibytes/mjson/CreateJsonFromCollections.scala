package com.sibytes.mjson

import mjson.Json
import scala.jdk.CollectionConverters._
import scala.collection.immutable.HashMap

object CreateJsonFromCollections extends App{

  val weekdays = Array("Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
  println(Json.make(weekdays))

  val people = HashMap("John"->33, "Joan"->27).asJava
  println(Json.make(people))


}
