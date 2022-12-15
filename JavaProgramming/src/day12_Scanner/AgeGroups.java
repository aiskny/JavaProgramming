package day12_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
         int age = 20;
         Boolean valid = age>=0 && age <=150;
         if(valid){
            String result= (age>=0 && age <=21)?"Teenager":age>21 && age <=55?"Adult":"Senior";
             System.out.println(result);
         }else{
        System.out.println(age +" is Invalid");

         }
    }
}
