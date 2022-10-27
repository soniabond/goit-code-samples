package module11;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EndlessStreamTest {

    //Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random.
    public static void main(String[] args) {
        MyRandom random = new MyRandom(5, 6);
        Stream<Integer> integerStream = Stream.iterate(1, (seed) -> random.seed(seed).next());
        integerStream.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
