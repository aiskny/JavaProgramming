package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String location = "";
        String numberOfGroups = "";
        String teacherInCharge = "";

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = "3";
                teacherInCharge = "Mr.Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = "7";
                teacherInCharge = "Mr.Lee";

            } else if (grade==3)
                location = "Aquarium";
                numberOfGroups = "5";
                teacherInCharge = "Ms.Willson";

                System.out.println(location+numberOfGroups+teacherInCharge);

            }else{
                System.out.println("Invalid Grade");
            }
        }
}


