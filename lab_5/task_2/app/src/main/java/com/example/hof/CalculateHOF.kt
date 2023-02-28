package com.example.hof

val sum ={num1:Int,num2:Int->num1+num2}
val sub ={num1:Int,num2:Int->num1-num2}
val mult ={num1:Int,num2:Int->num1*num2}
val dive ={num1:Int,num2:Int->
    if(num2!=0)
        num1/num2
    else{0}
}

fun calculator (num1:Int,num2:Int,operator:(Int,Int)->Int):Int{
    return operator(num1,num2)
}

fun main(){
    println("HOF")
    println(calculator(10,1, sum))
}