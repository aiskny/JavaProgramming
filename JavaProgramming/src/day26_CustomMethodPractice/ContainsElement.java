package day26_CustomMethodPractice;

public class ContainsElement {
    //checks if the given element is contained in the given array.returns boolean
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given element is contained in the given array.returns boolean
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given element is contained in the given array.returns boolean
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given element is contained in the given array.returns boolean
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }
}
