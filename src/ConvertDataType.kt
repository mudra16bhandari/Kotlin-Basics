fun main(args: Array<String>){
    var variable1:Int = 12
    var variable2:String = "22"
    var variable3:Float?
    var variable4:Double?
    var variable5:Int?

    variable5 = variable1 + variable2.toInt() //Converting variable2 from String to Integer
    println("Addition of Integer and (String to Integer): $variable5")

    variable3 = variable1.toFloat() //Converting variable1 from Integer to Float
    println("Integer to Float: $variable3")

    variable4 = variable2.toDouble() //Converting variable2 from String to Double
    println("String to Double: $variable4")

    var variable6:Float = 3.141f
    println("Float to Integer: ${variable6.toInt()}") //Converting Float to Integer

}