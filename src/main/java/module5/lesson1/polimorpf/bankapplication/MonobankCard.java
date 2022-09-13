package module5.lesson1.polimorpf.bankapplication;

public class MonobankCard extends Card {

    private double commission = 0.04;
    @Override
    public double withdrawMoney(double amountToWithdraw) {
        System.out.println("withdrawMoney from MonobankCard");
        double moneyToWithdrawFromAccount = amountToWithdraw * (1 + commission);
        balance -= moneyToWithdrawFromAccount;
        return amountToWithdraw;
    }

    @Override
    public String getCardBank() {
        return "Monobank";
    }
}
