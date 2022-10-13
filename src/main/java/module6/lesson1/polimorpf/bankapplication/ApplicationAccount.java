package module6.lesson1.polimorpf.bankapplication;

import java.util.HashSet;
import java.util.Set;

public class ApplicationAccount {

    private String accountNumber = "32169498sdgsdg";

    private Set<Card> myCards = new HashSet<>();

    public void initCard() {
        Card privatbankCard = new PrivatbankCard();
        privatbankCard.setBalance(14000.15);
        privatbankCard.setCardNumber("6546845646546");
        Card monobankCard = new MonobankCard();
        monobankCard.setBalance(4000.90);
        monobankCard.setCardNumber("9879464546544");
        myCards.add(privatbankCard);
        myCards.add(monobankCard);
    }

    public void deleteAllBankCards(BankNames bankName) {
        Class bankClass = null;
        switch (bankName) {
            case MONO: {
                bankClass = MonobankCard.class;
            } break;
            case PRIVAT: {
                bankClass = PrivatbankCard.class;
            } break;
        }

        // TODO come back with STREAM API coming soon........
        for (Card card: myCards) {
            if(bankClass != null && bankClass.equals(card.getClass())) {
                myCards.remove(card);
                break;
            }
        }
    }

    public void addCard(Card cardToAdd) {

        boolean cardExists = false;

        if (!myCards.contains(cardToAdd)) {
            myCards.add(cardToAdd);
        } else {
            System.out.println("You are trying to add duplicate");
        }
    }

    public void getAllCardsInfo() {
        System.out.println(myCards);
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
