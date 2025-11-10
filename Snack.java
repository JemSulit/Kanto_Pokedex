public class Snack extends Product {
    private String category;
    private boolean isSpicy;
    
    public Snack(String name, double basePrice, String category, boolean isSpicy) {
        super(name, basePrice);
        this.category = category;
        this.isSpicy = isSpicy;
    }
    
    @Override
    public double getPrice() {
        double price = basePrice;
        if (isSpicy) {
            price += 5.0;
        }
        return price;
    }
    
    @Override
    public String getDescription() {
        String spicyText;
        if (isSpicy) {
            spicyText = "Spicy ";
        } else {
            spicyText = "";
        }
        return spicyText + category + " " + name + " - P" + String.format("%.2f", getPrice());
    }
    
    public String getCategory() { return category; }
    public boolean isSpicy() { return isSpicy; }
}