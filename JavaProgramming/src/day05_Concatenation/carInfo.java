package day05_Concatenation;

public class carInfo {
    public static void main(String[] args) {
        /*year
        make
        model
        miles
        color
        price
         */
        String year="2018",
                model="Toyota Camry",
                miles = "50000",
                color = "Red",
                price = "$19000";
        String carInfo= year+" "+model+", "+miles+" miles, "+color+", "+price+" .";
        System.out.println(carInfo);

    }
}
