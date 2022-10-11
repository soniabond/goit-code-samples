package module6.lesson1;

public class BankAccount {

    private String ownerName = "Ivan Petrov";
    private String accountNumber = "123546987897";
    private long moneyAmount = 10000;
    private String currency = "UAH";

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void topUp(long amount) {
        moneyAmount += amount;
    }

    public void withdrMoney(long amount) {
        if(amount <= moneyAmount) {
            moneyAmount -= amount;
        } else {
            System.out.println("You nave not enough money in you account. " +
                    "You have only " + moneyAmount + ". Do you want to withdraw them?");
        }
    }

}
