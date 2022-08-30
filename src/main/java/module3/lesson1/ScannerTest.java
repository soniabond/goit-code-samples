package module3.lesson1;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        InputStream in = System.in; // creates input stream from keyboars
        Scanner scanner = new Scanner(in);
        String line = scanner.nextLine(); // read line from stream, delimiter \n
        int inputInt = scanner.nextInt(); //read int from stream, delimiter
        System.out.println(inputInt);
        mult();
    }

    public static void mult() {
        InputStream in = System.in; // creates input stream from keyboars
        Scanner scanner = new Scanner(in);
        int add1 = scanner.nextInt();
        int add2 = scanner.nextInt();
        int mult = add1 * add2;
        System.out.println("mult = " + mult);
    }
}
