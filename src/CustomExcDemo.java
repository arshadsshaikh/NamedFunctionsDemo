public class CustomExcDemo {

    static void compute(int a)throws CustExc{

        System.out.println("Called compute(" + a + ")");
        if(a > 10)
            throw new CustExc(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {

        try {

            compute(2);
            compute(20);
        }
        catch (CustExc e){
            e.printStackTrace();
        }

    }
}
