import java.util.ArrayList; 

public class Customer {
    
    private String name; 
    
    
    private ArrayList<Cart> carts; 
    private ArrayList<Bill> bills; 

    
    public Customer(String name) {
        this.name = name;
        this.carts = new ArrayList<>();
        this.bills = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    public ArrayList<Cart> getCarts() {
        return carts;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public void addCart(Cart cart) {
        this.carts.add(cart);
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }
    
    
    public void printCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Number of Bills: " + bills.size());
    }
}