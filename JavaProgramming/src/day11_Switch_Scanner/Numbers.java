package day11_Switch_Scanner;

public class Numbers {
    public static void main(String[] args) {
       // int num = 1;
        int num = -1;

        String result = (num>=0 && num<= 9)?
                (num == 0)?"0":(num == 1)?"1":(num==2)?"2"
                        : (num==3)?"3":(num==4)?"4":(num==5)?"5"
                        :(num==6)?"6":(num==7)?"7":(num==8)?"8"
                        :"9":"Invalid Number";
        System.out.println(result);
    }
}
