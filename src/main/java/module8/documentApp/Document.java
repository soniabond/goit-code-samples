package module8.documentApp;

public class Document {
    private String docData;
    private String key;
    private String dataToFill;

    public String getDocData() {
        return docData;
    }

    public void setDocData(String docData) {
        this.docData = docData;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDataToFill() {
        return dataToFill;
    }

    public void setDataToFill(String dataToFill) {
        this.dataToFill = dataToFill;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docData='" + docData + '\'' +
                ", key='" + key + '\'' +
                ", dataToFill='" + dataToFill + '\'' +
                '}';
    }
}
