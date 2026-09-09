import java.util.ArrayList;

public class Cart{
private ArrayList<Item> itemsList; 
    private ArrayList<Integer> quantitiesList;
// بعمل ليست علشان مكونش محدده نفسي علشان انا مش عرفه هختار كام ايتم
public Cart() {
        
        itemsList = new ArrayList<>();
        quantitiesList = new ArrayList<>();
    }

    public void addItem(Item item, int quantity) {
        itemsList.add(item);
        quantitiesList.add(quantity);}

        public ArrayList<Item> getItemsList() {
        return itemsList;
    }

    public ArrayList<Integer> getQuantitiesList() {
        return quantitiesList;
    }
    //ضيفتهم علشان الفتوره 
}
