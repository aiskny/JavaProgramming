package day12_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        int n1 = 200;
        int n2 = 300;
        int n3 = 400;
        String result="";
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is the biggest");
        } else if (n2>n1 && n2>n3) {
            System.out.println(n2+ "is the biggest number");

        }else
            System.out.println(n3+" is the biggest number");
    }
}
