package com.example.randumarray

import kotlin.random.Random

fun main(){

   // var number = arrayOf(Random.nextInt(0,100))
    val arr= arrayOfNulls<Int>(100)
    for (i in 0..arr.size-1)
    {
       arr.set(i,  Random.nextInt(0,100))
        if (arr[i]!! < 10) {
            println(arr[i])
        }
    }

}