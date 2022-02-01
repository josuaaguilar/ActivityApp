package com.example.activityapp

class Visibility {
    var name: String ? = null

    fun sayMyName(){
        name?.let {
            println("Mi nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }
}