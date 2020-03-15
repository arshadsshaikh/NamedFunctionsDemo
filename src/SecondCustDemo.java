public class SecondCustDemo {

    static void doSomeWork(String data) throws SecondCustExcption{

        if(data.length()<16){
            throw new SecondCustExcption(data);
        }

    }

    public static void main(String[] args) {

        try{

            doSomeWork("pass");
        }
        catch (SecondCustExcption custExcption){


            System.out.println("got the exception");
        }
    }
}
