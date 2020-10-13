package com.sibytes.mjson

trait MyJsonDocument {
  val jsonString =
    """
      |{
      | "firstname":"John",
      | "lastname":"Smith",
      | "isAlive":true,
      | "age":25,
      | "address":
      |  {
      |    "streetAddress":"21 2nd Street",
      |    "city":"Bristol",
      |    "county":"Gloucestershire",
      |    "postalCode":"RG17 5TH"
      |  },
      | "phoneNumbers":[
      |  {
      |    "type":"Home",
      |    "number":"563456346"
      |  },
      |  {
      |    "type":"Office",
      |    "number":"435324535"
      |  },
      |  {
      |    "type":"Mobile",
      |    "number":"34523543"
      |  }
      | ],
      | "children":[],
      | "spouse":null
      |}
      |""".stripMargin

  def title = (t:String) =>
    println(s"""
      |***************************************************
      |$t
      |***************************************************
      |""".stripMargin)

}
