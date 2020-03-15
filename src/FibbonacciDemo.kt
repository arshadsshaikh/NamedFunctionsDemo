
fun main(args:Array<String>){

    var k:Int
    var a=1
    var b=1

    k=0
    println(a)
    println(b)
    while (k<50){

        k=a+b

        println(k)

        a=b
        b=k

    }

}