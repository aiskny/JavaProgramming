package day09_IfStatement;

public class MinimumNumber {
    public static void main(String[] args) {

        int a= 10,
                b=7;

        boolean isMinNumber = a>b;

        if(isMinNumber){
            System.out.println(b+ " is minimum number.");
        }else{
            System.out.println(a+" is minimum number.");
        }
    }
}
