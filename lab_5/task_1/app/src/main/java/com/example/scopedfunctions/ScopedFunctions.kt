package com.example.scopedfunctions

data class Person(var name: String, var id: Int) {
    fun printName() = "person's name :$name"
    fun printId() = "person's id :$id"
}

fun main() {
    //run, with, and apply reference the context object as a lambda receiver - by keyword this
    println("Scoped Function")

    // apply==>this(lambda receiver )(Context object), return object itself ,use object configration
    var personOne: Person? = Person("Marina", 111)
    personOne?.apply {
        name = "apply"
    }
    println("After edition ${personOne?.printName()}")


    //also ==>it(lambda argument)(Context object) ----->same apply
    var personTwo: Person? = Person("Marina", 111)
    personTwo?.also {
        it.name = "also"
        it.id = 12
    }
    println("After edition ${personTwo?.printName()}")

    //The return value is the lambda result.
    var personThree = Person("Marina", 111)
    personThree.run {
        name = "run"
    }
    println("After edition $personThree")
    //The return value is the lambda result.
    var personFour = Person("Marina", 111)
    personFour.let { it.name = "let" }
    println("After edition ${personFour}")
    //The return value is the lambda result.
    //not an extension function
    var personFive = Person("Marina", 111)
    with(personFive) {
        println("After edition ${personFive}")
    }


}