package com.mozes.objectorientedprogramming

class MySecondCars {

    var name : String? = null
    var model : Int? = null
    //private var model : Int? = null by making the object private we won't be able to change its property value (this is encapsulation)
     //   private set // we decide not to be able to set new values
     //           get // we decide to allow getting the values

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model


    }

}