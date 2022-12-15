package day23_CustomMethod;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        oddOrEven(100);
        ageOfPerson(2010);
        areaOfCircle(3);
        theNumbersBetweenXAndY(3,20);
    }

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+" is an odd number");
        }

    }
    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int currentYear =2022;
        int age = currentYear-birthYear;
        System.out.println(age);
    }
    //create a function that can display the area of circle
    public static void areaOfCircle(int radius) {
        double pi = 3.14;
        double areaOfCircle = radius * radius * pi;
        System.out.println(areaOfCircle);
    }
        //create a function that can display all the numbers between x and y
        public static void theNumbersBetweenXAndY(int x,int y){
            for (int i =x+1,j =y; i < j ; i++) {
                System.out.print(i+" ");
            }
        }
}
