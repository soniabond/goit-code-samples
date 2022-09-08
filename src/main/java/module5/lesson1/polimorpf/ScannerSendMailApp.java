package module5.lesson1.polimorpf;

import java.util.Scanner;

public class ScannerSendMailApp extends SendMailApp {

    @Override
    public String [] retrieveStudentMails() {
        System.out.println("ScannerSendMailApp works");
        System.out.println("enter mails");
        Scanner scanner = new Scanner(System.in);
        String mailsLine = scanner.nextLine();
        String [] mais = mailsLine.split(" ");
        return mais;
    };
}
