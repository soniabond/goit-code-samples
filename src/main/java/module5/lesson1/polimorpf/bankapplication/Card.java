package module5.lesson1.polimorpf.bankapplication;

public abstract class Card {
    protected double balance;

    public abstract double withdrawMoney(double amountToWithdraw);

    public abstract String getCardBank();
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
