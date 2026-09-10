import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Original Code
        System.out.println("========== CART & BILL SYSTEM ==========\n");
        Customer myCustomer = new Customer("Ahmed");
        
        Item item1 = new Item(101, "Laptop", 15000.0);
        Item item2 = new Item(102, "Mouse", 300.0);
        Item item3 = new Item(103, "Keyboard", 700.0);
        Cart myCart = new Cart();
        
        myCart.addItem(item1, 1); 
        myCart.addItem(item2, 2); 
        myCart.addItem(item3, 1); 

        myCustomer.addCart(myCart);
        Bill myBill = new Bill(myCart);
        myCustomer.addBill(myBill);

        System.out.println("--- Customer Details ---");
        myCustomer.printCustomerInfo();
        System.out.println("\n"); 
        myBill.printReceipt();
        
        // Collections Examples
        System.out.println("\n\n========== JAVA COLLECTIONS EXAMPLES ==========\n");
        
        demonstrateArray();
        demonstrate2DArray();
        demonstrateList();
        demonstrateArrayList();
        demonstrateLinkedList();
        demonstrateSet();
        demonstrateHashSet();
        demonstrateHashMap();
    }

    // 1. One-Dimensional Array
    static void demonstrateArray() {
        System.out.println("1. ONE-DIMENSIONAL ARRAY");
        System.out.println("------------------------");
        
        Item[] items = new Item[4];
        items[0] = new Item(101, "Laptop", 15000.0);
        items[1] = new Item(102, "Mouse", 300.0);
        items[2] = new Item(103, "Keyboard", 700.0);
        items[3] = new Item(104, "Monitor", 5000.0);

        System.out.println("Array storage (fixed size):");
        for (Item item : items) {
            System.out.println("  " + item.getItemName() + " - $" + item.getPrice());
        }
        System.out.println("✓ Advantage: Fast access by index, fixed memory\n");
    }

    // 2. Two-Dimensional Array
    static void demonstrate2DArray() {
        System.out.println("2. TWO-DIMENSIONAL ARRAY");
        System.out.println("------------------------");
        
        double[][] itemData = {
            {101, 15000},
            {102, 300},
            {103, 700},
            {104, 5000}
        };

        System.out.println("2D Array storage (ID, Price):");
        System.out.println(String.format("%-6s %-10s", "ID", "Price"));
        System.out.println("------------------");
        for (double[] data : itemData) {
            System.out.println(String.format("%-6.0f $%-9.0f", data[0], data[1]));
        }
        System.out.println("✓ Advantage: Organize tabular data\n");
    }

    // 3. List Interface
    static void demonstrateList() {
        System.out.println("3. LIST INTERFACE");
        System.out.println("-----------------");
        
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(101, "Laptop", 15000.0));
        itemList.add(new Item(102, "Mouse", 300.0));
        itemList.add(new Item(103, "Keyboard", 700.0));

        System.out.println("List - Ordered, allows duplicates:");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("  [" + i + "] " + itemList.get(i).getItemName());
        }
        System.out.println("✓ Advantage: Ordered collection, index-based access\n");
    }

    // 4. ArrayList
    static void demonstrateArrayList() {
        System.out.println("4. ARRAYLIST");
        System.out.println("------------");
        
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(101, "Laptop", 15000.0));
        items.add(new Item(102, "Mouse", 300.0));
        items.add(new Item(103, "Keyboard", 700.0));
        items.add(new Item(104, "Monitor", 5000.0));

        System.out.println("ArrayList (dynamic size, ordered):");
        items.forEach(item -> System.out.println("  " + item.getItemName() + " - $" + item.getPrice()));

        System.out.println("\nAfter modifying price of first item:");
        items.get(0).setPrice(14000.0);
        System.out.println("  " + items.get(0).getItemName() + " - $" + items.get(0).getPrice());
        System.out.println("✓ Advantage: Dynamic size, fast random access\n");
    }

    // 5. LinkedList
    static void demonstrateLinkedList() {
        System.out.println("5. LINKEDLIST");
        System.out.println("-------------");
        
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item(101, "Laptop", 15000.0));
        items.add(new Item(102, "Mouse", 300.0));
        items.add(new Item(103, "Keyboard", 700.0));

        System.out.println("LinkedList (doubly-linked):");
        items.forEach(item -> System.out.println("  " + item.getItemName()));

        items.addFirst(new Item(100, "USB Cable", 50.0));
        System.out.println("\nAfter addFirst():");
        items.forEach(item -> System.out.println("  " + item.getItemName()));
        System.out.println("✓ Advantage: Fast insertion/deletion at start/end\n");
    }

    // 6. Set Interface
    static void demonstrateSet() {
        System.out.println("6. SET INTERFACE");
        System.out.println("----------------");
        
        Set<Item> itemSet = new HashSet<>();
        itemSet.add(new Item(101, "Laptop", 15000.0));
        itemSet.add(new Item(102, "Mouse", 300.0));
        itemSet.add(new Item(103, "Keyboard", 700.0));
        itemSet.add(new Item(101, "Laptop", 15000.0)); // Duplicate

        System.out.println("Set (no duplicates, unordered):");
        itemSet.forEach(item -> System.out.println("  " + item.getItemName()));
        System.out.println("✓ Note: Duplicate not added (size: " + itemSet.size() + ")\n");
    }

    // 7. HashSet
    static void demonstrateHashSet() {
        System.out.println("7. HASHSET");
        System.out.println("-----------");
        
        HashSet<Item> items = new HashSet<>();
        items.add(new Item(101, "Laptop", 15000.0));
        items.add(new Item(102, "Mouse", 300.0));
        items.add(new Item(103, "Keyboard", 700.0));
        items.add(new Item(104, "Monitor", 5000.0));

        System.out.println("HashSet (hash-based, unordered):");
        items.forEach(item -> System.out.println("  " + item.getItemName() + " - $" + item.getPrice()));

        boolean found = items.stream().anyMatch(item -> item.getItemId() == 102);
        System.out.println("\nSearch for ID 102: " + (found ? "Found" : "Not Found"));
        System.out.println("✓ Advantage: O(1) average lookup time\n");
    }

    // 8. HashMap
    static void demonstrateHashMap() {
        System.out.println("8. HASHMAP");
        System.out.println("-----------");
        
        HashMap<Integer, Item> itemMap = new HashMap<>();
        itemMap.put(101, new Item(101, "Laptop", 15000.0));
        itemMap.put(102, new Item(102, "Mouse", 300.0));
        itemMap.put(103, new Item(103, "Keyboard", 700.0));
        itemMap.put(104, new Item(104, "Monitor", 5000.0));

        System.out.println("HashMap (key-value pairs):");
        itemMap.forEach((id, item) -> System.out.println("  ID: " + id + " => " + item.getItemName()));

        System.out.println("\nSearch for key 103: " + itemMap.get(103).getItemName());
        System.out.println("Key 105 exists: " + itemMap.containsKey(105));

        itemMap.remove(102);
        System.out.println("\nAfter removing ID 102 (size: " + itemMap.size() + ")");
        System.out.println("✓ Advantage: O(1) average access by key\n");
    }
}