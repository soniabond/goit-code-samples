package module10;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;

public class CustomInputStream extends InputStream {

    private Queue<Byte> bytes = new ArrayDeque<>();

    public CustomInputStream(String inputString) {
        byte[] strBytes = inputString.getBytes(StandardCharsets.UTF_8);
        for (byte b : strBytes) {
            bytes.add(b);
        }
    }
    @Override
    public int read() throws IOException {
        if (available() == 0) {
            return -1;
        }
        int b = bytes.poll();
        return b >= 0 ? b : 255 + b + 1;
    }

    @Override
    public int available() throws IOException {
        return bytes.size();
    }
}
