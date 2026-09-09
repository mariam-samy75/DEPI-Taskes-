public class Item{
private int itemid;
private String itemname; 
private double price;

public Item (int itemid,String itemname,double price){
this.itemid = itemid;
this.itemname = itemname;
this.price= price;
} 
public int getItemId() {
     return itemid; }


    public String getItemName() { 
        return itemname; }

    public double getPrice() {
         return price; }

    public void setItemId(int itemid) { 
        this.itemid = itemid; }
        
    public void setItemName(String itemname) { 
        this.itemname = itemname; }

    public void setPrice(double price) { 
        this.price = price; }


        @Override
    public String toString() {
        return "Item Details:\n" +
               "ID: " + itemid + "\n" +
               "Name: " + itemname + "\n" +
               "Price: $" + price;
    }
}