package com.example.activityapp

open class Person(name : String, age : Int): Work() , Game{

    //Funcion
    open fun work(){
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    override val game: String = "LoL"

    override fun play() {
        println("Esta persona esta jugando $game")
    }

}