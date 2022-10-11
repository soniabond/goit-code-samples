package module6.lesson1.polimorpf.bankapplication;

import java.util.Arrays;

public class BankNamesEnumTest {

    public static void main(String[] args) {
        BankNames[] values = BankNames.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        for(BankNames bankName: values) {
            System.out.println(bankName.getValue());
            System.out.println(bankName.getId());
        }

        String mono = "Mxfbhfchfd";
        BankNames result = null;
        for(BankNames bankName: values) {
            if (bankName.name().equals(mono)) {
                result = bankName;
                break;
            }
        }
        System.out.println(result);

    }
}
