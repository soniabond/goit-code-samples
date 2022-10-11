package module6.lesson1.polimorpf.bankapplication;

import java.util.Objects;

public abstract class Card {
    protected double balance;

    protected String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public abstract double withdrawMoney(double amountToWithdraw);

    public abstract String getCardBank();
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "balance: " + balance + ", card number: "
                + cardNumber + ", bank: " + getCardBank();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNumber.equals(card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber);
    }
}
