package module7;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ImmutableTest {

    public static void main(String[] args) {
//        Time time1 = new Time(2, 4, 8);
//        Time time2 = new Time(3, 8, 16);
//        System.out.println("time1 = " + time1);
//        System.out.println("time2 = " + time2);
//        Time time3 = time1.addTime(time2);
//        System.out.println("time3 = " + time3);

//        Stopwatch stopwatch = new Stopwatch();
//        System.out.println("stopwatch.getLoops() = " + Arrays.toString(stopwatch.getLoops()));
//        Time[] loops = stopwatch.getLoops();
//        loops[1] = new Time(2, 4, 8);
//
//        System.out.println("stopwatch.getLoops() = " + Arrays.toString(stopwatch.getLoops()));

//        MutableTime mutableTime = new MutableTime(1, 5, 8);
//        PaymentTransaction paymentTransaction = new PaymentTransaction(123546, mutableTime);
//        System.out.println("paymentTransaction = " + paymentTransaction);
//        //mutableTime.setHours(5);
//        paymentTransaction.getTime().setHours(56);
//        System.out.println("paymentTransaction = " + paymentTransaction);

//        BigDecimal bigDecimal = new BigDecimal("1.54645");
//        BigDecimal bigDecimal1 = new BigDecimal("125.45453453");
//        System.out.println("bigDecimal.add(bigDecimal1) = " + bigDecimal.add(bigDecimal1));

//        String str = "str";
//        String str1 = new String("str");
//        System.out.println(str1 == str);

        byte [] bytes = {74, 65, 86, 65};
        System.out.println(new String(bytes, StandardCharsets.UTF_16BE));
        System.out.println(new String(bytes));
    }
}
