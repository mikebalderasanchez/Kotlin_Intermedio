package com.mikebalderassanchez.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kotlin Intermedio

        // Enum Classes
        //enumClasses()

        // Nested and Inner Classes
        //nestedAndInnerClasses()

        // Class Inheritance
        //classInheritance()

        // Interfaces
        //interfaces()

        // Visibility Modifiers
        //visibilityModifiers()

        // Data Classes
        dataClasses()

    }

        //Leccion 1: Enum Classes


        enum class Direction(val dir : Int) {

            NORTH(dir = 1), SOUTH(dir = -1), EAST(dir = 1), WEST(dir = -1);

            fun description() : String {

                return when  (this){
                    NORTH -> "La direccion es NORTE"
                    SOUTH -> "La direccion es SUR"
                    EAST -> "La direccion es ESTE"
                    WEST -> "La direccion es OESTE"
                }
            }
        }

        private fun enumClasses() {

            //Asignacion de valores
            var userDirection: Direction? = null
            println("Direccion: $userDirection")

            userDirection = Direction.NORTH
            println("Direccion: $userDirection")

            userDirection = Direction.WEST
            println("Direccion: $userDirection")

            //Propiedades por defect
            println("Propiedad name: ${userDirection.name}")
            println("Propiedad ordinal: ${userDirection.ordinal}")

            //Funciones
            println(userDirection.description())

            //Inicializacion
            println(userDirection.dir)

        }

        // Leccion 2: Nested and Inner Classes

        private fun nestedAndInnerClasses() {

            // Clase anidada (nested)
            val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
            val sum = myNestedClass.sum(10, 5)
            println("El resultado de la suma es $sum")

            // Clase Interna (inner)
            val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
            val sumTwo = myInnerClass.sumTwo(10)
            println("El resultado de sumar dos es $sumTwo")
        }

        // Leccion 3: Class Inhertitance

        private fun classInheritance() {

            val person = Person("Mia", 5)

            val programmer = Programmer("Mke", 17, "Kotlin")
            programmer.work()
            programmer.sayLanguage()
            programmer.goToWork()
            programmer.drive()

            val designer = Designer("Ari", 16)
            designer.work()
        }

        // Leccion 4: Interfaces

        private fun interfaces() {

            val gamer = Person("Mike", 17)
            gamer.play()
            gamer.stream()
        }

        // Leccion 5: Modificadores de visibilidad

        private fun visibilityModifiers() {

            //val visivility = Visibility()
            //visivility.name = "Mike"
            //visivility.sayMyName()

            val visibilityTwo = VisibilityTwo()
            visibilityTwo.sayMyNameTwo()
        }

        private fun dataClasses() {
            val mike = Worker("Mike", 17, "Programmer")
            mike.lastWork = "Estudiante"

            val Ari = Worker()

            val Mike = Worker("Mike", 17, "Programmer")
            mike.lastWork = "Estudiante"

            // equals y hashCode
            if (mike == Mike) {
                println("Son iguales")
            } else {
                println("No son iguales")
            }

            // toString
            println(mike.toString())

            // copy
            val mike2 = mike.copy(age = 18)
            println(mike.toString())
            println(mike2.toString())

            // componentN
            val (name, age) = mike
            println(name)
            println(age)
        }
}