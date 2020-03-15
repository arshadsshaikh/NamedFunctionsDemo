fun main(args:Array<String>){

//    var employee=Employee("Arshad Shaikh")
//
//  //  employee.nameOfEmployee="Arshad"
//
//    println("${employee.nameOfEmployee}")

 //   var student= StudentDetails("Sikku",30)

   // println("student name is ${student.name}")

    var roomDetail=RoomDetails("kambale","vishrantwadi","arshad shaikh")

    println("owner name is ${roomDetail.ownerName } and address is ${roomDetail.ownerAddress}")



}

//class StudentDetails(var name:String){
//
//    init {
//        println("name of the student is $name")
//    }
//
//    constructor(name:String,roll_no:Int):this(name){
//
//        println("name and roll no of student is $name and $roll_no")
//    }
//
//
//}

class RoomDetails(var ownerName:String,var ownerAddress:String){

    constructor(ownerName:String,ownerAddress: String,tenantName:String):this(ownerName,ownerAddress){

        println("owner name is $ownerName and his address is $ownerAddress and tenant name is $tenantName")
    }


}