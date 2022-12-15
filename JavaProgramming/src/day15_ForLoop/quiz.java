package day15_ForLoop;

public class quiz {
    public static void main(String[] args) {
        int num = -5;
        System.out.println(num=0);

        long l = 100;
        short s =(short)l;
        System.out.println(s+10);

        int a = 10;
        a= --a + a++ + a--+ a++;
        System.out.println(a);
        int cookies = 10;
        String day = "tuesday";
        switch (day){
            case "sunday":
                cookies++;
            case"monday":
                cookies+=5;
            case "tuesday":
                break;
            default:
                cookies = 0;
        }
        System.out.println(cookies);
    }
}
