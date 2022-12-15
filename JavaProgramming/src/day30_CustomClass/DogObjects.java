package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";
        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German",2,'M',"Large","Black");
        Dog dog4 = new Dog();
        dog4.setInfo("Fifi","Golden Retriever",3,'F',"Medium","Golden");
        Dog dog5 = new Dog();
        dog5.setInfo("Taby","Cairn Terrier",1,'F',"Small","Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();
        for (Dog each : dogsList) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }
            if(each.gender=='M'){
                maleDogs.add(each);
            }
        }
        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);
        


    }

}

