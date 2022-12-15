package day18_NestedLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

         */
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Which bedroom do you want to reserve? kingbed? queenbed? singlebed?");
            int kingBed = 120;
            int queenBed = 100;
            int singleBed = 80;
            int bill = 0;

            String answerWhich = scan.next().toLowerCase();
            System.out.println("How many nights would you like to stay");
            int answerHowManyNight = scan.nextInt();
            System.out.println("Would you like to reserve another room?");
            String answerAnotherRoom = scan.next().toLowerCase();
            if (answerAnotherRoom.equals("no")) {
                if (answerWhich.equals("kingbed")) {
                   bill+= kingBed * answerHowManyNight;
                }
                if (answerWhich.equals("queenbed")) {
                    bill+= queenBed * answerHowManyNight;
                }
                if (answerWhich.equals("singlebed")) {
                   bill+= singleBed * answerHowManyNight;
                }
            }

            while (answerAnotherRoom.equals("yes")){
                System.out.println("Which bedroom do you want to reserve? kingbed? queenbed? singlebed?");
                kingBed = 120;
                 queenBed = 100;
                singleBed = 80;
                int bill2 = 0;
                 answerWhich = scan.next().toLowerCase();
                System.out.println("How many nights would you like to stay");
                answerHowManyNight = scan.nextInt();
                System.out.println("Would you like to reserve another room?");
                answerAnotherRoom = scan.next().toLowerCase();
                if (answerAnotherRoom.equals("no")) {
                    if (answerWhich.equals("kingbed")) {
                      bill2 += kingBed * answerHowManyNight;
                    }  if (answerWhich.equals("queenbed")) {
                        bill2 += queenBed*answerHowManyNight;
                    }if (answerWhich.equals("singlebed")){
                       bill2 +=singleBed*answerHowManyNight;
                    }
                }
                System.out.println(bill+bill2);
            }
        }

    }
}