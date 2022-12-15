package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

       /* String firstName="Ayse";
        String lastName="Konya";
        int age=40;
        String fullName= firstName+" "+ lastName;
        //Full name of the person is_______________
        System.out.println("Full name of the person is " + fullName);
        //_________is________years old.
        System.out.println( fullName+" is "+ age+" years old.");
        String childName1="Betul";
        String childName2="Merve";
        String childName3="Ahsen Gul";
        int age1=12;
        int age2=11;
        int age3=6;
        byte childNumber=3;

        System.out.println("I have "+childNumber+" children"+" ,"+childName1+" is "+age1+", "+childName2+" is "+age2+", "+childName3+" is "+age3+" years old.");


        System.out.println(fullName);*/
        //FullName is JobTitle,works at companyName and FullName's salay is Salary.
        String firstName="Aaron";
        String lastName="Daniel";
        String fullName=firstName+lastName;
        int age=19;
        String jobTitle="SDET";
        String companyName="Apple Inc";
        double salary=100000.58;
        System.out.println("\t"  + firstName+" "+lastName+" is "+jobTitle+" ,works at "+companyName+" and "+fullName+"'s salary is $"+salary+".");
    }
}
