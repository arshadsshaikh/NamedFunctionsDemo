package stringshandling;

public class CallByValueDemo {
   static int i=100;

    public static void main(String[] args) {



        CallByRefData callByRefData= new CallByRefData("Arshad");

        String name=changeValue(callByRefData);

    //    System.out.println("value is "+name);

         i=50;

        changeIntValue(i);

        System.out.println("and value"+i);




    }

    private static int changeIntValue(int i){

        i=i+10;
        System.out.println("int value"+i);
        return  i;

    }

   private static  String changeValue(CallByRefData call){

        call.title="Shaikkh";

        return call.title;
    }
}

class CallByRefData{



    String title;

    CallByRefData(String title){

        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
