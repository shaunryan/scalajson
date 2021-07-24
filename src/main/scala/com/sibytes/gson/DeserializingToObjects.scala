package com.sibytes.gson

object DeserializingToObjects extends App{

}

case class Person(val name:String, val age:Int){
  override def toString: String = s"$name: $age"
}
