package day09_IfStatement;

public class EligibleBuyAlcohol {
    public static void main(String[] args) {
        String name = "John";
        int age = 15;

        if ( age>= 18){
            System.out.println(name+" is eligible to buy alcohol.");
        }else{
            System.out.println(name+" is not eligible to buy alcohol.");
        }
    }
}
