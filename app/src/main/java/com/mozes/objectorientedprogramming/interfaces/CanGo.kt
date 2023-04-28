package com.mozes.objectorientedprogramming.interfaces

interface CanGo {

    fun go(){
        println("vehicles can go")
    }

    // you can't initialize a varibale created within interface
    val name:String

}