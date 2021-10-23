fun main(){
    var student1=Student()
    student1.name="Jamoliddin"
    println(student1.name)

    for(i in 1 until 100 step 10){
        println("$i")
    }
    var x=10;
    println(x.isPositive());

}

fun Int.isPositive()=this>=0