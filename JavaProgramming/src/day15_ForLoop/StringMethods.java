package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = " ";
        boolean r = str.isEmpty();
        System.out.println(r);
       boolean r1=  str.isBlank();
        System.out.println(r1);
        System.out.println("----------------------------------------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        //Yes,YES,yEs,yES,YEs;
        System.out.println("yEs".equalsIgnoreCase("Yes"));
        System.out.println("------------------------------------------------------------");
        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
       boolean hasJava3 = sentence.toLowerCase().contains("java");

       String input1 = "I love jAvA";
       String input2 = "Java";
        System.out.println(input1.contains("Java"));
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));
        System.out.println("-----------------------------------------------");
        String a = "ayse";
        boolean x= a.startsWith("ay");
        boolean y =a.endsWith("se");
        System.out.println(x);
        System.out.println(y);

    }
}
