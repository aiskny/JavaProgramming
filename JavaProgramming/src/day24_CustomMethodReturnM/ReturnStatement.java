package day24_CustomMethodReturnM;

public class ReturnStatement {
    public static void main(String[] args) {
        /*create a method that can print the name of the day
        based on the given number to the method
         */
        nameOfDay(10);
        System.out.println("Hello World");
    }
    public static void nameOfDay(int number){
        String name = "";
        if (number<1 || number>7){
            System.out.println("Invalid");
         return;
        }
        if (number>0 && number<8){
           name = (number==1)?"Monday":(number==2)?"":(number==3)?"Wedneyday"
          :(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday";

        }
        System.out.println(name);
    }
}
