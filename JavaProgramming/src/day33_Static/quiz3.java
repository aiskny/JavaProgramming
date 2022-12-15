package day33_Static;

public class quiz3 {
    public static void main(String[] args) {
String str = "apple";
String a = str.substring(0,1);
boolean x = a.equals("a");
        System.out.println(x);

        int [] arr = new int[str.length()];
    }
    public static void method1(){
        int n = -5;
        for (int i = 1; i <5 ; i++) {
            n *= i;

        }
        System.out.println(n);
    }
    public static int method4(char c,String s){
        if (s.contains((""+c))){
            return 1;
        }else{
            return 0;
        }
    }
}
