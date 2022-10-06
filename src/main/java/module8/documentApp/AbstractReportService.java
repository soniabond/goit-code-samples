package module8.documentApp;

public abstract class AbstractReportService implements ReportService {

    private String dpsMail = "dps@gmail.com";

    @Override
    public void sign(Document document, String key) {
        document.setKey(key);
        System.out.println("You signed document by key " + key);
    }

    @Override
    public void send(Document document) {
        System.out.println("your document sent to DPS " + dpsMail);
    }
}
