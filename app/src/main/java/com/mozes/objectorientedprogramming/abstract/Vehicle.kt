package com.mozes.objectorientedprogramming.abstract

abstract class Vehicle {

    //Create abstract function
    abstract fun vehicleName(name:String) : String

    //non abstract function
    fun vehicleType(type:String) : String{
        return type
    }

    //abstract property
    abstract var model : Int

    //Non abstract
    var speed:Int?=null


}