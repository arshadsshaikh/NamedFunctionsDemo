fun main(args:Array<String>){

    var student=Student()

    var abc:Int?=null
    

   println( "${student.isStudentPassed()}")

    println("${student.checkScholar(98)}")


}

fun Student.checkScholar(marks:Int):Boolean{

    return marks>95
}

class Student{

    var marks:Int=45

        fun isStudentPassed():Boolean{

            return marks>40
        }

}

class  UserProperTies{

    var userFirstName="Arshad"

    var userLastName="Shaikh"

    var userLocation="Nashik"


}




