package day14_String;

public class StringMethod {
    public static void main(String[] args) {
        //isEmpty:checks if the string'length is zero.return type:boolean
        String str = "";
        boolean r1 = str.isEmpty();
        System.out.println("r1 = " + r1);
        //isBlank:checks if the string is blank.return type:boolean
        String str2 = "    ";
        boolean r2 = str2.isBlank();
        System.out.println("r2 = " + r2);;
        //equals(String):compares the content of the two strings.return type:boolean
        String s1="Java";
        String s2 =new String("Java");
        boolean r3 = s1==s2;
        System.out.println("r3 = " + r3);
        System.out.println(s1.equals(s2));
        //equalsIgnoreCase(String):compares the content of the two Strings irrespective of the case sensitivity,boolean
        String word1 ="JAVA";
        String word2 = "java";
        System.out.println(word1.equalsIgnoreCase(word2));
        //contains(String):checks if the given string is contained in the String:Boolean
        String sentence = "I love Java Programming Language";
        boolean hasCsharp=sentence.contains("C#");
        System.out.println("hasCsharp = " + hasCsharp);
        //startWith(String):checks if the string started with the given character(s).boolean
        String name = "ayse";
       boolean a= name.startsWith("ay");
        System.out.println("a = " + a);
        //endsWithMethod:boolean


    }
}
