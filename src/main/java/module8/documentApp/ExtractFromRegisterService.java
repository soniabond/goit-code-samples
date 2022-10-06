package module8.documentApp;

public class ExtractFromRegisterService implements DocumentService {
    @Override
    public Document generate() {
        System.out.println("Extract from register of fops created");
        return new Document();
    }
}
