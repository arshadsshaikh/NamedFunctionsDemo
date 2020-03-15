fun main(args:Array<String>){

    var areaOfRectanle=getArea(2,5,10)

    println("area of rectangle is $areaOfRectanle")

    // method with default value

    var area=getArea(10,20)

    println("The default area is $area")

    // method with named params

  var namedArea=  getArea(height = 20,length = 20,width = 2)

        println(namedArea)


}

    fun getArea(length:Int, width:Int,height:Int=2):Int{


        return length*width*height
    }