package module6.lesson1.arrayutils;

import java.util.Arrays;

public class ArrayUtilsTest {

    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6, 7};
        int res [] = ArrayUtils.subarray(arr, 2, 5);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        res = ArrayUtils.subarray(arr, 3);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }
}
