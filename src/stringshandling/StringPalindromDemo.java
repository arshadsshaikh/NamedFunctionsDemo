package stringshandling;

public class StringPalindromDemo {

    public static void main(String[] args) {

        String str1="Arshad";
        String rev="";
        String check=str1;

        for(int i=str1.length()-1;i>=0;i--){

            rev=rev+str1.charAt(i);
        }

        if(check.equals(rev)){

            System.out.println("string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
