public class Drink extends Product {
    private String type;
    private boolean hasIce;
    
    public Drink(String name, double basePrice, String type, boolean hasIce) {
        super(name, basePrice);
        this.type = type;
        this.hasIce = hasIce;
    }
    
    @Override
    public double getPrice() {
        return basePrice;
    }
    
    @Override
    public String getDescription() {
        String iceText;
        if (hasIce) {
            iceText = "with Ice";
        } else {
            iceText = "no Ice";
        }
        return type + " " + name + " (" + iceText + ") - ₱" + String.format("%.2f", getPrice());
    }
    
    public String getType() { return type; }
    public boolean hasIce() { return hasIce; }
}