package module3.lesson2;

public class SwitchTest {

    public static void main(String[] args) {
        //ctrl alt l
        String cardType = "Gold";
        switch (cardType) {
            case "Regular": {
                System.out.println("you have a regular card!");
            }
            break;
            case "Gold": {
                System.out.println("you have gold card!");
            }
            break;
            default: {
                System.out.println("unknown card type");
            }
        }
    }
}
