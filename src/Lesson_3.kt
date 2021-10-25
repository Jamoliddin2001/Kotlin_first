fun main(){
    var student1=Student()
    student1.name="Jamoliddin"
    println(student1.name)

    var x=10 ;
    println(x.isPositive());
    var c:Int= if(x>0) x else -5
    println(c)
    var s="Jamoliddin"
    println(s.isTenCounts())
}

fun String.isTenCounts()=this.length==10


fun Int.isPositive()=this>=0