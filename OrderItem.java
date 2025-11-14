public class OrderItem {
    private Product product;
    private int quantity;
    
    public OrderItem(Product product, int quantity) throws OrderException {
        if (product == null) {
            throw new OrderException("Product cannot be null!");
        }
        if (quantity <= 0) {
            throw new OrderException("Quantity must be positive!");
        }
        this.product = product;
        this.quantity = quantity;
    }
    
    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
    
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    
    public void setProduct(Product product) throws OrderException { 
        if (product == null) {
            throw new OrderException("Product cannot be null!");
        }
        this.product = product; 
    }
    
    public void setQuantity(int quantity) throws OrderException {
        if (quantity <= 0) {
            throw new OrderException("Quantity must be positive!");
        }
        this.quantity = quantity;
    }
}