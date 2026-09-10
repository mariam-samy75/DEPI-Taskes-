package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Java Collections - Items Management ==========\n");

        // 1. One-Dimensional Array
        demonstrateArray();

        // 2. Two-Dimensional Array
        demonstrate2DArray();

        // 3. List Interface
        demonstrateList();

        // 4. ArrayList
        demonstrateArrayList();

        // 5. LinkedList
        demonstrateLinkedList();

        // 6. Set
        demonstrateSet();

        // 7. HashSet
        demonstrateHashSet();

        // 8. HashMap
        demonstrateHashMap();
    }

    // 1. One-Dimensional Array
    static void demonstrateArray() {
        System.out.println("1. ONE-DIMENSIONAL ARRAY");
        System.out.println("------------------------");
        
        Item[] items = new Item[4];
        items[0] = new Item(101, 500, "Laptop");
        items[1] = new Item(102, 700, "Mouse");
        items[2] = new Item(103, 25000, "Monitor");
        items[3] = new Item(104, 7000, "Keyboard");

        System.out.println("Array storage (fixed size):");
        for (Item item : items) {
            System.out.println("  " + item);
        }
        System.out.println("✓ Advantage: Fast access by index, fixed memory\n");
    }

    // 2. Two-Dimensional Array
    static void demonstrate2DArray() {
        System.out.println("2. TWO-DIMENSIONAL ARRAY");
        System.out.println("------------------------");
        
        double[][] itemData = {
            {101, 500},
            {102, 700},
            {103, 25000},
            {104, 7000}
        };

        System.out.println("2D Array storage (ID, Price):");
        System.out.println(String.format("%-6s %-10s", "ID", "Price"));
        System.out.println("------------------");
        for (double[] data : itemData) {
            System.out.println(String.format("%-6.0f %-10.0f", data[0], data[1]));
        }
        System.out.println("✓ Advantage: Organize tabular data, efficient for structured info\n");
    }

    // 3. List Interface (using ArrayList as implementation)
    static void demonstrateList() {
        System.out.println("3. LIST INTERFACE");
        System.out.println("-----------------");
        
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(101, 500, "Laptop"));
        itemList.add(new Item(102, 700, "Mouse"));
        itemList.add(new Item(103, 25000, "Monitor"));

        System.out.println("List - Ordered, allows duplicates:");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("  [" + i + "] " + itemList.get(i));
        }
        System.out.println("✓ Advantage: Ordered collection, supports index-based access\n");
    }

    // 4. ArrayList
    static void demonstrateArrayList() {
        System.out.println("4. ARRAYLIST");
        System.out.println("------------");
        
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(101, 500, "Laptop"));
        items.add(new Item(102, 700, "Mouse"));
        items.add(new Item(103, 25000, "Monitor"));
        items.add(new Item(104, 7000, "Keyboard"));

        System.out.println("ArrayList (dynamic size, ordered):");
        items.forEach(item -> System.out.println("  " + item));

        // Modify
        System.out.println("\nAfter modifying price of item at index 0:");
        items.get(0).setPrice(450);
        System.out.println("  " + items.get(0));

        System.out.println("✓ Advantage: Dynamic size, fast random access, can add/remove elements\n");
    }

    // 5. LinkedList
    static void demonstrateLinkedList() {
        System.out.println("5. LINKEDLIST");
        System.out.println("-------------");
        
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item(101, 500, "Laptop"));
        items.add(new Item(102, 700, "Mouse"));
        items.add(new Item(103, 25000, "Monitor"));

        System.out.println("LinkedList (doubly-linked nodes):");
        items.forEach(item -> System.out.println("  " + item));

        // Add at beginning
        items.addFirst(new Item(100, 300, "USB Cable"));
        System.out.println("\nAfter addFirst():");
        items.forEach(item -> System.out.println("  " + item));

        System.out.println("✓ Advantage: Fast insertion/deletion, good for queue/stack operations\n");
    }

    // 6. Set Interface
    static void demonstrateSet() {
        System.out.println("6. SET INTERFACE");
        System.out.println("----------------");
        
        Set<Item> itemSet = new HashSet<>();
        itemSet.add(new Item(101, 500, "Laptop"));
        itemSet.add(new Item(102, 700, "Mouse"));
        itemSet.add(new Item(103, 25000, "Monitor"));
        itemSet.add(new Item(101, 500, "Laptop")); // Duplicate - won't be added

        System.out.println("Set (no duplicates, unordered):");
        itemSet.forEach(item -> System.out.println("  " + item));
        System.out.println("✓ Note: Duplicate (ID 101) not added");
        System.out.println("✓ Advantage: No duplicates, fast lookup\n");
    }

    // 7. HashSet
    static void demonstrateHashSet() {
        System.out.println("7. HASHSET");
        System.out.println("-----------");
        
        HashSet<Item> items = new HashSet<>();
        items.add(new Item(101, 500, "Laptop"));
        items.add(new Item(102, 700, "Mouse"));
        items.add(new Item(103, 25000, "Monitor"));
        items.add(new Item(104, 7000, "Keyboard"));

        System.out.println("HashSet (hash-based, unordered):");
        items.forEach(item -> System.out.println("  " + item));

        // Search
        boolean contains = items.stream().anyMatch(item -> item.getId() == 102);
        System.out.println("\nSearch for ID 102: " + (contains ? "Found" : "Not Found"));

        System.out.println("✓ Advantage: O(1) average lookup time, no duplicates\n");
    }

    // 8. HashMap
    static void demonstrateHashMap() {
        System.out.println("8. HASHMAP");
        System.out.println("-----------");
        
        HashMap<Integer, Item> itemMap = new HashMap<>();
        itemMap.put(101, new Item(101, 500, "Laptop"));
        itemMap.put(102, new Item(102, 700, "Mouse"));
        itemMap.put(103, new Item(103, 25000, "Monitor"));
        itemMap.put(104, new Item(104, 7000, "Keyboard"));

        System.out.println("HashMap (key-value pairs):");
        itemMap.forEach((id, item) -> System.out.println("  Key: " + id + " => " + item));

        // Search by key
        System.out.println("\nSearch for key 103: " + itemMap.get(103));
        System.out.println("Key 105 exists: " + itemMap.containsKey(105));

        // Remove
        itemMap.remove(102);
        System.out.println("\nAfter removing ID 102:");
        itemMap.forEach((id, item) -> System.out.println("  Key: " + id + " => " + item));

        System.out.println("✓ Advantage: O(1) average access by key, efficient for lookups\n");
    }
}
