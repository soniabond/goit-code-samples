package module6.lesson2;

public class PhoneNumberException extends Exception {
    @Override
    public String getMessage() {
        return "you entered incorrect prone number";
    }
}
