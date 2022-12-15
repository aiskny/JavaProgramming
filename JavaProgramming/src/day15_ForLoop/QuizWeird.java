package day15_ForLoop;

import java.util.Scanner;

public class QuizWeird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int one = input.nextInt();
        int two = input.nextInt();
        if(one-- > two*2){
            System.out.println("one");

        }else{
            System.out.println(two);
        }
        */
      /*  byte b1 = input.nextByte();
        byte b2 = input.nextByte();
        int max = (b1>b2)?b1 + 2 : b2 - 4;
        System.out.println(max);*/
        String first = input.nextLine();
        String last = input.nextLine();
        int num = input.nextInt()+1;
        String fullName = "";
        if (num % 2 == 0) {
            fullName = first + "" + last;
        } else {
            fullName = "Not valid name";
        }
        System.out.println(fullName);
    }
}
