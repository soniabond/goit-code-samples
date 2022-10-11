package module6.lesson2;

import java.util.Arrays;

public class SortTestComparable {

    public static void main(String[] args) throws Exception{

        //Integer array [] = {5, 7, 8, 30, 1};
        String array [] = {"aaa", "aab", "sdfgsd", "hhhh", "EEEE"};

        sort(array);

        System.out.println("array = " + Arrays.toString(array));

    }

    public static <T extends Comparable> void sort (T [] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted=false;
                }
            }
        }
    }
}
