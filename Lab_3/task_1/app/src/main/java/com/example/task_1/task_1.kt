package com.example.task_1
class person {
    var name:String="name person"
    var objAdree=Adress()
    inner class Adress{
        var streetName:String="streetName"
        var city:String ="city"
        val buildingAdress = building.villa
    }
}
enum class building{
    villa,
    apartment
}

fun main(){
    println("Enum")
    var personobj=person()
    personobj.name="Marina"
    personobj.Adress().streetName="Name street"
    personobj.objAdree.city="City"
    personobj.objAdree.buildingAdress.name
    println(personobj.name)
}