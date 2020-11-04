fun main(args: Array<String>){
    var variable1 = 3 // automatically takes variable1 as integer
    var variable2 = "Mudra" //automatically takes variable2 as String
    var variable3:Int = 2 //Specifying variable3 to be only Integer, can only take integers values
    var variable4:String = "Mudra" //Specifying variable4 to be only String, can only take String values
    var variable5:String? = null// the ? means that the variable can hold a null value
    // var variable:String = null  -> gives error
    var variable6:Float = 3.14f
    var variable7 = 3.14 // takes variable7 as double
    var variable8 = 3.14f //takes variable8 as float
    val value1 = 3 //val is immutable -> like constants, values cannot be changed
    // value1 = 5  --> gives error
    //var is mutable and its value can be changed
    println("Variable2: "+ variable2) //prints Mudra
    println("Variable2: $variable2") //can also be concatenated using $ under quotations
    variable2 = "Bhandari"
    println("Variable2: $variable2") //prints Bhandari

}