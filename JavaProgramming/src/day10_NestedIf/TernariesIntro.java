package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("-----------------------------------------------------------");
        String result1 = (n%2==0)?"Even": "Odd";
        System.out.println(result1);


        int age = 11;

        /*String result2 = (age>=21) ? "Eligible" : "Not Eligible";
        System.out.println(result2);*/

       // System.out.println((age>=21)? "Eligible: "Not Eligible");//why it has error!

        System.out.println("--------------------------------------------------------------------");

        int number = 100;
        if(n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");

        }else {
            System.out.println("Zero");
        }

        String result3=(number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println(result3);


    }
}
