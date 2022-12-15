package day13_String;

public class Methods_Review {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        String s1 = new String("java");
        String name = "ayse konya";
        name = name.toUpperCase();
        System.out.println(name);
        String str2 = "Java !";
        //index number 012345
//1.Method:CharAt Method:
        char ch = str2.charAt(2);
        char ch1 = str.charAt(4);
        System.out.println(ch);
        System.out.println(ch1);
//2.Method:length Method:
        String str3 = "Betul Konya";
        //             012345678910
        int n1= str3.length();
        System.out.println(n1);
        int lastIndex = str3.length()-1;
        System.out.println(lastIndex);
        
        String merve = "mervecik";
        int num = merve.length();
        System.out.println("num = " + num);
        int lastIndexm = merve.length() - 1;
        System.out.println("lastIndexm = " + lastIndexm);
        char chm = merve.charAt(1);
        System.out.println(chm);
//3.toLowerCase();returns the all lower case version of String.return type :String!
        String color = "blue";
        int c = color.length();
        System.out.println("c = " + c);
        char cb = color.charAt(1);
        System.out.println("cb = " + cb);
        int lastIndexb = color.length()-1;
        System.out.println("lastIndexb = " + lastIndexb);
        color= color.toUpperCase();
        System.out.println("color = " + color);
        color= color.toLowerCase();
        System.out.println("color = " + color);
 //trim():returns the String without all the white spaces.(unused space)
        String str4 = "      Black    Board";
        str4 = str4.trim();
        System.out.println(str4);
 //indexof():returns the first matching character,type:int
        String str5 = "Wooden Spoon";
        int indexNumOfFirstO = str5.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);
        int indexNumOfSecondO = str5.indexOf("od");
        System.out.println("indexNumOfSecondO = " + indexNumOfSecondO);
        int indexNumOfThirdO = str5.indexOf("oon");
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);
          int indexNumOfLastO = str5.lastIndexOf("o");
        System.out.println("indexNumOfLastO = " + indexNumOfLastO);
    }
}
