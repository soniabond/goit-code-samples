package module7.lesson1;

public class PaymentTransaction {

    private final int transactionNumber;

    private final MutableTime time;

    public PaymentTransaction(int transactionNumber, MutableTime time) {
        this.transactionNumber = transactionNumber;
        this.time = time.copy();
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public MutableTime getTime() {
        return time.copy();
    }

    @Override
    public String toString() {
        return "PaymentTransaction{" +
                "transactionNumber=" + transactionNumber +
                ", time=" + time +
                '}';
    }
}
