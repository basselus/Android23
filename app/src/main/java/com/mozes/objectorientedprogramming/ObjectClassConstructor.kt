package com.mozes.objectorientedprogramming

fun main(args: Array<String>) {


    // Creating an object from class Cars

    /*var myCar = Cars()
    myCar.name = "ferrari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name= "Mercedes"
    myCar2.model = 1976

    println("This is a ${myCar.name} and its model is ${myCar.model}")
    println("This is a ${myCar2.name} and its model is ${myCar2.model}")

    */

    // Creating an object from class MyCars (we use he primary constructor)

    var myNewCAr = Mycars("Volvo", 2012)
    //println("This is a ${myNewCAr.name} and its model is ${myNewCAr.model}")



    // Creating an object from class MySecondCars (we use the secondary constructor)
    var mySecondCar = MySecondCars("Citroen", 2017)

    mySecondCar.name = "Opel"
    mySecondCar.model = 2001 // set operation

    println("This is a ${mySecondCar.name} and its model is ${mySecondCar.model}") // get operation
}