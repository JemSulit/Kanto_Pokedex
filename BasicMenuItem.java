public class BasicMenuItem implements MenuItem {
    private String name;
    private double price;
    
    public BasicMenuItem(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public double getPrice() { return price; }
    
    @Override
    public String getDescription() {
        return name + " - P" + String.format("%.2f", price);
    }
    
    public void setName(String name) { this.name = name; }
    
    public void setPrice(double price) { 
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price; 
    }
}