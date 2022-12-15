package day24_CustomMethodReturnM;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
String word = "aaabbnnnmmmssskkkll";
      word =   removeDuplicates(word);
        System.out.println(word);
    }

    //Create a method that remove dublicated characters from a string and returns the new value
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(each + "")) {
                result += each;
            }

        }
return result;
    }
}

