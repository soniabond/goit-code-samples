package module5.lesson1.polimorpf.bankapplication;

public class ApplicationAccount {

    private String accountNumber = "32169498sdgsdg";

    private Card[] myCards;

    public void initCard() {
        myCards = new Card[2];
        Card privatbankCard = new PrivatbankCard();
        privatbankCard.setBalance(14000.15);
        Card monobankCard = new MonobankCard();
        monobankCard.setBalance(4000.90);
        myCards[0] = privatbankCard;
        myCards[1] = monobankCard;
    }

    public void getAllCardsInfo() {
        for(Card card: myCards) {
            System.out.println("card.getCardBank() = " + card.getCardBank());
            System.out.println("card.getBalance() = " + card.getBalance());
            System.out.println("______________________________________");
        }
    }


    public void calcOverallBalance() {
        double sum = 0;
        for (Card card: myCards) {
            sum += card.getBalance();
        }
        System.out.println("Overall Balance is : " + sum);
    }

    public double withdrawMoneyFromCard(Card card, double amountToWithdraw) {
        return card.withdrawMoney(amountToWithdraw);
    }

}
