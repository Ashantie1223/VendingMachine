import java.util.ArrayList;

public class Slot {

    private ArrayList<Item> itemList;

    private boolean availability;
    public Slot(Item item, int quantity){
        this.itemList = new ArrayList<Item>();
        this.availability = true;
    }

    public int getStock() {
        return itemList.size();
    }

    public Item getItem() {
        return this.itemList.get(itemList.size() - 1);
    }
    public void removeItem() {
        this.itemList.remove(itemList.size() - 1);
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void addItem(Item item) {
            this.itemList.add(item);
    }
}
