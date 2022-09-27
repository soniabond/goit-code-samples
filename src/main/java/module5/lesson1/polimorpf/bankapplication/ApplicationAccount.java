package module5.lesson1.polimorpf.bankapplication;

import java.util.Objects;

public class ApplicationAccount {

    private String accountNumber = "32169498sdgsdg";

    private Card[] myCards;

    public void initCard() {
        myCards = new Card[3];
        Card privatbankCard = new PrivatbankCard();
        privatbankCard.setBalance(14000.15);
        privatbankCard.setCardNumber("6546845646546");
        Card monobankCard = new MonobankCard();
        monobankCard.setBalance(4000.90);
        monobankCard.setCardNumber("9879464546544");
        myCards[0] = privatbankCard;
        myCards[1] = monobankCard;
    }

    public void deleteAllBankCards(String bankName) {
        Class bankClass;
        switch (bankName) {
            case "mono":
                bankClass = MonobankCard.class;
                break;
            case "privat":
                bankClass = PrivatbankCard.class;
                break;
            default:
                throw new RuntimeException("Undefined bank");
        }
        for(int i = 0; i < myCards.length; i++) {
            if(myCards[i] != null && (bankClass.equals(myCards[i].getClass()))) {
                myCards[i] = null;
            }
        }
    }

    public void addCard(Card cardToAdd) {

        boolean cardExists = false;

        for(Card card: myCards) {
            if(cardToAdd.equals(card)) {
                cardExists = true;
            }
        }

        if (!cardExists) {
            myCards[2] = cardToAdd;
        } else {
            System.out.println("You are trying to add duplicate");
        }
    }

    public void getAllCardsInfo() {
        for(Card card: myCards) {
            System.out.println(card);
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
