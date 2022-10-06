package module5.lesson1.polimorpf.bankapplication;

public class ApplicationAccountTest {

    // private
    // protected
    // package default 
    // public

    public static void main(String[] args) {
//        Card privatbankCard = new PrivatbankCard();
//        privatbankCard.setBalance(14000.15);
//
//        ApplicationAccount applicationAccount = new ApplicationAccount();
//        double myMoney = applicationAccount.withdrawMoneyFromCard(privatbankCard, 150);
//        System.out.println("You have withdrawn " + myMoney);
//        System.out.println("Your balance is " + privatbankCard.getBalance());

        ApplicationAccount applicationAccount = new ApplicationAccount();
        applicationAccount.initCard();
        applicationAccount.getAllCardsInfo();
        System.out.println("_____________");
        //applicationAccount.calcOverallBalance();
        Card privatbankCardNew = new PrivatbankCard();
        privatbankCardNew.setBalance(14000.15);
        privatbankCardNew.setCardNumber("6446845646576");
        applicationAccount.addCard(privatbankCardNew);
        applicationAccount.getAllCardsInfo();
        System.out.println("_____________");
        applicationAccount.deleteAllBankCards(BankNames.MONO);
        applicationAccount.getAllCardsInfo();
    }
}
