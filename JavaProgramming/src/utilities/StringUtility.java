package utilities;

import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {
        String str = "Ayse";
       printEachChar(str);
    }
    public static void printEachChar(String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    public static String reverse(String str){
        String result = "";
        for (int i =str.length()-1; i>=0; i--) {
            result +=str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){
      return reverse(str).equalsIgnoreCase(str);

    }

    public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    public static String removeDuplicate(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!result.contains(c+"")){
                result +=c;
                }

            }
        return result;
        }
    }
