import kotlin.math.exp

fun main(args: Array<String>) {
    val sample1:Int = 0x3A
    var sample2:Int = 58

    var heartRate: Int = 85
    var deposits: Double = 135002796.0
    var acceleration: Float = 9.800F
    var mass: Float = 14.6F
    var distance: Double =129.763001
    var lost: Boolean = true
    var expensive: Boolean = true
    var choice : Int = 2
    val integral: Char= '\u222B'
    val greeting: String = "Hello"
    var name: String = "Karen"

    var result = if(sample1 == sample2)
        "The samples are equal"
        else
        "The sample are not equal"
    println(result)

    result = if(heartRate>=40 && heartRate<=80 )
        "Heart rate is normal"
        else
        "Heart rate is not normal"
    println(result)

    result = if(deposits>=100000000)
        "You are exceedingly wealthy"
        else
        "Sorry you are so poor"
    println(result)

    var force: Float = mass*acceleration
    println("force = ${force}")

    println("${distance} is the distance")

    result = if(lost == true && expensive == true)
        "You are exceedingly wealthy"
        else if(lost == true && expensive == false)
        "Sorry you are so poor"
        else
        ""
    println(result)

    result = when (choice){
        1 -> "You chose 1"
        2 -> "You chose 2"
        3 -> "You chose 3"
        else -> "You made an unknown choice"
    }
    println(result)

    println("$integral is an integral")

    for (i in 5 ..10)
        println("i = $i")

    var age: Int = 0
    while(age<6){
        println("age = $age")
        age++
    }

    println("$greeting $name")
}