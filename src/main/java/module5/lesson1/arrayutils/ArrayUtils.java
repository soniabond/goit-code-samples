package module5.lesson1.arrayutils;

public class ArrayUtils {

    public static int[] subarray(int[] array, int startIndex, int endIndex) {
        System.out.println("first method");
        int [] resultArr = new int [endIndex - startIndex];
        int counter = 0;
        for (int i = startIndex; i < endIndex; i++) {
            resultArr[counter++] = array[i];
        }
        return resultArr;
    }

    public static int[] subarray(int[] array, int startIndex) {
        System.out.println("second method");
        int [] resultArr = new int [ array.length - startIndex];
        int counter = 0;
        for (int i = startIndex; i < array.length; i++) {
            resultArr[counter++] = array[i];
        }
        return resultArr;
    }
}
