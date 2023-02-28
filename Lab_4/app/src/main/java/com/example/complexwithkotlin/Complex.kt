package com.example.complexwithkotlin

data class Complex (val real:Int ,val img:Int=0){

    constructor():this(0,0)

     operator fun plus(operant2:Complex):Complex{
        return Complex(real=real+operant2.real,img=img+operant2.img)
    }
    //single function
    infix operator fun minus(operant2: Complex)=Complex(real=real-operant2.real,img=img-operant2.img)
}
//extention function
fun Complex.printComplex(){
    if(img>0){
        println("$real + $img i")
    }
    else if(img==0){
        println("$real")
    }
    else
        println("$real $img i")
}

fun main(){
    println("Function")
    var operant1=Complex(1,3)
    var operant2=Complex(img = 3, real = 4)

    (operant1+operant2).printComplex()
    (operant1-operant2).printComplex()
}