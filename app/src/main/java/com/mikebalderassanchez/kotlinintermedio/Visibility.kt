package com.mikebalderassanchez.kotlinintermedio

private class Visibility {

    var name: String? = null

    private fun sayMyName() {
        name?.let {
            println("Mi nombre es $it")
        } ?: kotlin.run {
            println("No tengo nombre")
        }
    }

}

open class VisibilityTwo {

    fun sayMyNameTwo() {

        val visibility = Visibility()
        visibility.name = "Mike"

    }

}

class VisibilityThree: VisibilityTwo() {

    internal val age: Int? = null

    fun sayMyNameThree() {
        sayMyNameTwo()
    }

}