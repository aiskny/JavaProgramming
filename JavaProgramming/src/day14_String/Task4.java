package day14_String;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
    4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last letter is the same,
    print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
         */
        System.out.println("Enter two words:");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        input.close();
        char word1last = word1.charAt(word1.length()-1);
        char word2first = word2.charAt(0);

          if(word1last==word2first){
              System.out.println(word1+word2.substring(1));
          }else
              System.out.println(word1+word2);
      }
    }

