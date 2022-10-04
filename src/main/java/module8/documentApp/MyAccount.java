package module8.documentApp;

public class MyAccount {

    private DocumentService documentService = new Fop3GroupReportService();

    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount();
        myAccount.workWithDoc();
    }

    public void workWithDoc(){
        Document document = documentService.generate();
        documentService.fill(document, "1");
        documentService.sign(document, "myKey");
        documentService.send(document);
    }
}
