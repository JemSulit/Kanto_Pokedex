public abstract class Product implements MenuItem {
    protected String name;
    protected double basePrice;
    
    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    
    public abstract double getPrice();
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return getName() + " - ₱" + getPrice();
    }
}