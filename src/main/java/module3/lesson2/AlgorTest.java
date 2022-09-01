package module3.lesson2;

import java.util.Arrays;

public class AlgorTest {

    public static void main(String[] args) {
        // quickSorts mergeSort
        int [] arr = {5, 4, 1, 30, 2};

        //bSort(arr);
        findGreatestElement(arr);

        //System.out.println("sorted array = " + Arrays.toString(arr));
    }

    public static void findGreatestElement(int [] arr) {
        int greatestElement = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > greatestElement) {
                greatestElement = arr[i];
                index = i;
            }
        }

        System.out.println("greatestElement = " + greatestElement);
        System.out.println("index = " + index);
    }


    public static void bSort (int [] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted=false;
                }
            }
            System.out.println("curr arr = " + Arrays.toString(arr));
        }
    }
}
