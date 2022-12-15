package day19_LoopRecap;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which room do you want to reserve?");
        /*
        King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
         */
        int total = 0;
        while (true) {
            System.out.println("\t\t King Bed == 120$");
            System.out.println("\t\t Queen Bed == 100$");
            System.out.println("\t\t   single Bed == 80$");
            String typeOfBed = scan.nextLine().toLowerCase();
            while (!(typeOfBed.equals("king bed") || typeOfBed.equals("queen bed")|| typeOfBed.equals("single bed"))) {
                System.out.println("Invalid Entry, please Re-Enter");
                typeOfBed = scan.nextLine();
            }
            total +=(typeOfBed.equals("king bed"))?120:(typeOfBed.equals("queen bed"))?100:80;

        }
    }
}