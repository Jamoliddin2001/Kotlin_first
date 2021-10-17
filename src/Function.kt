fun main(){
//    var name="Jamoliddin"
//    println("$name")
    var ar= arrayOf(1,2,3,4)
    ar.set(1,10)
    println(ar.toList())
    val x:Int?=null
    println(x)
    println((1..3).toList())
    println('A' in 'A'..'z')
    var a= arrayOf(1,2,3,4,5,6)
    println("a.size="+a.size)
    println((Math.random()*1000).toInt())
    println(Math.pow(2.0,5.0))
    var q=10
    println((1 until q).toList())
    println(Mymax(10))
    println(first(1))
    `*****`()
    println((1 downTo -10 step 2).toList())
    var list=ArrayList<Int>()
    list.add(5)
}

private fun Mymax(a:Int):Int{
    var b=a;
    b++;
    return b
}

fun `*****`() {
    println("Jamoliddin")
}

private fun first(a:Int=2){
    var b=a
}