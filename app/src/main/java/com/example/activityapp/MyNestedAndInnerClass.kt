package com.example.activityapp

class MyNestedAndInnerClass {
    private val one = 1
    private fun returnOne() : Int{
        return one
    }


    class MyNestedClass {
        fun sum(firts: Int,second : Int) : Int {
            return firts + second
        }
    }
    inner class MyInnerClass {
        fun sumTwo(number : Int) : Int {
            return number + one + returnOne()
        }
    }
}