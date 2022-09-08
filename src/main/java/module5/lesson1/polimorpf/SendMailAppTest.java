package module5.lesson1.polimorpf;

public class SendMailAppTest {
    public static void main(String[] args) {
        SendMailApp sendMailApp = new ScannerSendMailApp();
        String [] mails = sendMailApp.retrieveStudentMails();
        sendMailApp.sendMails(mails);

        sendMailApp = new FileSendMailApp();
        mails = sendMailApp.retrieveStudentMails();
        sendMailApp.sendMails(mails);
    }
}
