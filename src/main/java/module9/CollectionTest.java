package module9;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
//        List<Double> intArray = new LinkedList<>();
//        intArray.add(1d);
//        intArray.add(2d);
//        intArray.add(3d);
//        intArray.add(4d);
//        intArray.add(5d);
//        intArray.add(3d);
//        intArray.add(3d);
//        for(Double item: intArray) {
//            System.out.print(item);
//            System.out.print(' ');
//        }
//        System.out.println();
//        System.out.println("intArray.get(1) = " + intArray.get(1));
//        System.out.println("intArray.contains(5) = " + intArray.contains(5d));
//        System.out.println("intArray.contains(7) = " + intArray.contains(7d));
//        System.out.println("intArray.indexOf(5) = " + intArray.indexOf(5d));
//        System.out.println("intArray.isEmpty() = " + intArray.isEmpty());
//        intArray.remove(3d);
//        for(Double item: intArray) {
//            System.out.print(item);
//            System.out.print(' ');
//        }
//        System.out.println();
//        intArray.removeAll(List.of(new Double[]{1d, 2d, 3d}));
//        for(Double item: intArray) {
//            System.out.print(item);
//            System.out.print(' ');
//        }
//        System.out.println();


        Set<Double> doubles = new HashSet<>();
        doubles.add(5d);
        doubles.add(5d);
        doubles.add(3d);
        for(Double item: doubles) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("doubles.contains(5d) = " + doubles.contains(5d));
    }
}
