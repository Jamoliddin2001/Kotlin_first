import java.util.*

class Student {
    ///companion object
    companion object St1 {
        fun J1() {
            println("1")
        }
    }

    object St2 {
        fun J2() {
            println("2")
        }
    }

    var name = ""
    var age = 0;

    init {
        println("object initialisation...")
    }


    fun sayHello(name: String) {
        println("Hello $name!")
    }
}

var student1 = Student()

fun main() {


    val square: (Int) -> Int = { a -> a * a }
    println(square(5))
    val square1: (Int) -> Int = { it * it }
    println(square1(5))
    Student.J1()
    Student.St2.J2()

    student1.sayHello("Jamoliddin");
    student1.name = "Jamoliddin"
    student1.age = 20
    println(student1.name)
    println(student1.age)

    var num1 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    printEvenNumbers(num1)
    var s: Any = 1
    var s2 = "plapal"
    var c = arrayOf(1, 2, 4, 3, 5, 4);
    println(s to s2)
    println(s is String)
}

fun printEvenNumbers(numbers: Array<Int>) {
    numbers.forEach {
        when (it % 2) {
            0 -> println(it)
            0 -> print(it)
            1 -> println("Нечетный")
        }
    }
}
