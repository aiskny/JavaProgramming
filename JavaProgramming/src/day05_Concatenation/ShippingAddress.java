package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
      Create a class called ShippingAddress.java
       Declare the following variables:
       name
       buildingNumber
       streetName
       city
       state
       zipCode
       Use concatenation to print the full shipping address

        String firstName = "Alexsandir";
        String lastName = "Klovsky";
        String fullName = firstName+lastName;
        String buildingNumber = "27";
        String streetName = " Wheatley Road";
        String state = "UK";
        String zipcode = "B68 9HW";
        */

        /*EX:
        Alexsandir Klovsky
        27 Wheatley Road
        Birmingham,UK B68 9HW
         */
        String name = "Alexsandir Klovsky",//if you type same kind of data ,use comma after first line,do not forget to put semicolon end of the last line.
                buildingNumber = "27",
                streetName = " Wheatley Road",
                city = "Birmingham",
                state = "UK",
                zipcode = "B68 9HW";
        String address = "\t"+name+"\n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipcode;


        //System.out.println("\t"+name+"\n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipcode);
        System.out.println("Shipping address = " + address);


//if you declare the adress as string after wrote the code ,you can run simply.












    }
}
