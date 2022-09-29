package module7.lesson2;

import java.util.Arrays;

public class CustomStringBuilder {

    private final int INIT_CAPACITY = 16;

    private byte [] values = new byte[INIT_CAPACITY];

    private int currentLength;

    public void append(int valToAppend) {
        append(Integer.toString(valToAppend));
    }

    //  arraycopy javadoc
    public void append(String valToAppend) {
        if (valToAppend == null) {
            return;
        }
        byte[] bytes = valToAppend.getBytes();

        int minRequiredLength = currentLength + bytes.length;
        if (minRequiredLength > values.length) {
            int newLength = values.length * 2;
            newLength = Math.max(newLength, minRequiredLength);
            values = Arrays.copyOf(values, newLength);
        }
        System.arraycopy(bytes, 0, values, currentLength, bytes.length);
        currentLength += bytes.length;
    }

    @Override
    public String toString() {
        return new String(values, 0, currentLength);
    }

    public static void main(String[] args) {
        CustomStringBuilder customStringBuilder = new CustomStringBuilder();
        customStringBuilder.append(1);
        customStringBuilder.append(2);
        customStringBuilder.append(3);
        System.out.println(customStringBuilder);
    }
}
