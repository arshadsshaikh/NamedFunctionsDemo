package stringshandling;

public class ValuesOfStringDemo {

    public static void main(String[] args) {

//        GenEx<Integer>exs= new GenEx<Integer>(20);
//
//        int value= exs.getGenEx();
//
//        System.out.println("values was "+value);

        ObjAsGen objAsGen= new ObjAsGen(20);

        int value= (int) objAsGen.getObject();


    }
}

class  GenEx<T>{
    T genEx;

    GenEx(T ob){

        genEx=ob;
    }

    T getGenEx(){

        return  genEx;
    }

     int getValue(){


        return 0;
    }


}

class ObjAsGen{

    Object object;

    ObjAsGen(Object o ){

        object=o;
    }

    Object getObject(){

        return  object;
    }

}