package module6.lesson2;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        new ScannerTest().getUserDataFromConsole();
    }

    public void getUserDataFromConsole() {
        System.out.println("enter your phone number");
        long phoneNumber = 0;
        try (Scanner scanner = new Scanner(System.in); Scanner scanner1 = new Scanner("asfasdf")) {
            phoneNumber = scanner.nextLong();
            if (phoneNumber > 999999999) {
               throw new PhoneNumberException();
            }
        } catch (InputMismatchException e) {
            System.out.println("user entered non numeric phone number");
        } catch (PhoneNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("We continue without phone number " + phoneNumber);
        }

        System.out.println("phoneNumber = " + phoneNumber);
    }
}
