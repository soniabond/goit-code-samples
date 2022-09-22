package module6.lesson2;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) throws Exception{

        int array [] = {5, 7, 8, 30, 1};
        sort(array, new Comparator() {
            @Override
            public boolean compare(int val1, int val2) {
                return val1 > val2;
            }
        });
        System.out.println("array = " + Arrays.toString(array));

    }

    public static void sort (int [] arr, Comparator comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(comparator.compare(arr[i], arr[i + 1])) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted=false;
                }
            }
        }
    }
}
