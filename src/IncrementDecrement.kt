fun main(args:Array<String>){
    var i:Int = 2
    var j:Int = 10

    println(++i) // does i = i+1 before assignment, prints 3
    println(i)  // prints i, 3
    println(i++) // does i = i+1 after assignment, prints 3, performs i = 4
    println(i)  // prints i = 4
    println(--j) // does j = j-1 before assignment, prints 9
    println(j) // prints j=9
    println(j--) //does j = j-1 after assignment, prints 9, performs j=8
    println(j) //prints j=8
    /*
    Priorities:
    Highest to Lowest
    1. ()
    2. ++i,--i (pre)
    3. ^ (power)
    4. *,/
    5. +,-
    6. = (assignment)
    7. i++,i-- (post)
     */
}