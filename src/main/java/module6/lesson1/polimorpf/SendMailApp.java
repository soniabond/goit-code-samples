package module6.lesson1.polimorpf;

public abstract class SendMailApp {

    public abstract String [] retrieveStudentMails();

    public void sendMails(String [] emails) {
        for(String mail: emails) {
            System.out.println("mail " + mail + " has been send.");
        }
    }
}
