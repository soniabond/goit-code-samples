package module8.documentApp;

public class Fop3GroupReportService extends AbstractReportService {

    private String docData = "for 3 group doc";
    @Override
    public Document generate() {
        Document document = new Document();
        document.setDocData(docData);
        return document;
    }

    @Override
    public void fill(Document document, String dataToFill) {
    }
}
