package module7.lesson2;

public class StringBuilderTest {

    public static void main(String[] args) {
        CustomStringBuilder stringBuilder = new CustomStringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
        String res = stringBuilder.toString();
        System.out.println("time spent = " + (end - start));
    }
}
