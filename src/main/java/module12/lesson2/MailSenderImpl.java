package module12.lesson2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MailSenderImpl implements MailSender {

    //private Executor executor = Executors.newSingleThreadExecutor();

    private ExecutorService executor = Executors.newFixedThreadPool(8);
    @Override
    public void send(Email email) {
        executor.execute(() -> performMailSend(email));
    }

    private void performMailSend(Email email) {
        // важка логіка надсиланн повідомлень
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(email);
    }
}
