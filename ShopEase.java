import java.util.Scanner;

public class ShopEase {
    private static Scanner scanner = new Scanner(System.in);
    private static OrderSystem orderSystem = new OrderSystem();
    
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
    }
    
    private static void pauseScreen() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
    
    public static void main(String[] args) {
        clearScreen(); 
        
        System.out.println("\033[38;5;214m");
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║       ███████╗██╗  ██╗ ██████╗ ██████╗ ███████╗ █████╗ ███████╗███████╗      ║");
        System.out.println("║       ██╔════╝██║  ██║██╔═══██╗██╔══██╗██╔════╝██╔══██╗██╔════╝██╔════╝      ║");
        System.out.println("║       ███████╗███████║██║   ██║██████╔╝█████╗  ███████║███████╗█████╗        ║");
        System.out.println("║       ╚════██║██╔══██║██║   ██║██╔═══╝ ██╔══╝  ██╔══██║╚════██║██╔══╝        ║");
        System.out.println("║       ███████║██║  ██║╚██████╔╝██║     ███████╗██║  ██║███████║███████╗      ║");
        System.out.println("║       ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝      ║");
        System.out.println("║                                                                              ║");
        System.out.println("║                           ONLINE SHOPPING SYSTEM                             ║");
        System.out.println("║                                                                              ║");
        System.out.println("║                   \"Shop your favorite items with Ease\"                       ║");
        System.out.println("║                                                                              ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("\033[0;32m");  
        
        pauseScreen();
        showMainMenu();
    }
    
    private static void showMainMenu() {
        while (true) {
            clearScreen(); 
            
            System.out.println("\033[0;32m");
            System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                  MAIN MENU                                   ║");
            System.out.println("║══════════════════════════════════════════════════════════════════════════════║");
            System.out.println("║ ┌──────────────────────────────────────────────────────────────────────────┐ ║ ");
            System.out.println("║ │                             SELECT AN OPTION                             │ ║ ");
            System.out.println("║ ├──────────────────────────────────────────────────────────────────────────┤ ║ ");
            System.out.println("║ │   ┌───────────────────┐   ┌───────────────────┐   ┌───────────────────┐  │ ║ ");
            System.out.println("║ │   │         1.        │   │         2.        │   │         3.        │  │ ║ ");
            System.out.println("║ │   │     View Menu     │   │  Add Item to Cart │   │     View Cart     │  │ ║ ");
            System.out.println("║ │   │                   │   │                   │   │                   │  │ ║ ");
            System.out.println("║ │   └───────────────────┘   └───────────────────┘   └───────────────────┘  │ ║ ");
            System.out.println("║ │                                                                          │ ║ ");
            System.out.println("║ │   ┌───────────────────┐   ┌───────────────────┐   ┌───────────────────┐  │ ║ ");    
            System.out.println("║ │   │         4.        │   │         5.        │   │         6.        │  │ ║ ");
            System.out.println("║ │   │    Remove Item    │   │      Checkout     │   │        Exit       │  │ ║ ");
            System.out.println("║ │   │     from Cart     │   │                   │   │                   │  │ ║ ");
            System.out.println("║ │   └───────────────────┘   └───────────────────┘   └───────────────────┘  │ ║ ");
            System.out.println("║ └──────────────────────────────────────────────────────────────────────────┘ ║ ");
            System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");

            System.out.print("Enter your choice: ");
            System.out.flush(); 
            
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                clearScreen();
                
                switch (choice) {
                    case 1:
                        System.out.println("\033[0;32m"); 
                        orderSystem.displayMenu();
                        pauseScreen();
                        break;
                    case 2:
                        System.out.println("\033[0;32m"); 
                        addItemToCart();
                        pauseScreen();
                        break;
                    case 3:
                        System.out.println("\033[0;32m"); 
                        orderSystem.viewCart();
                        pauseScreen();
                        break;
                    case 4:
                        System.out.println("\033[0;32m"); 
                        removeItemFromCart();
                        pauseScreen();
                        break;
                    case 5:
                        System.out.println("\033[0;32m"); 
                        orderSystem.checkout();
                        pauseScreen();
                        break;
                    case 6:
                        clearScreen();
                        System.out.println("\033[0;32m"); 
                        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║                  Thank you for using our Online Ordering System!             ║");
                        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
                        System.out.flush();
                        return;
                    default:
                        System.out.println("\033[0;31m"); 
                        System.out.println("Invalid choice! Please enter 1-6.");
                        pauseScreen();
                }
            } catch (NumberFormatException e) {
                System.out.println("\033[0;31m"); 
                System.out.println("Error: Please enter a valid number!");
                pauseScreen();
            }
        }
    }
    
    private static void addItemToCart() {
        orderSystem.displayMenu();
        System.out.print("\nEnter product ID to add to cart: ");
        System.out.flush();
        try {
            int productId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter quantity: ");
            System.out.flush();
            int quantity = Integer.parseInt(scanner.nextLine());
            orderSystem.addToCart(productId, quantity);
        } catch (NumberFormatException e) {
            System.out.println("\033[0;31m"); 
            System.out.println("Error: Please enter valid numbers!");
        } catch (OrderException e) {
            System.out.println("\033[0;31m"); 
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void removeItemFromCart() {
        orderSystem.viewCart();
        if (orderSystem.isCartEmpty()) {
            System.out.println("\033[0;31m"); 
            System.out.println("Cannot remove items from an empty cart!");
            return;
        }
        System.out.print("\nEnter product ID to remove from cart: ");
        System.out.flush();
        try {
            int productId = Integer.parseInt(scanner.nextLine());
            orderSystem.removeFromCart(productId);
        } catch (NumberFormatException e) {
            System.out.println("\033[0;31m"); 
            System.out.println("Error: Please enter a valid number!");
        } catch (OrderException e) {
            System.out.println("\033[0;31m"); 
            System.out.println("Error: " + e.getMessage());
        }
    }
}