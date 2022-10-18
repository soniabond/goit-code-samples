package module10;

//app they owe me money - a notebook name + amount of money

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) throws IOException {
//        InputStream inputStream = new CustomInputStream("12345");
//        Scanner scanner = new Scanner(inputStream);
//        System.out.println("scanner.nextInt() = " + scanner.nextInt());
//        InputStream inputStream = new CustomInputStream("Hello world " + ((char)-67));
//        Scanner scanner = new Scanner(inputStream);
//        System.out.println("scanner= " + scanner.nextLine());

//        File file = new File("test.txt");
//        System.out.println("file.exists() = " + file.exists());
//        if(file.exists()) {
//            try (InputStream fis = new FileInputStream(file);
//                 Scanner scanner = new Scanner(fis)) {
//                while (scanner.hasNext()) {
//                    String s = scanner.nextLine();
//                    System.out.println(s);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        OutputStream fos = new FileOutputStream("testOutput.txt");
        InputStream fis = new FileInputStream("test.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNext()) {
            fos.write(scanner.nextLine().getBytes());
        }
        //fos.write("\njava program".getBytes(StandardCharsets.UTF_8));
        fos.close();

        fis.close();
    }
}
