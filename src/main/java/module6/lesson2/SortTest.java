package module6.lesson2;

import java.util.Arrays;
import java.util.Objects;

public class SortTest {

    public static void main(String[] args) throws Exception{

        Integer array [] = {5, 7, 8, 30, 1};
        sort(array, new Comparator() {
            @Override
            public <T> boolean compare(T val1, T val2) {
                return (Integer)val1 < (Integer) val2;
            }
        });
        //System.out.println("array = " + Arrays.toString(array));

        String arrayStr [] = {"aaa", "aab", "sdfgsd", "hhhh", "EEEE"};
        sort(arrayStr, new Comparator() {
            @Override
            public <T> boolean compare(T val1, T val2) {
                return ((String)val1).compareTo((String) val2) > 0;
            }
        });
        System.out.println("array = " + Arrays.toString(arrayStr));

    }

    public static <T> void sort (T [] arr, Comparator comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(comparator.compare(arr[i], arr[i + 1])) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted=false;
                }
            }
        }
    }
}
