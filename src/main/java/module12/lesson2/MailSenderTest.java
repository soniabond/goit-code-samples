package module12.lesson2;

public class MailSenderTest {
    public static void main(String[] args) {
        MailSender mailSender = new MailSenderImpl();
        System.out.println("Started....");
        for (int i = 0; i < 20; i++) {
            mailSender.send(
                    new Email(i + "@gmail.com", "Content" + i)
            );
        }
        System.out.println("Continue other operations....");
    }
}
