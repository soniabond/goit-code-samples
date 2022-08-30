package module3.lesson1;

public class ConditionOperations {
    public static void main(String[] args) {
        int age = 19;

//        if (age >= 16 && age < 18) {
//            System.out.println("you can buy only 16+ tickets");
//        } else if (age >= 18) {
//            System.out.println("You can buy ticket for 18+");
//        } else {
//            System.out.println("SOrry you can not buy tickets only for children");
//        }

        boolean isBankClient = true;
        boolean isGoldCard = true;
        int discount = 0;
//        if (isBankClient) {
//            System.out.println("You can do simple transactions");
//            if (isGoldCard) {
//                discount = 20;
//                System.out.println("you have personal assistant");
//            } else {
//                System.out.println("we propose upgrade to gold");
//                discount = 10;
//            }
//        } else {
//            System.out.println("Please register");
//        }
//
//        float price = 140.0f;
//
//        System.out.println(price * discount / 100);

//        if (age >= 18) {
//            System.out.println("You can buy ticket for 18+");
//        } else {
//            System.out.println("SOrry you can not buy tickets only for children");
//        }

        String result = age >= 18 ? "You can buy ticket for 18+" : "SOrry you can not buy tickets only for children";
        System.out.println("result = " + result);
    }

    public static void resolveSLientProvoleges() {

    }
}
