package stringshandling;

public class SingleTonePatters {

    public static void main(String[] args) {

        SingleT singleT= SingleT.getInstance();
    }
}

class  SingleT{

    private static  SingleT instance;
    private SingleT(){}

    public  static  SingleT getInstance(){

        if(instance==null){

            instance=new SingleT();
        }
        return  instance;
    }
}
