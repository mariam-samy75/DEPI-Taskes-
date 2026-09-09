public class Main {
    public static void main(String[] args) {
        
        
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
    }
}