package com.example.oop

const val PI=3.14

//create abstract class
abstract class Shape(){

    private var dim : Double = 0.0
    //setter and geeter ==>kotlin
    set(value){
        field=value
    }
    get(){
        return field
    }

    //abstract method
    abstract fun calcArea() : Double

}

class Rectangle(wieght:Double, height: Double) :Shape(){

    private var height =0.0
    //ordinary setter and getter
    fun setHeight(height: Double){         //.toDouble()==>convert to double
        this.height= height
    }
    fun getHeight(): Double {
        return height
    }
    private var wieght =0.0
    //ordinary setter and getter
    fun setWieght(wieght: Double){
        this.wieght= wieght
    }
    fun getWieght():Double{
        return wieght
    }

    //secondary constructor call primary constructor cal constructor shape
    constructor():this(0.0,0.0 ){
//        this.height=height
//        this.wieght=wieght
    }
    init {
        println("Init ==> ")
        this.height=height
        this.wieght=wieght
        println("Height $height and Wieght $wieght")
    }

    override fun calcArea(): Double {
        println("Rectangle class==> Area = "+height*wieght)
        return height*wieght
    }
}

class Circle() :Shape(){


    private var dim:Double=0.0
        //setter and geeter ==>kotlin
//        set(value){
//            field=value
//        }
//        get(){
//            return field
//        }

    fun setCircle(dim: Double){
        this.dim= dim
    }
    fun getCircle():Double{
        return dim
    }
    constructor(radious:Double) :this(){
        dim=radious
    }


    override fun calcArea(): Double {
        return dim*dim* PI
    }
}

class Triangle() :Shape(){

    private var height =0.0

    fun setHeight(height: Double){
        this.height= height
    }
    fun getHeight():Double{
        return height
    }
    private var B =0.0

    fun setB(B: Double){
        this.B= B
    }
    fun getB():Double{
        return B
    }
    constructor(B:Double,H:Double) :this(){
        println("secondary constructor")
        this.height=H
        this.B=B
    }

    override fun calcArea(): Double {
        return 0.5*height*B
    }
}

class Picture{
    fun sumAreas(area1:Shape,area2:Shape,area3:Shape):Double{
        return area2.calcArea()+area1.calcArea()+area3.calcArea()
    }
}



fun main(){
    println("OOP")
    println()
    var objRectangle=Rectangle()
    objRectangle.setHeight(5.0)
    objRectangle.setWieght(10.0)
    val areaR1= objRectangle.calcArea()
    println("Area R1 = $areaR1")
    println()

    var objCircle= Circle()
    objCircle.setCircle(15.0)
    val areaC1= objCircle.calcArea()
    println("Area C1 = $areaC1")
    println()

    var objTriangle= Triangle(10.0,10.0)
   // val areaT1= objTriangle.calcArea()
    objTriangle.setHeight(15.0)
    objTriangle.setB(10.0)
    val areaT1= objTriangle.calcArea()
    println("Area T1 = $areaT1")
    println()

    var objPicture =Picture()
    var sumArea=objPicture.sumAreas(Circle(15.0),Circle(20.0),Circle(5.0))
    println("Sum area =  $sumArea")
    var obj1=Circle(15.0)
    println("C1 ${obj1.calcArea()}")


    println()


    var objRectangle2=Rectangle(10.0,5.0)
    println("Rctangle area = ${objRectangle2.calcArea()}")
    println()

    var objCircle2=Circle(5.0)
    println("Circle area = ${objCircle2.calcArea()}")
    println()

    var objTriangle2=Triangle(10.0,5.0)
    println("Triangle area = ${objTriangle2.calcArea()}")
    println()
}