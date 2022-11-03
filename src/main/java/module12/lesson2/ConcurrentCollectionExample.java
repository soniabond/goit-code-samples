package module12.lesson2;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentCollectionExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Long> list = new CopyOnWriteArrayList<>();

        Map<Long, Integer> map = new ConcurrentHashMap<>();

        Set<Long> set = new ConcurrentHashMap<Long, Boolean>().keySet();

        Queue<Long> queue = new LinkedBlockingQueue<>();
    }
}
