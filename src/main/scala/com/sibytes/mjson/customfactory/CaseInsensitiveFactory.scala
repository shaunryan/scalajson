package com.sibytes.mjson.customfactory

import mjson.Json
import mjson.Json.DefaultFactory

class CaseInsensitiveFactory extends DefaultFactory
{

  override def string(x:String) =
    new StringIJson(x).asInstanceOf[Json]

}

