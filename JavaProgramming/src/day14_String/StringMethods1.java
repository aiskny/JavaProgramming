package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
      //  String str1 = "    Batch 10     ",
       // str2="   lol ";
      //  str1=str1.trim();
       // str2=str2.trim();
        //System.out.println(str1 + str2);
        String str3 = "Java Programming Language";
        //str3.indexOf("h");
      //  System.out.println(str3.indexOf("h"));
     //   str3.indexOf("ool");
       // System.out.println(str3.indexOf("ool"));
        str3.lastIndexOf("g");
        System.out.println(str3.lastIndexOf("g"));

        String s="Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);;
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
       // int forthA= s.indexOf("av");
      //  int forthA = s.indexOf("ava W);
        int forthA= s.indexOf("Ca")+1;
        System.out.println("forthA = " + forthA);
        //int fifthA = s.lastIndexOf("va")+1;
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
       // int sixthA= s.indexOf("Wa")+1;
        int sixthA= s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);
        //int seventhA=s.indexOf("wa")+1;
        int seventhA=s.lastIndexOf("a o");
        System.out.println("seventhA = " + seventhA);


    }
}
