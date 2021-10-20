class Student {
    ///companion object
    companion object St1{
        fun J1(){
            println("1")
        }
    }
    object St2{
        fun J2(){
            println("2")
        }
    }
    var name = ""
    var age = 0;

    init{
        println("object initialisation...")
    }


    fun sayHello(name:String){
        println("Hello $name!")
    }
}

var student1=Student()

fun main(){

    Student.St1.J1()
    Student.St2.J2()

    student1.sayHello("Jamoliddin");
    student1.name="Jamoliddin"
    student1.age=20
    println(student1.name)
    println(student1.age)

    var num1= arrayOf(1,2,3,4,5,6,7)
    printEvenNumbers(num1)
}

fun printEvenNumbers(numbers:Array<Int>){
    numbers.forEach {
        when(it%2){
            0 -> println(it)
            0 -> print(it)
            1 -> println("Нечетный")
        }
    }
}