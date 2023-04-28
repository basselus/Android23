package com.mozes.objectorientedprogramming.interfaces

class Vehicles : CanGo, CanStop {

    //Let the Vehicles class inherit from the interfaces we just created
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("vehicles can stop")
    }

}