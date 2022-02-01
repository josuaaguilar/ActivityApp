package com.example.activityapp

class Developer(val name:String,age:Int, val language : String) : Person(name,age), Vehicle {

    override fun work() {
        println("$name, está trabajando en $language")
    }
    fun sayLanguage(){
        println("Me gusta $language")
    }

    override fun drive() {
        println("$name está manejando al trabajo")
    }

}