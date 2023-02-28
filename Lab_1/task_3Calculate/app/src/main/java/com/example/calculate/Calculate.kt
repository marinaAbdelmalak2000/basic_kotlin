package com.example.calculate

fun main(){
    println("Enter number one ")
    val number1= readln().toIntOrNull()
    println("Enter number two ")
    val number2= readln().toIntOrNull()
    println("Enter operation ")
    val operation= readln()
//
//    if(number2!=null &&number1!=null){
//        if(operation=="+"){
//            val sum =(number1+number2)
//            println("sum = "+ sum)
//        }
//        else if(operation=="-"){
//            val sub=(number1-number2)
//            println("sub = "+ sub)
//        }
//        else if(operation=="*"){
//            val mult=number2*number1
//            println("mult = "+ mult)
//        }
//        else{
//            if(number2==0){
//                println("invaled")
//            }
//            else{
//               val sub=number1/number2
//                println("sub "+sub)
//            }
//        }
//    }
//    else{
//        print("please enter integer number ")
//    }
//
    if(number2!=null &&number1!=null) {
        when (operation) {
            "+" -> {
                val sum = (number1 + number2)
                println("sum = " + sum)
            }
            "-" -> {
                val sub=(number1-number2)
                println("sub = "+ sub)
            }
            "*" ->{
                val mult=number2*number1
                println("mult = "+ mult)
            }
            else -> {
                if(number2==0){
                println("invaled")
                }
                else{
                   val sub=number1/number2
                    println("sub "+sub)
                }
            }
        }
    }
}