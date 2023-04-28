package com.mozes.objectorientedprogramming

fun main(args: Array<String>) {

    // create a new car object

    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 254

    car.show()

    println("******************************")
    println("******************************")

    var motor = Motorcycle()
    motor.type = "Motorcycle"
    motor.model = "piaggio"
    motor.maxSpeed = 110

    motor.show()


}