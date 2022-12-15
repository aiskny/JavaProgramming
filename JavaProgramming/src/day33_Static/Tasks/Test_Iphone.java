package day33_Static.Tasks;

public class Test_Iphone {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("iPhone","Black",1000,"5.6 inches");
        System.out.println(iphone1);
        iphone1.faceTime(123456789);
        iphone1.faceTime("gmail.com");
        iphone1.call(123456789);
        iphone1.text(123456789);
    }
}
