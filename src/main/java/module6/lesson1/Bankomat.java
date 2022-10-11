package module6.lesson1;

public class Bankomat {

    public static void main(String[] args) {
          BankAccount bankAccount = new BankAccount();
//        System.out.println("bankAccount.moneyAmount = " + bankAccount.getMoneyAmount());
//        bankAccount.withdrMoney(100);
//        System.out.println("bankAccount.moneyAmount = " +  bankAccount.getMoneyAmount());
//        bankAccount.withdrMoney(11000);
//        System.out.println("bankAccount.moneyAmount = " +  bankAccount.getMoneyAmount());

        System.out.println("bankAccount.getCurrency() = " + bankAccount.getCurrency());
        bankAccount.setCurrency("USD");
        System.out.println("bankAccount.getCurrency() = " + bankAccount.getCurrency());

    }
}
