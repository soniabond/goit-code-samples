package module10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class WhoOwesMoney {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("money.txt");
        Scanner scanner = new Scanner(inputStream);
        Map<String, Integer> result = new HashMap<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String [] data = line.split(" ");
            String name = data[0];
            Integer amount = Integer.parseInt(data[1]);
            if (!result.containsKey(name)) {
                result.put(name, amount);
            } else {
                result.put(name, result.get(name) + amount);
            }
        }
        System.out.println(result);

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        Map<String, Integer> treeMap = new TreeMap<>(comparator);

    }
}
