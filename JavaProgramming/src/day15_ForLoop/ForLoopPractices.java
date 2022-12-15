package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
      /*  for (int i = 15; i <= 45; i++) {
            System.out.print(i+" ");//" " gives space between the numbers
        }
        System.out.println();//this for make sure the new line
        System.out.println("Hello");
        //100  99  98 ........       50
      //  for(int i = 100;i>=50;i--){
            System.out.print(i+" ");
        }

       */
        //print all the even numbers between 1-55;
        for(int i =1;i<=55;i++){
            if(i%2==0)
            System.out.print(i+" ");
        }
        System.out.println("-------------------------------------------------------");
        //print all even numbers 1-55:2,4,6,.....54
        for (int i =2;i<=54;i+=2){

            System.out.print(i+" ");
        }
    }
}