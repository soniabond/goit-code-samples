package module7;

import java.util.Arrays;

public class Stopwatch {

    private final Time[] loops = {
            new Time(1, 2, 3),
            new Time(2, 5, 9)
    };

    public Time[] getLoops() {
        return Arrays.copyOf(loops, loops.length);
    }
}
