package day16_ForLoopStringPractise;

public class Palindrome {
    public static void main(String[] args) {
        String str = "alla";
        String result = "";

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            String ch = ""+str.charAt(i);
            result += ch;
        }
        if(str.equalsIgnoreCase(result))
        System.out.println(str+" is a palindrome ");
        else
            System.out.println(str +" is not a palindrome");
    }
}
