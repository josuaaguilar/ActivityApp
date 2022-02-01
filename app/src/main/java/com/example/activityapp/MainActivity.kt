package com.example.activityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
typealias myListMap = MutableMap<Int,ArrayList<String>>
typealias myFun = (Int, String, myListMap) -> Boolean
typealias myNestedClassAlis = MyNestedAndInnerClass.MyNestedClass
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // enum class
        //println("Hello console")
        //enumClass()
        //nestedAndInnerClass()
        //inheritanceClass()
        //interfaces()
        //visibilityModifiers()
        //dataClass()
        //typeAliases()
        destructuringDeclaration()
    }
    enum class Direction(val dir:Int) {
        NORTH(2), SOUTH(1),EAST(-3),WEST(4);
        fun description(): String{
            return when(this){
                NORTH -> "Hacia el norte!"
                SOUTH -> "Hacia el sur!"
                EAST -> "Hacia el este!"
                WEST -> "Hacia el oeste"
            }
        }
    }
    private fun enumClass(){
        var userDirection: Direction? = null
        println(userDirection)

        userDirection = Direction.EAST
        println("Direction: $userDirection")
        println(userDirection.description())
        println(userDirection.dir)
        println(userDirection.name)
        println(userDirection.ordinal)

    }
    private fun nestedAndInnerClass() {
        //clase anidada
        val myNestedClass = myNestedClassAlis()
        val sum: Int = myNestedClass.sum(7,1)
        println("La suma es: $sum")

        //Clase Interna
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(15)
        println("La suma en InnerClass es: $sumTwo")
    }
    private fun inheritanceClass(){
        val developer = Developer("Josua",27,"Kotlin")
        developer.work()
        developer.sayLanguage()
        developer.goToWork()
        developer.drive()
        val designer = Designer("Juan",25)
        designer.work()
    }
    private fun interfaces(){
        val gamer = Person("Jos",27)
        gamer.play()
        gamer.stream()
    }
    private fun visibilityModifiers(){
        val visibility = Visibility()
        //visibility.name = "Josua"
        visibility.sayMyName()
    }
    private fun dataClass(){
        val jos = Worker("Josua",27,"Developer")
        jos.lastWork = "Vendedor"
        //Con parametros inicializados
        val santiago = Worker()

        if(jos.equals(santiago)){
            println("Son iguales")
        }else {
            println("No son iguales")
        }
        val aguilar = jos.copy(work = "Pintor")
        println(jos.toString())

        println(aguilar.toString())

        //ComponenteN -> Separa los atributos de una clase
        val (name,age,work) = jos
        println(name)
        println(age)
        println(work)
    }
    private var myMap : myListMap = mutableMapOf()
    private fun typeAliases(){
        var myNewMap: myListMap = mutableMapOf()
        myNewMap[1] = arrayListOf("Josua","Aguilar")
        myNewMap[2] = arrayListOf("Josua","A. Santiago")
        myMap = myNewMap
    }
    private fun destructuringDeclaration(){
        val (name,age,work) = Worker("Josua",27,"Developer")
        println("$name,$age,$work")

        val jos =  Worker("Josua",27,"Pintor")
        //Componente1 para name
        println(jos.component1())
        val josua = myWorker()
        val (josName,josAge,josWork) = myWorker()
        println("$josName,$josAge,$josWork")
    }
    private fun myWorker(): Worker{
        return Worker("Josua",27,"Developer")
    }
}