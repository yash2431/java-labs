import java.util.*;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List Example:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Set Example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("\nSet Example:");
        for (int num : set) {
            System.out.println(num);
        }

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 40);
        System.out.println("\nMap Example:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println("\nQueue Example:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
