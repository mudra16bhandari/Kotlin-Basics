import kotlin.math.pow
fun main(args: Array<String>){
    var a:Int = 3
    var b:Int = 2
    var c:Int = 20
    var d:Int = 5
    var e:Float = 2.0f //power function works for only Float and Double
    var res:Int = a+b*c/d*e.pow(4).toInt()-7
    println(res)
    // [a +  [b * {(c/d) * (e^4)}]] - 7
    //  4     3      2       1        5
    /*
    Priorities:
    Highest to Lowest
    1. ()
    2. ^ (power)
    3. *,/
    4. +,-
    5. = (assignment)
     */
}