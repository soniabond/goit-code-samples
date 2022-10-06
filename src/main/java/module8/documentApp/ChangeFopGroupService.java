package module8.documentApp;

public class ChangeFopGroupService extends AbstractReportService {

    private String data = "Change from to group %s";
    @Override
    public Document generate() {
        Document document = new Document();
        document.setDocData(data);
        System.out.println("document generated " + document);
        return document;
    }

    @Override
    public void fill(Document document, String dataToFill) {
        String data = document.getDocData();
        document.setDocData(data.replaceAll("%s", dataToFill));
        System.out.println("document filled with data " + document);
    }
}
