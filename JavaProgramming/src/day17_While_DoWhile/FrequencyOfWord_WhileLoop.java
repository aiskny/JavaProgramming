package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency = 0;
        while(str.contains("Java")){
           str= str.replaceFirst("Java","");
           frequency++;
        }
        System.out.println(frequency);
        System.out.println("------------------------------------------------------");
        String sentence = "cat cat cat cat Dog dog doG cat cat";//if you need to use ignore case ,you should convert to lowercase first;
       sentence= sentence.toLowerCase();
        int countCat =0;
        while (sentence.contains("cat")){
           sentence = sentence.replaceFirst("cat","");
           countCat++;
        }
        System.out.println(countCat);
        int countDog = 0;
        while (sentence.contains("dog")){
           sentence= sentence.replaceFirst("dog","");
                countDog++;
            }
        System.out.println(countDog);
        System.out.println("----------------------------------------------------");
        String s ="java java java python python python";
        int countJava = 0;
        int countPython = 0;
        while (s.contains("java")||s.contains("python")){
            if (s.contains("python")){
                s =  s.replaceFirst("python","");
                countPython++;
            }
            if (s.contains("java"))
           s= s.replaceFirst("java","");
           countJava++;
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
