package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
     /*
        Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
			*/

        int a=1000, b=105, c=200;
        String medianNumber="";
        if(a<b && b<c) {

            medianNumber = "b";
        }
        if(b>a && a>c){
            medianNumber="a";

        }
        if(a>c && c>b){
            medianNumber="c";
        }
        System.out.println(medianNumber);


        boolean aIsMedian = (a<b && a>c)||(a<c && a>b);
        boolean bIsMedian = (b<a && b>c)||(b<c && b>a);
        boolean cIsMedian= (c>a && c<b)||(c>b && c<a);
       //boolean cIsMedian= !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println(a+" is Median");
        }
        if(bIsMedian){
            System.out.println(b+" is Median");
        }
        if(cIsMedian){
            System.out.println(c+" is Median");

        }









    }
}
