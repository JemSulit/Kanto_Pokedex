import java.util.Scanner;

public class PotatoCorner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MenuItem[] menuItems = createMenu();
        Order order = new Order(20);

        displayWelcomeMessage();

        while (true) {
            System.out.println("\n[Server]: Enter '1' to Order, '2' to Quit:");
            System.out.print("[User]: ");
            String choice = sc.nextLine();

            if (choice.equals("2")) {
                System.out.println("[Server]: Come again next time!");
                break;
            } else if (choice.equals("1")) {
                try {
                    displayMenu();
                    processOrder(sc, menuItems, order);
                } catch (OrderFullException e) {
                    System.out.println("[Server]: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("[Server]: Invalid input. Please enter numbers only.");
                } catch (Exception e) {
                    System.out.println("[Server]: Unexpected error: " + e.getMessage());
                }
            } else {
                System.out.println("[Server]: Invalid input. Please try again.");
            }
        }
        sc.close();
    }
    
    private static MenuItem[] createMenu() {
        MenuItem[] menu = new MenuItem[24];
        
        menu[0] = new BasicMenuItem("Regular", 29);
        menu[1] = new BasicMenuItem("Large", 55);
        menu[2] = new BasicMenuItem("Jumbo", 85);
        menu[3] = new BasicMenuItem("Mega", 110);
        menu[4] = new BasicMenuItem("Giga", 179);
        menu[5] = new BasicMenuItem("Tera", 209);
        
        menu[6] = new BasicMenuItem("Barbeque", 10);
        menu[7] = new BasicMenuItem("Cheese", 10);
        menu[8] = new BasicMenuItem("Sour Cream", 10);
        menu[9] = new BasicMenuItem("Chili Barbeque", 10);
        menu[10] = new BasicMenuItem("Chili Cheese", 10);
        menu[11] = new BasicMenuItem("Golden Sweet Corn", 10);
        menu[12] = new BasicMenuItem("White Cheddar", 10);
        menu[13] = new BasicMenuItem("Wasabi", 10);
        menu[14] = new BasicMenuItem("Truffle", 10);
        
        menu[15] = new BasicMenuItem("HashBrown", 70);
        menu[16] = new BasicMenuItem("Jojos", 70);
        menu[17] = new BasicMenuItem("Loopys", 80);
        menu[18] = new BasicMenuItem("Tater Tots", 80);
        menu[19] = new BasicMenuItem("Waffle Fries", 100);
        
        menu[20] = new BasicMenuItem("Super Chicken Pop", 99);
        menu[21] = new BasicMenuItem("Flavored Tea", 35);
        menu[22] = new BasicMenuItem("Flavored Nachos", 80);
        menu[23] = new BasicMenuItem("Tera Mix", 375);
        
        return menu;
    }
    
    private static void displayWelcomeMessage() {
        System.out.println("██████╗  ██████╗ ████████╗ █████╗ ████████╗ ██████╗ ");
        System.out.println("██╔══██╗██╔═══██╗╚══██╔══╝██╔══██╗╚══██╔══╝██╔═══██╗");
        System.out.println("██████╔╝██║   ██║   ██║   ███████║   ██║   ██║   ██║");
        System.out.println("██╔═══╝ ██║   ██║   ██║   ██╔══██║   ██║   ██║   ██║");
        System.out.println("██║     ╚██████╔╝   ██║   ██║  ██║   ██║   ╚██████╔╝");
        System.out.println("╚═╝      ╚═════╝    ╚═╝   ╚═╝  ╚═╝   ╚═╝    ╚═════╝ ");
        System.out.println(" ██████╗ ██████╗ ██████╗ ███╗   ██╗███████╗██████╗");
        System.out.println("██╔════╝██╔═══██╗██   ██ ████╗  ██║██╔════╝██   ██");
        System.out.println("██║     ██║   ██║██████╔╝██╔██╗ ██║█████╗  ██████╔╝");
        System.out.println("██║     ██║   ██║██╔═██║ ██║╚██╗██║██╔══╝  ██╔═██║");
        System.out.println("╚██████╗╚██████╔╝██║ ██║ ██║ ╚████║███████╗██║ ██║");
        System.out.println(" ╚═════╝ ╚═════╝ ╚═╝ ╚═╝ ╚═╝  ╚═══╝╚══════╝╚═╝ ╚═╝\n");
        System.out.println("[Server]: Mabuhay! Ma'am/Sir, Welcome to Potato Corner! May I take your order, please?");
    }
    
    private static void displayMenu() {
        System.out.println("/n");
        System.out.println("         ███╗   ███╗███████╗███╗   ██╗██╗   ██╗");
        System.out.println("         ████╗ ████║██╔════╝████╗  ██║██║   ██║");
        System.out.println("         ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║");
        System.out.println("         ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║");
        System.out.println("         ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝");
        System.out.println("         ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ \n");
        
        System.out.println("          \"Life is better with a cup of crispy fries!\"\n");
        System.out.println("                           SIZES\n");
        
        System.out.println("Regular.............................................P29.00");
        System.out.println("Large...............................................P55.00");
        System.out.println("Jumbo...............................................P85.00");
        System.out.println("Mega................................................P110.00");
        System.out.println("Giga................................................P179.00");
        System.out.println("Tera................................................P209.00");
        
        System.out.println("\n                           FLAVORS\n");
        
        // Display Flavors
        System.out.println("Barbeque............................................P10.00");
        System.out.println("Cheese..............................................P10.00");
        System.out.println("Sour Cream..........................................P10.00");
        System.out.println("Chili Barbeque......................................P10.00");
        System.out.println("Chili Cheese........................................P10.00");
        System.out.println("Golden Sweet Corn...................................P10.00");
        System.out.println("White Cheddar.......................................P10.00");
        System.out.println("Wasabi..............................................P10.00");
        System.out.println("Truffle.............................................P10.00");
        
        System.out.println("\n                     SPECIALTY FRIES\n");
        
        System.out.println("HashBrown............................................P70.00");
        System.out.println("Jojos................................................P70.00");
        System.out.println("Loopys...............................................P80.00");
        System.out.println("Tater Tots...........................................P80.00");
        System.out.println("Waffle Fries.........................................P100.00");
        
        System.out.println("\n                      NEW PRODUCTS\n");
        
        System.out.println("Super Chicken Pop....................................P99.00");
        System.out.println("Flavored Tea.........................................P35.00");
        System.out.println("Flavored Nachos......................................P80.00");
        System.out.println("Tera Mix.............................................P375.00");
        
        System.out.println("\n    ---------------------------------------------------\n");
        System.out.println("        \"Crispy, delicate, and tender - all in one cup!\"\n");
    }
    
    private static void processOrder(Scanner sc, MenuItem[] menuItems, Order order) {
        System.out.println("\n[Server]: What would you like to order?");
        System.out.println("1. Fries (with sizes and flavors)");
        System.out.println("2. Specialty Fries");
        System.out.println("3. New Products");
        System.out.print("[User]: ");
        
        int categoryChoice = Integer.parseInt(sc.nextLine());
        
        if (categoryChoice == 1) {
            orderFries(sc, menuItems, order);
        } else if (categoryChoice == 2) {
            orderSpecialtyFries(sc, menuItems, order);
        } else if (categoryChoice == 3) {
            orderNewProducts(sc, menuItems, order);
        } else {
            System.out.println("[Server]: Invalid choice. Please select 1, 2, or 3.");
            return;
        }
        
        askForAdditionalItems(sc, menuItems, order);
        
        order.displayOrder();
    }
    
    private static void orderFries(Scanner sc, MenuItem[] menuItems, Order order) {
        System.out.println("\n[Server]: Great choice! Let's start with your fries size:");
        System.out.println("1. Regular - P29.00");
        System.out.println("2. Large - P55.00");
        System.out.println("3. Jumbo - P85.00");
        System.out.println("4. Mega - P110.00");
        System.out.println("5. Giga - P179.00");
        System.out.println("6. Tera - P209.00");
        System.out.print("[User]: ");
        
        int sizeChoice = Integer.parseInt(sc.nextLine());
        if (sizeChoice < 1 || sizeChoice > 6) {
            System.out.println("[Server]: Invalid size choice. Please try again.");
            return;
        }
        
        order.addItem(menuItems[sizeChoice - 1]);
        System.out.println("[Server]: Added size: " + menuItems[sizeChoice - 1].getDescription());
        
        System.out.println("\n[Server]: Now choose your flavor (all flavors are P10.00):");
        System.out.println("1. Barbeque");
        System.out.println("2. Cheese");
        System.out.println("3. Sour Cream");
        System.out.println("4. Chili Barbeque");
        System.out.println("5. Chili Cheese");
        System.out.println("6. Golden Sweet Corn");
        System.out.println("7. White Cheddar");
        System.out.println("8. Wasabi");
        System.out.println("9. Truffle");
        System.out.print("[User]: ");
        
        int flavorChoice = Integer.parseInt(sc.nextLine());
        if (flavorChoice < 1 || flavorChoice > 9) {
            System.out.println("[Server]: Invalid flavor choice. Please try again.");
            return;
        }
        
        int flavorIndex = flavorChoice + 5;
        order.addItem(menuItems[flavorIndex]);
        System.out.println("[Server]: Added flavor: " + menuItems[flavorIndex].getDescription());
    }
    
    private static void orderSpecialtyFries(Scanner sc, MenuItem[] menuItems, Order order) {
        System.out.println("\n[Server]: Excellent choice! Here are our Specialty Fries:");
        System.out.println("1. HashBrown - P70.00");
        System.out.println("2. Jojos - P70.00");
        System.out.println("3. Loopys - P80.00");
        System.out.println("4. Tater Tots - P80.00");
        System.out.println("5. Waffle Fries - P100.00");
        System.out.print("[User]: ");
        
        int specialtyChoice = Integer.parseInt(sc.nextLine());
        if (specialtyChoice < 1 || specialtyChoice > 5) {
            System.out.println("[Server]: Invalid choice. Please select 1-5.");
            return;
        }
        
        int specialtyIndex = specialtyChoice + 14;
        order.addItem(menuItems[specialtyIndex]);
        System.out.println("[Server]: Added: " + menuItems[specialtyIndex].getDescription());
    }
    
    private static void orderNewProducts(Scanner sc, MenuItem[] menuItems, Order order) {
        System.out.println("\n[Server]: Wonderful! Here are our New Products:");
        System.out.println("1. Super Chicken Pop - P99.00");
        System.out.println("2. Flavored Tea - P35.00");
        System.out.println("3. Flavored Nachos - P80.00");
        System.out.println("4. Tera Mix - P375.00");
        System.out.print("[User]: ");
        
        int newProductChoice = Integer.parseInt(sc.nextLine());
        if (newProductChoice < 1 || newProductChoice > 4) {
            System.out.println("[Server]: Invalid choice. Please select 1-4.");
            return;
        }
        
        int newProductIndex = newProductChoice + 19;
        order.addItem(menuItems[newProductIndex]);
        System.out.println("[Server]: Added: " + menuItems[newProductIndex].getDescription());
    }
    
    private static void askForAdditionalItems(Scanner sc, MenuItem[] menuItems, Order order) {
        System.out.println("\n[Server]: Would you like to add items from other categories? (yes/no)");
        System.out.print("[User]: ");
        String addMore = sc.nextLine().toLowerCase();
        
        if (addMore.equals("yes") || addMore.equals("y")) {
            System.out.println("\n[Server]: Which category would you like to add from?");
            System.out.println("1. Fries (with sizes and flavors)");
            System.out.println("2. Specialty Fries");
            System.out.println("3. New Products");
            System.out.println("4. No more, proceed to checkout");
            System.out.print("[User]: ");
            
            int additionalChoice = Integer.parseInt(sc.nextLine());
            
            if (additionalChoice == 1) {
                orderFries(sc, menuItems, order);
                askForAdditionalItems(sc, menuItems, order); 
            } else if (additionalChoice == 2) {
                orderSpecialtyFries(sc, menuItems, order);
                askForAdditionalItems(sc, menuItems, order); 
            } else if (additionalChoice == 3) {
                orderNewProducts(sc, menuItems, order);
                askForAdditionalItems(sc, menuItems, order); 
            } else if (additionalChoice == 4) {
                System.out.println("[Server]: Okay, proceeding to checkout.");
            } else {
                System.out.println("[Server]: Invalid choice. Proceeding to checkout.");
            }
        }
    }
}