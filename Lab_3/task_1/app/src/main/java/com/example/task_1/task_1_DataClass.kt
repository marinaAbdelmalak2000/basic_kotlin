package com.example.task_1
data class person2 (var name:String,var objAdree:Adress){
    data class Adress(var streetName:String, var city:String, val buildingAdress: building){
        //تبع الكلاس
        enum class building2{
            villa,
            apartment
        }
    }
}
fun main(){
 var objPerson2= person2("Marina **",person2.Adress("street name","city", building.apartment))
    println(objPerson2)
}