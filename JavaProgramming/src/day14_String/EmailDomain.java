package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

        System.out.println("----------------------------------------------");
        String str1 = "Java is fun, Java is cool, I love Java";
        String s1=str1.substring(str1.indexOf("J"),str1.indexOf(","));
        System.out.println("s1 = " + s1);
        String s2 = str1.substring(str1.indexOf(",")+2);
        System.out.println("s2 = " + s2);
        String s3 = str1.substring(str1.lastIndexOf(",")+2);
        System.out.println("s3 = " + s3);
    }
}
