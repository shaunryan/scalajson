package com.sibytes.gson

import java.text.DateFormat

import com.google.gson.{FieldNamingPolicy, Gson, GsonBuilder}

object IntroToGson extends App{

  val gson1 = new Gson()
  val gson2 = new GsonBuilder()
//    .registerTypeAdapter(Id.class, new IdTypeAdapter())
    .serializeNulls() // by default nulls are skipped.
    .setDateFormat(DateFormat.LONG)
    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
    .setPrettyPrinting()
    .setVersion(1.0)
    .create()


}
