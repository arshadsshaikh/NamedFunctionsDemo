public class CustExc extends Exception {

    private int detail;
    CustExc(int a){

        detail=a;

    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
