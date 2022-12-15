package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        /*Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)


         */
        String StudentName="Merve Konya";
        int Age=12;
        char Gender='F';
        String SchoolName="LordsWood";
        String PhoneNumber="(746)-468-8920";
        Boolean isFullTime=true;

        System.out.println("StudentName = " + StudentName);
        System.out.println("Age = " + Age);
        System.out.println("Gender = " + Gender);
        System.out.println("SchoolName = " + SchoolName);
        System.out.println("PhoneNumber = " + PhoneNumber);
        System.out.println("isFullTime = " + isFullTime);


    }
}
