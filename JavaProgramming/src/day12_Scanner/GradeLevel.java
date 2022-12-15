package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        int grade = 2;
        String gradeType ="";
        boolean valid = grade >= 1 && grade <=18;
        if(valid){
            switch (grade){
                case 1 : case 2: case 3: case 4: case 5:
                    gradeType="Elementary school";
                    break;
                case 6 : case 7: case 8:
                    gradeType = "Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    gradeType = "High school";
                    break;
                case 13: case 14:case 15: case 16:
                    gradeType = "College";
                default:
                    case 17:case 18:
                        gradeType = "Grad school";
            }
            System.out.println(gradeType);
        }else{
            System.out.println(grade+"Invalid grade level given");
        }
    }
}
