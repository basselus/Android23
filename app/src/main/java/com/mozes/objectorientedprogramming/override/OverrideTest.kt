package com.mozes.objectorientedprogramming.override

fun main(args: Array<String>) {

    //create a vehicle object
    var vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()

    println("*************************")

    var car = Car()
    car.start()
    car.accelerate(150)
    car.stop()

    println("*************************")

    car.superStart()
    car.superAccelerate()
    car.superStop()




}