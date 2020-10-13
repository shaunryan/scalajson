package com.sibytes.mjson

import mjson.Json

object ParseFragment extends App{

  val json = Json.read("[4, 5, {}, true, null, \"ABC\", 6]")
  println(json)
}
