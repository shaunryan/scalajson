package com.sibytes.mjson

import mjson.Json
import scala.jdk.CollectionConverters._

object GetJsonObjectValue extends App with MyJsonDocument {

  // note we're using read that returns a json object not make that returns a string.
  val json:Json = Json.read(jsonString)
  title("getValue")
  println(json.getValue)

  title("classifier - what type is it?")
  Classifier(json)

  title("In scala native map")
  // in scala native map, we convert using .asScala
  if (json.isObject){
    val kvp = json.asMap().asScala
    kvp foreach { case (k, v) =>
      println(s"$k : $v")
    }
  }

  title("Using java map")
  // using java collection - we have to handle nulls
  if (json.isObject){
    // the type isn't necessary here but left it in for understanding.
    val kvp:java.util.Map[String,Object] = json.asMap()
    kvp.forEach{case(k, v) =>
      val vi = v match {
        case null => "null"
        case _ => v.toString
      }
      println(s"$k : $vi")
    }
  }

  title("Addressing using .at() methods")
  val address = json.at("address")
  val phoneNumbers = json.at("phoneNumbers")
  val children = json.at("children")

  println(
    s"""
      |First Name = ${json.at("firstname")}
      |Last Name = ${json.at("lastname")}
      |Is Alive = ${json.at("IsAlive")}
      |Age = ${json.at("age").asInteger}
      |
      |Address
      |
      |   Street Address = ${address.at("streetAddress")}
      |   City = = ${address.at("city")}
      |   State = = ${address.at("state")}
      |   Postal Code = ${address.at("postalCode")}
      |
      |Phone Numbers
      |
      |   Type = ${phoneNumbers.at(0).at("type")}
      |   Number = ${phoneNumbers.at(0).at("number")}
      |
      |   Type = ${phoneNumbers.at(1).at("type")}
      |   Number = ${phoneNumbers.at(1).at("number")}
      |
      |Children = ${json.at("children")}
      |Number of Children = ${children.asList().size()}
      |Spouse = ${json.at("spouse")}
      |""".stripMargin)


}

object Classifier {
    def apply(json: Json) ={
      json match {
        case _ if json.isArray => println("isArray")
        case _ if json.isBoolean => println("isBoolean")
        case _ if json.isNull => println("isNull")
        case _ if json.isNumber => println("isNumber")
        case _ if json.isObject => println("isObject")
        case _ if json.isString => println("isString")
        case _ if json.isPrimitive => println("isPrimitive")
        case _ => println("None")
      }
    }
  }


