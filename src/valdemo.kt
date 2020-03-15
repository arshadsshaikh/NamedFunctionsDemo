class valdemo {

    fun getint():Int{

        return 10
    }
}

fun main(args: Array<String>) {

    val valdemo= valdemo()
    val int=valdemo.getint()

    println("value is $int")


}

interface  abc{

    fun getData();
}