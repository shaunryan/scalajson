package com.sibytes.mjson.customfactory

import mjson.Json

class StringIJson(val `val`:String) extends Json
{
  override def equals(obj: Any) = {
    obj match {
      case o:StringIJson => o.`val`.equalsIgnoreCase(`val`)
      case _ => false
    }
  }
}
