package module6.lesson1.polimorpf.bankapplication;

public class PrivatbankCard extends Card {
    private double commission = 0.012;
    @Override
    public double withdrawMoney(double amountToWithdraw) {
        System.out.println("withdrawMoney from PrivatbankCard");
        double commissionAmount = amountToWithdraw * commission;
        double moneyToWithdrawFromAccount = amountToWithdraw;
        if (commissionAmount > 40) {
            moneyToWithdrawFromAccount += commissionAmount;
        } else {
            moneyToWithdrawFromAccount += 40;
        }
        balance -= moneyToWithdrawFromAccount;
        return amountToWithdraw;
    }

    @Override
    public String getCardBank() {
        return "PrivatBank";
    }

    public void someMethod() {
        System.out.println("Hello");
    }
}
