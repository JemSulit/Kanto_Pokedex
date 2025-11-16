public class Clothing extends Product {
    private String material;
    private String size;
    
    public Clothing(int id, String name, double price, String material, String size) {
        super(id, name, price);
        this.material = material;
        this.size = size;
    }
    
    @Override
    public void displayInfo() {
        System.out.printf("ID: %d | Clothing: %s | Material: %s | Size: %s | Price: $%.2f\n",
            getId(), getName(), material, size, getPrice());
    }
    
    public String getMaterial() { return material; }
    public String getSize() { return size; }
    
    public void setMaterial(String material) { 
        if (material != null && !material.trim().isEmpty()) 
            this.material = material; 
    }
    
    public void setSize(String size) { 
        if (size != null && !size.trim().isEmpty()) 
            this.size = size; 
    }
}