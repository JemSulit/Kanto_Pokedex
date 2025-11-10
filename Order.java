import java.util.Arrays;

public class Order {
    private MenuItem[] items;
    private int count;
    
    public Order(int maxItems) {
        if (maxItems <= 0) {
            throw new IllegalArgumentException("Order size must be positive.");
        }
        items = new MenuItem[maxItems];
        count = 0;
    }
    
    public void addItem(MenuItem item) {
        if (count >= items.length) {
            throw new OrderFullException("Cannot add more items. Maximum reached: " + items.length);
        }
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items[count] = item;
        count = count + 1;
    }
    
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = total + items[i].getPrice();
        }
        return total;
    }
    
    public void displayOrder() {
        if (count == 0) {
            System.out.println("[Server]: Your order is empty.");
            return;
        }
        System.out.println("\n[Server]: Thank you for your order! Here's what you selected:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + items[i].getDescription());
        }
        System.out.printf("-----------------------------------------------\n");
        System.out.printf("[Server]: Total: P%.2f%n", getTotal());
    }
    
    public int getItemCount() {
        return count;
    }
    
    public boolean isFull() {
        if (count >= items.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public void clearOrder() {
        Arrays.fill(items, 0, count, null);
        count = 0;
    }
}