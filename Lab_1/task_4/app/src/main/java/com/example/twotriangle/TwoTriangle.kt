package com.example.twotriangle

fun main(){

    val n = readln().toInt()
    var start="*"
    var spaceStare="* "

    var space =" ".repeat(n*5)
    for(i in 0 until n){
        print(start)
        print(space.substring(0,n*3-i*2))
        print(spaceStare)
        println()
        start ="$start*"
        spaceStare="$spaceStare* "
    }
}