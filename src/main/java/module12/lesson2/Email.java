package module12.lesson2;

public class Email {
    private final String to;
    private final String text;

    public Email(String to, String text) {
        this.to = to;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Email [ " + text + " ] sent to [ " + to + " ].";
    }
}
