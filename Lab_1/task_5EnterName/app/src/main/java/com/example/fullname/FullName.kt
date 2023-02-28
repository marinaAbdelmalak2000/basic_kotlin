package com.example.fullname

fun main(){

    println("please enter first name")
    val firstName= readln()
    val isNullOrBlankf = firstName.isNullOrBlank()
    println("please enter last name")
    val lastName= readln()
    val isNullOrBlankl = firstName.isNullOrBlank()
    if(firstName.isNullOrBlank()||lastName.isNullOrBlank()){
        println("please enter firstname and lastname")
    }
    else{
        println(firstName+" "+lastName)
    }


}