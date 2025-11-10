// Fries.java
/**
 * Represents fries products with size variations
 * Demonstrates INHERITANCE and POLYMORPHISM
 */
public class Fries extends Product {
    private String size;
    private String flavor;
    
    public Fries(String name, double basePrice, String size, String flavor) {
        super(name, basePrice);
        this.size = size;
        this.flavor = flavor;
    }
    
    @Override
    public double getPrice() {
        double sizeMultiplier = getSizeMultiplier();
        return basePrice * sizeMultiplier;
    }
    
    private double getSizeMultiplier() {
        if (size.equalsIgnoreCase("regular")) {
            return 1.0;
        } else if (size.equalsIgnoreCase("large")) {
            return 1.9;
        } else if (size.equalsIgnoreCase("jumbo")) {
            return 2.9;
        } else if (size.equalsIgnoreCase("mega")) {
            return 3.8;
        } else if (size.equalsIgnoreCase("giga")) {
            return 6.2;
        } else if (size.equalsIgnoreCase("tera")) {
            return 7.2;
        } else {
            return 1.0;
        }
    }
    
    @Override
    public String getDescription() {
        return size + " " + flavor + " Fries - ₱" + String.format("%.2f", getPrice());
    }
    
    public String getSize() { return size; }
    public String getFlavor() { return flavor; }
}