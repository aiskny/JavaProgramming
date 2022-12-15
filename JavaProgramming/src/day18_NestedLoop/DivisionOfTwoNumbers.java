package day18_NestedLoop;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        int num1=10;
        int num2=2;
        int counter = 0;
       while(num1>=num2){
           num1-=num2;
           counter++;
       }
        System.out.println(counter+" with a remainder"+ num1);//at this point num1's value is 0!




        /*while(num1>num2){
            System.out.println(num1-num2);
            counter++;
            if(num1-num2==0){
                break;
            }

        }
        System.out.println(counter);*/
    }
}
