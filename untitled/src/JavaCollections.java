// Day 5 - 2

import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {

        // =========================
        // 1. ArrayList
        // =========================
        System.out.println("===== ArrayList =====");

        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Names: " + names);
        System.out.println("First name: " + names.get(0));

        names.set(1, "Robert");
        names.remove("Charlie");

        System.out.println("After update: " + names);
        System.out.println("Size: " + names.size());


        // =========================
        // 2. LinkedList
        // =========================
        System.out.println("\n===== LinkedList =====");

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        cities.addFirst("Delhi");
        cities.addLast("Mumbai");

        System.out.println("Cities: " + cities);

        cities.removeFirst();
        cities.removeLast();

        System.out.println("After removing first and last: " + cities);


        // =========================
        // 3. HashSet
        // =========================
        System.out.println("\n===== HashSet =====");

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate will be ignored

        System.out.println("Numbers: " + numbers);

        System.out.println("Contains 20: " + numbers.contains(20));

        numbers.remove(10);

        System.out.println("After removing 10: " + numbers);


        // =========================
        // 4. TreeSet
        // =========================
        System.out.println("\n===== TreeSet =====");

        TreeSet<Integer> sortedNumbers = new TreeSet<>();

        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(30);
        sortedNumbers.add(20);
        sortedNumbers.add(40);

        System.out.println("Sorted numbers: " + sortedNumbers);

        System.out.println("First: " + sortedNumbers.first());
        System.out.println("Last: " + sortedNumbers.last());


        // =========================
        // 5. HashMap
        // =========================
        System.out.println("\n===== HashMap =====");

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("Students: " + students);

        System.out.println("Student 101: " + students.get(101));

        students.put(102, "Robert");

        System.out.println("After updating: " + students);

        students.remove(103);

        System.out.println("After removing 103: " + students);


        // =========================
        // 6. TreeMap
        // =========================
        System.out.println("\n===== TreeMap =====");

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "John");
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(104, "David");

        System.out.println("Employees: " + employees);

        System.out.println("First key: " + employees.firstKey());
        System.out.println("Last key: " + employees.lastKey());


        // =========================
        // 7. Queue
        // =========================
        System.out.println("\n===== Queue =====");

        Queue<String> queue = new LinkedList<>();

        queue.offer("Person 1");
        queue.offer("Person 2");
        queue.offer("Person 3");

        System.out.println("Queue: " + queue);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);


        // =========================
        // 8. Stack
        // =========================
        System.out.println("\n===== Stack =====");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after pop: " + stack);


        // =========================
        // 9. Iterating ArrayList
        // =========================
        System.out.println("\n===== Iterating ArrayList =====");

        for (String name : names) {
            System.out.println(name);
        }


        // =========================
        // 10. Iterating HashMap
        // =========================
        System.out.println("\n===== Iterating HashMap =====");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                    "ID: " + entry.getKey() +
                            ", Name: " + entry.getValue()
            );
        }
    }
}
