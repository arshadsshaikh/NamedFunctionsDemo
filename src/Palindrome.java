public class Palindrome {

    public static void main(String[] args) {

        String firstString="arshad";
        String revString="";

        for(int i =firstString.length()-1;i >=0;i--){

            revString=revString+firstString.charAt(i);
        }

        if (firstString.equalsIgnoreCase(revString)){

            System.out.println("palindrom");
        }

        else{

            System.out.println("Not palindrom");
        }

    }
}
