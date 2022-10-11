package module6.lesson1.polimorpf.bankapplication;

import java.util.HashSet;
import java.util.Set;

public class CardSetTest {
    public static void main(String[] args) {
        Set<Card> cardSet = new HashSet<>();
        cardSet.add(new MonobankCard());
        cardSet.add(new PrivatbankCard());
    }
}
