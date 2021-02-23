fun main(args:Array<String>){

    print("Enter n1: ")
    var n1:Float = readLine()!!.toFloat() //Taking user input as a float and making sure it is not null
    print("Enter n2: ")
    var n2:Float = readLine()!!.toFloat() //Taking user input as a float and making sure it is not null
    var result:Float?
    result = n1+n2 //Addition
    println("Sum: $result")
    result = n1-n2 //Subtraction
    println("Difference: $result")
    result = n1*n2 //Multiplication
    println("Product: $result")
    result = n1/n2 //Division
    println("Quotient: $result")

}