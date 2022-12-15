package day24_CustomMethodReturnM;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String word = "dad";
        String result = reverse(word);
        System.out.println(result);
        if (word.equalsIgnoreCase(result)){
            System.out.println(word+" is  palindrome");
        }else{
            System.out.println(word+" is not palindrome");
        }
    }

    public static String reverse(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            reverse += ch;
        }
   return reverse;
    }
}
