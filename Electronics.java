public class Electronics extends Product {
    private String brand;
    private String model;
    
    public Electronics(int id, String name, double price, String brand, String model) {
        super(id, name, price);
        this.brand = brand;
        this.model = model;
    }
    
    @Override
    public void displayInfo() {
        System.out.printf("ID: %d | Electronics: %s | Brand: %s | Model: %s | Price: $%.2f\n",
            getId(), getName(), brand, model, getPrice());
    }
    
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    
    public void setBrand(String brand) { 
        if (brand != null && !brand.trim().isEmpty()) 
            this.brand = brand; 
    }
    
    public void setModel(String model) { 
        if (model != null && !model.trim().isEmpty()) 
            this.model = model; 
    }
}