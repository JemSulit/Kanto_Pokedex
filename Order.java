public class Order {
    private int orderId;
    private OrderItem[] items;
    private int itemCount;
    private double totalAmount;
    private String status;
    
    public Order(int orderId, OrderItem[] cartItems, int itemCount) throws OrderException {
        if (cartItems == null || itemCount <= 0) {
            throw new OrderException("Cannot create order with empty cart!");
        }
        
        this.orderId = orderId;
        this.itemCount = itemCount;
        this.items = new OrderItem[itemCount];
        
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i] == null) {
                throw new OrderException("Invalid item in cart!");
            }
            this.items[i] = cartItems[i];
        }
        
        calculateTotal();
        this.status = "Processing";
    }
    
    private void calculateTotal() {
        totalAmount = 0;
        for (int i = 0; i < itemCount; i++) {
            totalAmount += items[i].calculateTotal();
        }
    }
    
    public void processOrder() throws OrderException {
        if (itemCount == 0) {
            throw new OrderException("Cannot process empty order!");
        }
        
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getQuantity() <= 0) {
                throw new OrderException("Invalid quantity in order items!");
            }
        }
        
        this.status = "Completed";
        System.out.println("Order processed successfully!");
    }
    
    public void displayOrderDetails() {
        System.out.println("\n===== ORDER DETAILS =====");
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
        System.out.println("Items:");
        
        for (int i = 0; i < itemCount; i++) {
            OrderItem item = items[i];
            System.out.printf("  - %s x%d - $%.2f\n",
                item.getProduct().getName(),
                item.getQuantity(),
                item.calculateTotal());
        }
        System.out.printf("Total Amount: $%.2f\n", totalAmount);
    }
    
    public int getOrderId() { return orderId; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }
}