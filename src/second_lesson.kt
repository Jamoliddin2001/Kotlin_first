fun main(){

    /*val x = arrayOf(1,2,3,4,5)
    for(i in x){
        print(" "+i)
    }*/
    Tree_tochki(15,29,57)

    var x1:Int?;
    x1=null
    var x2:Int;
    My_fun(10,20)

    println(My_fun2(10,10,10))

    println(My_fun3(1))
}

fun Tree_tochki(x1:Int,x2:Int,x3:Int):Int{
    println("x1, x2 = "+Math.abs(x1-x2))
    println("x1, x3 = "+Math.abs(x1-x3))
    println("x2, x3 = "+Math.abs(x2-x3))
    var sum=Math.abs(x1-x2)+Math.abs(x2-x3)+Math.abs(x1-x3)
    println("sum = "+sum)
    return 1
}

fun My_fun(x:Int, y:Int):Int{
    println("x = "+x)
    println("y = "+y)
    println("x/y= "+y.toDouble()/x)
    return 1
}

fun My_fun2(x1:Int,x2:Int,x3:Int):Boolean{
    if(x1+x2>x3 && x1+x3>x2 && x2+x3>x1) {
        if (x1 == x2 && x2 == x3) return true;
    }
    return false
}

fun My_fun3(x:Int):Double{
    var S:Double=1.0
    for(i in 11 until 10+x+1){
        S*=i.toDouble()/10
    }
    return S
}
