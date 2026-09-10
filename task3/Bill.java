public class Bill {
    
    private Cart cart; 
    private double totalAmount;
    
    public Bill(Cart cart) {
        this.cart = cart;
        
        this.totalAmount = calculateTotal(); 
    }

    private double calculateTotal() {
        double total = 0.0;
        //هيقعد يحسب ايتم ايتم
        for (int i = 0; i < cart.getItemsList().size(); i++) {
            
            Item currentItem = cart.getItemsList().get(i);
            
            int currentQuantity = cart.getQuantitiesList().get(i);
            
            
            total += currentItem.getPrice() * currentQuantity;
        }
        return total;
    }

    public Cart getCart() {
        return cart;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    
    public void setCart(Cart cart) {
        this.cart = cart;
        
        this.totalAmount = calculateTotal();
    }

    public void printReceipt() {
        System.out.println("========== Receipt ==========");
        for (int i = 0; i < cart.getItemsList().size(); i++) {
            Item item = cart.getItemsList().get(i);
            int quantity = cart.getQuantitiesList().get(i);
            double subTotal = item.getPrice() * quantity;
            
            System.out.println(item.getItemName() + " (x" + quantity + ") : $" + subTotal);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Amount to Pay: $" + totalAmount);
        System.out.println("=============================");
    }
}