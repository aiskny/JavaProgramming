package day31_Constuctors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
    //4 testers objects
        Tester tester1 = new Tester("Ayse",10,"SDET",60000);
        Tester tester2 = new Tester("Ali",11,"QA",50000);
        Tester tester3 = new Tester("Betul",12,"SDET",55000);
        Tester tester4 = new Tester("Merve",13,"SE",55000);
Tester[] testers = {tester2,tester3,tester4};


    //4 developers objects
        Developer developer1 = new Developer("Ahsen",20,"Java Developer",70000);
        Developer developer2 = new Developer("Ahmet",21,"Frontend Developer",70000);
        Developer developer3 = new Developer("Mehmet",22,"Backend Developer",70000);
        Developer developer4 = new Developer("Elif",23,"Java Developer",70000);
        Developer developer5 = new Developer("Emine",24,"Java Developer",70000);
Developer[] developers={developer2,developer3,developer4,developer5};


        //1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Nigara","Huseyin","Neira",14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        scrum.addTesters(testers);//we can add the array of testers with this method which we created in the scrumteam
        scrum.addDevelopers(developers);//we can add the array of developers with this method which we created in the scrumteam
        System.out.println(scrum);
        System.out.println("-------------------------------------------------");
        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name+ ": "+eachTester.salary);
        }
        for (Developer eachDeveloper : scrum.developsList) {
            System.out.println(eachDeveloper.name+": "+eachDeveloper.salary);
        }
        //scrum.testersList.removeIf(p->p.employeeID==23);
        scrum.removeTester(23);//remove method was created in the scrum class
        scrum.removeDeveloper(10);
        System.out.println(scrum);
    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */
