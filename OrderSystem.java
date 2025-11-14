public class OrderSystem {
    private Product[] products;
    private OrderItem[] cart;
    private int cartSize;
    private int nextOrderId;

    public OrderSystem() {
        initializeProducts();
        this.cart = new OrderItem[10];
        this.cartSize = 0;
        this.nextOrderId = 1;
    }

    private void initializeProducts() {
        products = new Product[] {
            new Electronics(1, "Smartphone", 699.99, "Apple", "iPhone 15"),
            new Electronics(2, "Laptop", 1299.99, "Dell", "XPS 13"),
            new Clothing(3, "T-Shirt", 29.99, "Cotton", "M"),
            new Clothing(4, "Jeans", 59.99, "Denim", "32"),
            new Book(5, "The Alchemist", 19.99, "Paulo Coelho", "Fiction"),
            new Book(6, "Clean Code", 39.99, "Robert C. Martin", "Programming")
        };
    }

    public void displayMenu() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                PRODUCT MENU                                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
        for (Product product : products) {
            product.displayInfo();
            System.out.println("------------------------");
        }
    }

    public void addToCart(int productId, int quantity) throws OrderException {
        if (quantity <= 0) throw new OrderException("Quantity must be positive!");

        Product product = findProductById(productId);
        if (product == null) throw new OrderException("Product not found!");

        for (int i = 0; i < cartSize; i++) {
            if (cart[i].getProduct().getId() == productId) {
                cart[i].setQuantity(cart[i].getQuantity() + quantity);
                System.out.println("Updated quantity in cart!");
                return;
            }
        }

        if (cartSize >= cart.length) throw new OrderException("Cart is full!");

        cart[cartSize] = new OrderItem(product, quantity);
        cartSize++;
        System.out.println("Item added to cart successfully!");
    }

    public void removeFromCart(int productId) throws OrderException {
        if (cartSize == 0) throw new OrderException("Cart is empty!");

        for (int i = 0; i < cartSize; i++) {
            if (cart[i].getProduct().getId() == productId) {
                for (int j = i; j < cartSize - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[cartSize - 1] = null;
                cartSize--;
                System.out.println("Item removed from cart!");
                return;
            }
        }
        throw new OrderException("Item not found in cart!");
    }

    public void viewCart() {
        if (cartSize == 0) {
            System.out.println("\nYour cart is empty!");
            return;
        }

        System.out.println("\n===== SHOPPING CART =====");
        double total = 0;
        for (int i = 0; i < cartSize; i++) {
            OrderItem item = cart[i];
            double itemTotal = item.calculateTotal();
            System.out.printf("%d. %s x%d - $%.2f\n", 
                item.getProduct().getId(),
                item.getProduct().getName(),
                item.getQuantity(),
                itemTotal);
            total += itemTotal;
        }
        System.out.printf("Total: $%.2f\n", total);
    }

    public void checkout() {
        if (cartSize == 0) {
            System.out.println("Cart is empty! Add items before checkout.");
            return;
        }

        try {
            System.out.println("╔═════════════════════════════════════╗");
            System.out.println("║               CHECKOUT              ║");
            System.out.println("╚═════════════════════════════════════╝");
            viewCart();

            Order order = new Order(nextOrderId++, cart, cartSize);
            order.processOrder();
            order.displayOrderDetails();

            clearCart();
        } catch (OrderException e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
    }

    public boolean isCartEmpty() {
        return cartSize == 0;
    }

    private Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) return product;
        }
        return null;
    }

    private void clearCart() {
        for (int i = 0; i < cartSize; i++) cart[i] = null;
        cartSize = 0;
    }
}
