import java.util.Scanner;

public class PotatoCorner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuItem[] sizes = {
            new MenuItem("Regular", 29),
            new MenuItem("Large", 55),
            new MenuItem("Jumbo", 85),
            new MenuItem("Mega", 110),
            new MenuItem("Giga", 179),
            new MenuItem("Tera", 209)
        };

        MenuItem[] flavors = {
            new MenuItem("Barbeque", 10),
            new MenuItem("Cheese", 10),
            new MenuItem("Sour Cream", 10),
            new MenuItem("Chili Barbeque", 10),
            new MenuItem("Chili Cheese", 10),
            new MenuItem("Golden Sweet Corn", 10),
            new MenuItem("White Cheddar", 10),
            new MenuItem("Wasabi", 10),
            new MenuItem("Truffle", 10)
        };

        MenuItem[] specialties = {
            new MenuItem("HashBrown", 70),
            new MenuItem("Jojos", 70),
            new MenuItem("Loopys", 80),
            new MenuItem("Tater Tots", 80),
            new MenuItem("Waffle Fries", 100)
        };

        MenuItem[] newProducts = {
            new MenuItem("Super Chicken Pop", 99),
            new MenuItem("Flavored Tea", 35),
            new MenuItem("Flavored Nachos", 80),
            new MenuItem("Tera Mix", 375)
        };

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

        Order order = new Order(20); 

        while (true) {
            System.out.println("\n[Server]: Enter '1' to Order, '2' to Quit:");
            System.out.print("[User]: ");
            String choice = sc.nextLine();

            if (choice.equals("2")) {
                System.out.println("[Server]: Come again next time!");
                break;
            } else if (choice.equals("1")) {
            
            System.out.println("         ███╗   ███╗███████╗███╗   ██╗██╗   ██╗");
            System.out.println("         ████╗ ████║██╔════╝████╗  ██║██║   ██║");
            System.out.println("         ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║");
            System.out.println("         ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║");
            System.out.println("         ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝");
            System.out.println("         ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ \n");
                System.out.println(
                        "   ---------------------------------------------------\n\n" +
                        "          \"Life is better with a cup of crispy fries!\"\n\n" +
                        "                           SIZES\n\n" +
                        "Regular.............................................₱29.00\n" +
                        "Large...............................................₱55.00\n" +
                        "Jumbo...............................................₱85.00\n" +
                        "Mega................................................₱110.00\n" +
                        "Giga................................................₱179.00\n" +
                        "Tera................................................₱209.00\n\n" +
                        "                           FLAVORS\n\n" +
                        "Barbeque............................................₱10.00\n" +
                        "Cheese..............................................₱10.00\n" +
                        "Sour Cream..........................................₱10.00\n" +
                        "Chili Barbeque......................................₱10.00\n" +
                        "Chili Cheese........................................₱10.00\n" +
                        "Golden Sweet Corn...................................₱10.00\n" +
                        "White Cheddar.......................................₱10.00\n" +
                        "Wasabi..............................................₱10.00\n" +
                        "Truffle.............................................₱10.00\n\n" +
                        "                     SPECIALTY FRIES\n\n" +
                        "HashBrown............................................₱70.00\n" +
                        "Jojos................................................₱70.00\n" +
                        "Loopys..............................................₱80.00\n" +
                        "Tater Tots..........................................₱80.00\n" +
                        "Waffle Fries........................................₱100.00\n\n" +
                        "                      NEW PRODUCTS\n\n" +
                        "Super Chicken Pop....................................₱99.00\n" +
                        "Flavored Tea.........................................₱35.00\n" +
                        "Flavored Nachos......................................₱80.00\n" +
                        "Tera Mix............................................₱375.00\n\n" +
                        "    ---------------------------------------------------\n\n" +
                        "         Fries, flavors, and fun — all in one tub!\n\n" +
                        "       THANK YOU FOR DRIVING THROUGH POTATO CORNER!"
                );

                System.out.println("\nEnter the number of the SIZE you want (1-6):");
                System.out.print("[User]: ");
                int sizeChoice = Integer.parseInt(sc.nextLine());
                order.addItem(sizes[sizeChoice - 1]);

                System.out.println("\nEnter the number of the FLAVOR you want (1-9):");
                System.out.print("[User]: ");
                int flavorChoice = Integer.parseInt(sc.nextLine());
                order.addItem(flavors[flavorChoice - 1]);

                System.out.println("\nDo you want to add SPECIALTY FRIES or NEW PRODUCTS? (yes/no)");
                System.out.print("[User]: ");
                String addMore = sc.nextLine().toLowerCase();
                if (addMore.equals("yes")) {
                    System.out.println("\nEnter the number of the SPECIALTY FRIES (1-5) or NEW PRODUCTS (6-9), 0 to skip:");
                    System.out.print("[User]: ");
                    int extraChoice = Integer.parseInt(sc.nextLine());
                    if (extraChoice > 0 && extraChoice <= specialties.length) {
                        order.addItem(specialties[extraChoice - 1]);
                    } else if (extraChoice > specialties.length && extraChoice <= specialties.length + newProducts.length) {
                        order.addItem(newProducts[extraChoice - specialties.length - 1]);
                    }
                }

                order.displayOrder();
            } else {
                System.out.println("[Server]: Invalid input. Please try again.");
            }
        }

        sc.close();
    }
}
