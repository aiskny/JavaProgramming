package day13_String;

public class stringInfo {
    public static void main(String[] args) {

        String name = "Java";
        String name1= "Java";
        System.out.println(name==name1);
        String s3 = "Java";
        String s4 = new String("java");
        System.out.println(s3.equals(s4));
    }
}
