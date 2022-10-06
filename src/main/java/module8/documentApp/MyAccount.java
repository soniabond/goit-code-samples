package module8.documentApp;

public class MyAccount {

    private DocumentService documentService = new ExtractFromRegisterService();

    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount();
        myAccount.workWithDoc();
    }

    public void workWithDoc(){
        documentService.generate();
    }
}
