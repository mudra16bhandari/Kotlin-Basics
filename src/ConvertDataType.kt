package `Day 2`

fun main(args: Array<String>){
    var variable1:Int = 12
    var variable2:String = "22"
    var variable3:Float?
    var variable4:Double?
    var variable5:Int?

    variable5 = variable1 + variable2.toInt()
    println("Addition of Integer and (String to Integer): $variable5")

    variable3 = variable1.toFloat()
    println("Integer to Float: $variable3")

    variable4 = variable2.toDouble()
    println("String to Double: $variable4")

}