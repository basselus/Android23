package com.mozes.objectorientedprogramming.override

open class Vehicle {

    open fun start(){
        println("vehicle has started")
    }
    open fun accelerate(speed:Int){
        println("vehicle accelerates at $speed .")
    }

    open fun stop(){
        println("vehicle has stopped!")
    }

}