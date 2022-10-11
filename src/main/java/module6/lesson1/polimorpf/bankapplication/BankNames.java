package module6.lesson1.polimorpf.bankapplication;

public enum BankNames {
    PRIVAT("Privat Bank", 1),
    MONO("Universal bank", 2);

    private String value;
    private int id;

    BankNames(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}
