package com.sibytes.gson

import com.google.gson.{Gson, GsonBuilder}

object SerializingPrimitives extends App{

  val gson = new Gson()

  val name = gson.fromJson("\"John Doe\"", classOf[String])
  println(name)
  gson.toJson(256, Console.out)
  println()
  gson.toJson("<html>", Console.out)
  println()
  val gsonHtml = new GsonBuilder().disableHtmlEscaping().create()
  gsonHtml.toJson("<html>", Console.out)

}
