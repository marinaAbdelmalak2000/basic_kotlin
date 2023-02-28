package com.example.coroutine

import kotlinx.coroutines.*
import java.util.prefs.PreferencesFactory
import kotlin.jvm.internal.Intrinsics.Kotlin

suspend fun fact(factorial:Int):Int{
    var counter=1;
    repeat(factorial){
        delay(100)
        counter*=(it+1)
    }
    return counter
}

suspend fun sumElement(array:Array<Int>):Int{
    var sum=0;
    for(i in array.indices){
        sum+=array[i]
        delay(100)
    }
    return sum
}


fun main(){
    println("Coroutine")

    //task_1 ===>print 1 to 10 using launch & async
 /*   runBlocking {
        var job=launch {
            var asy=async {
                repeat(10){
                    println(it+1)
                    delay(100)
                }
            }
        }
    }*/
    //task_2 ==>factorial using  suspend function
  /* runBlocking {

          var asy=async {
               fact(5)
           }
        println("Fact: "+asy.await())
   }*/

    //task_3 ===>cancel both after 10 sec
    runBlocking {
     /*   //withTimeoutOrNull
       val time= withTimeoutOrNull(10000){
           val job1=launch {
               try{
                   delay(1000000)
                   println("job1111")
               }finally {
                   println(" finally1")
               }

           }
           val job2=launch {
               try{
                   println("job2222")
                   delay(1000)
               }finally {
                   println(" finally2")
               }

           }

       }
        if(time== null){
            println("Time Out 111")
        }
*/
        //withTimeout
        runCatching {

            withTimeout(10000){
                val job1=launch {
                    delay(1000000)
                    println("job1111")
                }
                val job2=launch {
                    println("job2222")
                    delay(1000)
                }
            }

        }
            .onFailure { "Time out 222" }
            .onSuccess { "Success" }

//        try{
//            withTimeout(10000){
//                val job1=launch {
//                    delay(1000000)
//                    println("job1111")
//                }
//                val job2=launch {
//                    println("job2222")
//                    delay(1000)
//                }
//            }
//        }
//        catch (e:TimeoutCancellationException){
//            print("Time out")
//        }


//        delay(10000)
//        job1.cancel(CancellationException("Cancellation reason"))
//        println("Cancel 1")
//        job2.cancel()
//        println("Cancel 2")
    }

    //task_4 ==>sum element of array by suspend function
  /*  runBlocking {

        var asy=async {
            sumElement(arrayOf(1,2,3,4))
        }
        println("Sum element = "+asy.await())
    }*/

    //task_5 ==> join()
    val job3= runBlocking {
        val jobA=launch {
            delay(100)
            println("jobAAAAAAAA first:)")
        }

//        jobA.cancel()
        jobA.cancelAndJoin()
       // jobA.join()
        val jobB=launch {

            println("jobBBBBBBBB")
        }
    }

}
