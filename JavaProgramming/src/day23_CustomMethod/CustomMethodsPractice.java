package day23_CustomMethod;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        greeting();
        helloCydeo5Times();
        evenNumbers();
    }


    public static void greeting() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

    }

    //create a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }
    //create a function that can print all the even numbers from 1 to 100

    public static void evenNumbers() {
        for (int i = 0; i < 101; i += 2) {
            System.out.print(i + " ");
        }
    }

}
