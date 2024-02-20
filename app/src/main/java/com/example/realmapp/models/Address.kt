package com.example.realmapp.models

import io.realm.kotlin.types.EmbeddedRealmObject
import io.realm.kotlin.types.RealmObject

class Address:EmbeddedRealmObject{
    var fullName:String = ""
    var street:String = ""
    var houseNumber:Int = 0
    var zip:Int  = 0
    var city:String = ""
    var teacher: Teacher? = null
}