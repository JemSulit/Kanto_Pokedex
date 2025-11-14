public abstract class Product {
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public abstract void displayInfo();
    
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    public void setId(int id) { 
        if (id > 0) this.id = id; 
    }
    
    public void setName(String name) { 
        if (name != null && !name.trim().isEmpty()) 
            this.name = name; 
    }
    
    public void setPrice(double price) { 
        if (price >= 0) this.price = price; 
    }
}