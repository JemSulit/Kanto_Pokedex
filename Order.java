public class Order {
    private MenuItem[] items;
    private int count;

    public Order(int maxItems) {
        items = new MenuItem[maxItems];
        count = 0;
    }

    public void addItem(MenuItem item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Cannot add more items to the order.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("\n[Server]: Thank you for your order! Let me repeat it back to make sure everything is correct.");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + items[i].getName() + " : ₱" + items[i].getPrice());
        }
        System.out.printf("[Server]: Alright, that will be a total of ₱%.2f. Thank you and enjoy your meal!\n", calculateTotal());
    }
}
