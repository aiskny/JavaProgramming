package day14_String;

public class StringMethod3 {
    public static void main(String[] args) {
        //substring(beginning index,ending index)
        String word = "Cydeo School";
        String brand = word.substring(0,4+1);
        System.out.println("brand = " + brand);
        String str = word.substring(6);
        System.out.println(str);

        String word2 = " Python C# Ruby ";//if there is some gap,use trim method!
        word2 = word2.trim();
        String s1 = word2.substring(0,word2.indexOf(" "));
        String s2 = word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        String s3= word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);;;

    }
}
