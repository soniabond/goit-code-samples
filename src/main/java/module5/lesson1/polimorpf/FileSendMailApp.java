package module5.lesson1.polimorpf;

public class FileSendMailApp extends SendMailApp{

    private String mails = "mail1@gmai.com 2@gmail.com";
    @Override
    public String[] retrieveStudentMails() {
        System.out.println("FileSendMailApp works");
        return mails.split(" ");
    }
}
