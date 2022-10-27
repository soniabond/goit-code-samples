package module11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamZipper {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream2 = Stream.of(10, 20, 30, 40);
        zipIterator(stream1, stream2)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static Stream<Integer> zip(Stream<Integer> first, Stream<Integer> second){
        List<Integer> firstList = first.collect(Collectors.toList());
        List<Integer> secondList = second.collect(Collectors.toList());
        int minSize = Math.min(firstList.size(), secondList.size());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < minSize; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        return result.stream();
    }

    public static Stream<Integer> zipIterator(Stream<Integer> first, Stream<Integer> second) {
        Iterator<Integer> iteratorFirst = first.iterator();
        Iterator<Integer> iteratorSecond = second.iterator();
        List<Integer> result = new ArrayList<>();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            result.add(iteratorFirst.next());
            result.add(iteratorSecond.next());
        }
        return result.stream();
    }
}
