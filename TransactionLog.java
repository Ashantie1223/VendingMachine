public class TransactionLog {
    private Item item;

    private int quantity;

    TransactionLog(Item item, int quantity){
        this.item = item;

        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
