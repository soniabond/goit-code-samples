package module7.lesson2;

import java.io.InputStream;
import java.time.LocalDate;

public class UserBuilderTest {

    public static void main(String[] args) {

        User user = new User.Builder()
                .id(1)
                .mail("sdgsdg")
                .lastUpdates(LocalDate.now())
                .name("sdrgsd")
                .surname("sgsgds")
                .phone("dfgdfg")
                .name("namedfd")
                .build();

        System.out.println(user);
    }
}
