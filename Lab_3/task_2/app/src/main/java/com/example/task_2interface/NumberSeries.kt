package com.example.task_2interface

interface NumberSeries
{
    var start : Int
    var current : Int
    fun getNext():Int
    fun rest()
}

class ByTwos:NumberSeries{
    override var start: Int =0
    get(){
        return field
    }
   set(value) {
       field=value
       current=value
   }
    override var current: Int =0
        get() {return field}
        set(value) {
            field=value
        }

    override fun getNext(): Int {
        current+=2
        return current
    }

    override fun rest() {
        current=start
    }
}


class ByThree:NumberSeries{
    override var start: Int =0
        get(){
            return field
        }
        set(value) {
            field=value
            current=value
        }
    override var current: Int =0
        get() {return field}
        set(value) {
            field=value
        }

    override fun getNext(): Int {
        current+=3
        return current
    }

    override fun rest() {
        current=start
    }
}

fun main(){
    var twos=ByTwos()
    twos.start=10
    repeat(10){
        println(twos.getNext())
    }
    twos.rest()
    println(twos.getNext())

    println("========================================")
    var three :NumberSeries =ByThree() //==>refrence interface
    three.start=10
    repeat(10){
        println(three.getNext())
    }
    three.rest()
    println(three.getNext())
}