package module11;

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

        // насправді порівняння це така функція, що приймає 2 агрументи
        // і повертає якесь число
        // тепер метод compare можна перевизначити на допомогою лямбди
//        Comparator<String> comparator = (String o1, String o2) -> {
//            return result.get(o1) < result.get(o2) ? 1 : -1;
//        };

        Map<String, Integer> treeMap = new TreeMap<>((o1, o2) -> result.get(o1) < result.get(o2) ? 1 : -1);
        treeMap.putAll(result);
        System.out.println("treeMap = " + treeMap);

        InterfaceTest interfaceTest = d -> d + 5;
    }
}
