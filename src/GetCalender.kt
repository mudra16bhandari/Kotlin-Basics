import java.util.*

fun main(args: Array<String>){
    //gets details from the system
    var year:Int = Calendar.getInstance().get(Calendar.YEAR)
    var mon:Int = Calendar.getInstance().get(Calendar.MONTH)
    var day:Int = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    println("$day / $mon / $year")
}