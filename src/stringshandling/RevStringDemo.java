package stringshandling;

public class RevStringDemo {

    public static void main(String[] args) {

        String str1="Arshad";
        String rev="";
        int len=str1.length();

        for( int i=len-1;i>=0;i--){

            rev=rev+str1.charAt(i);
        }

        System.out.println(rev);

    }
}
