
fun main(args:Array<String>){

    print("Enter name: ")
    var name = readLine() //reads the whole line as String
    print("Enter age: ")
    var age:Int = readLine()!!.toInt() // !! converts any value to a non-null type and throws an exception if the value is null
    println("Name: $name")
    print("Age: $age")

}