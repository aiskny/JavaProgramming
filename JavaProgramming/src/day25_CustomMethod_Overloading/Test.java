package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("----------------------");
        String s1 = "Wooden Spoon";
        String reverse= StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("-------------------");
        String[] names = {"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("------------------------------------------------");
        String str1 = "Ayse";
        String str2 = "Esya";
        boolean anagram = StringUtility.isAnagram(str1,str2);
        System.out.println(anagram);
        System.out.println("---------------------------------------");

        String str3="ahsen gul konya";
      String s=  StringUtility.removeDuplicate(str3);
        System.out.println(s);

    }
}
