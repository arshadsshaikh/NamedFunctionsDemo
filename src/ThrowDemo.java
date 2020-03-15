public class ThrowDemo {

    static class demothrow{

         void sum ()throws IllegalStateException{

            System.out.println("i throwed");

            throw (new IllegalStateException("demo"));


        }
    }
    public static void main(String[] args) {

        demothrow demothrow= new demothrow();

        try{

            demothrow.sum();

        }catch (Exception e){

            System.out.println("we got exception");
            e.printStackTrace();
        }
    }
}
