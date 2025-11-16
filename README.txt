================================================================================
                              SHOPEASE
                     Online Shopping System in Java
================================================================================

PROJECT OVERVIEW
================================================================================

ShopEase is a console-based online shopping system built in Java that 
demonstrates fundamental Object-Oriented Programming (OOP) concepts. The 
application provides a complete e-commerce experience where users can browse 
products, add items to their shopping cart, manage quantities, and complete 
purchases through a user-friendly command-line interface.

The system features an intuitive menu-driven interface with colored terminal 
output and ASCII art design, making it visually appealing while maintaining 
functionality in a console environment.


FEATURES
================================================================================

• Interactive menu system with 6 main options
• Product catalog with multiple categories (Electronics, Clothing, Books)
• Shopping cart functionality with add/remove/view capabilities
• Quantity management for cart items
• Order processing and checkout system
• Exception handling for invalid inputs and edge cases
• Professional ASCII art interface with colored terminal output
• Real-time cart total calculation


OOP CONCEPTS APPLIED
================================================================================

1. ENCAPSULATION
   - All class fields are private with controlled access through getters/setters
   - Product class encapsulates id, name, and price with validation
   - OrderSystem class manages internal cart state and product inventory
   - Data validation in setter methods ensures data integrity

2. INHERITANCE
   - Product is an abstract base class
   - Specialized product classes extend Product:
     * Electronics (brand, model)
     * Clothing (material, size)
     * Book (author, genre)
   - Each subclass inherits common properties while adding specific attributes

3. POLYMORPHISM
   - Abstract displayInfo() method in Product class
   - Each product type implements its own version of displayInfo()
   - Runtime polymorphism enables flexible product display
   - Array of Product type can hold different product subclasses

4. ABSTRACTION
   - Product class is abstract, defining the template for all products
   - Abstract methods enforce implementation in subclasses
   - Users interact with high-level operations without seeing implementation
   - Complex order processing logic hidden behind simple method calls

5. EXCEPTION HANDLING
   - Custom OrderException class for domain-specific errors
   - Try-catch blocks handle user input validation
   - Graceful error messages for invalid operations
   - Prevents application crashes from unexpected inputs


PROGRAM STRUCTURE
================================================================================

ShopEase.java
    Main application entry point with menu interface and user interaction logic

Product.java (Abstract Class)
    Base class for all products with common attributes (id, name, price)

Electronics.java
    Product subclass for electronic items (brand, model)

Clothing.java
    Product subclass for apparel (material, size)

Book.java
    Product subclass for books (author, genre)

OrderSystem.java
    Core business logic for cart management and product catalog

Order.java
    Represents a customer order with processing capabilities

OrderItem.java
    Represents individual items in the cart with quantity

OrderException.java
    Custom exception class for order-related errors


TECHNOLOGIES USED
================================================================================

• Language: Java
• Development Approach: Object-Oriented Programming
• Console UI: ANSI escape codes for colored terminal output
• Data Structures: Arrays for product catalog and shopping cart
• Input Handling: Scanner class for user input


SYSTEM REQUIREMENTS
================================================================================

• Java Development Kit (JDK) 8 or higher
• Terminal/Console with ANSI color support (for best visual experience)
• Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line compiler


HOW TO RUN THE PROGRAM
================================================================================

METHOD 1: Using Command Line
-----------------------------
1. Clone or download the repository:
   git clone https://github.com/JemSulit/ShopEase.git

2. Navigate to the project directory:
   cd ShopEase

3. Compile all Java files:
   javac *.java

4. Run the main application:
   java ShopEase


METHOD 2: Using an IDE
----------------------
1. Clone or download the repository
2. Open your preferred Java IDE (Eclipse, IntelliJ IDEA, VS Code)
3. Import the project or open the project folder
4. Locate ShopEase.java as the main class
5. Run the application using the IDE's run button


USING THE APPLICATION
================================================================================

Upon launching, you'll see the ShopEase welcome screen. The main menu offers 
6 options:

1. VIEW MENU
   - Displays all available products with details
   - Shows product ID, name, price, and specific attributes

2. ADD ITEM TO CART
   - Enter the product ID from the menu
   - Specify desired quantity
   - System confirms addition or shows error if invalid

3. VIEW CART
   - Displays all items currently in your cart
   - Shows quantities and individual item totals
   - Displays grand total for all items

4. REMOVE ITEM FROM CART
   - Enter product ID to remove from cart
   - Confirms removal or shows error if item not found

5. CHECKOUT
   - Processes your order
   - Displays final order details and total
   - Clears cart after successful checkout

6. EXIT
   - Closes the application with a thank you message


SAMPLE OUTPUT
================================================================================

Welcome Screen:
╔══════════════════════════════════════════════════════════════════════════════╗
║       ███████╗██╗  ██╗ ██████╗ ██████╗ ███████╗ █████╗ ███████╗███████╗      ║
║       ██╔════╝██║  ██║██╔═══██╗██╔══██╗██╔════╝██╔══██╗██╔════╝██╔════╝      ║
║       ███████╗███████║██║   ██║██████╔╝█████╗  ███████║███████╗█████╗        ║
║       ╚════██║██╔══██║██║   ██║██╔═══╝ ██╔══╝  ██╔══██║╚════██║██╔══╝        ║
║       ███████║██║  ██║╚██████╔╝██║     ███████╗██║  ██║███████║███████╗      ║
║       ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝      ║
║                                                                              ║
║                           ONLINE SHOPPING SYSTEM                             ║
║                                                                              ║
║                   "Shop your favorite items with Ease"                       ║
║                                                                              ║
╚══════════════════════════════════════════════════════════════════════════════╝

Product Catalog Example:
- ID: 1 | Smartphone by Apple | Model: iPhone 15 | Price: $699.99
- ID: 2 | Laptop by Dell | Model: XPS 13 | Price: $1299.99
- ID: 3 | T-Shirt | Material: Cotton | Size: M | Price: $29.99
- ID: 5 | The Alchemist by Paulo Coelho | Genre: Fiction | Price: $19.99

Shopping Cart Example:
===== SHOPPING CART =====
1. Smartphone x2 - $1399.98
3. T-Shirt x1 - $29.99
Total: $1429.97


PROJECT HIGHLIGHTS
================================================================================

✓ Clean code architecture with separation of concerns
✓ Robust error handling and input validation
✓ Scalable design allowing easy addition of new product types
✓ Professional console UI with ANSI colored output
✓ Complete shopping workflow from browsing to checkout
✓ Demonstrates all core OOP principles in practical application


FUTURE ENHANCEMENTS
================================================================================

Potential improvements for future versions:

• User authentication and account management
• Persistent data storage using file I/O or database
• Order history and tracking
• Product search and filtering capabilities
• Discount codes and promotional system
• Multiple payment method options
• Product inventory management with stock levels
• Enhanced UI with JavaFX or Swing for GUI version
• Integration with external APIs for real product data


KNOWN LIMITATIONS
================================================================================

• Cart capacity limited to 10 items
• No data persistence (cart cleared after program exit)
• Product catalog is hardcoded (no dynamic inventory)
• Single user system (no multi-user support)
• ANSI colors may not display properly on all terminals


TROUBLESHOOTING
================================================================================

Issue: Colors not displaying correctly
Solution: Ensure your terminal supports ANSI escape codes. On Windows, use 
          Windows Terminal or enable ANSI support in Command Prompt.

Issue: NumberFormatException errors
Solution: Ensure you enter valid numeric values when prompted for product IDs 
          and quantities.

Issue: Compilation errors
Solution: Verify all .java files are in the same directory and you're using 
          JDK 8 or higher.


AUTHOR AND ACKNOWLEDGEMENTS
================================================================================

Author: Christiana Grace Alib
GitHub: https://github.com/JemSulit
Repository: https://github.com/JemSulit/ShopEase

This project was created as a demonstration of Object-Oriented Programming 
concepts in Java, showcasing practical application of encapsulation, 
inheritance, polymorphism, abstraction, and exception handling.


LICENSE
================================================================================

This project is available as open source. Please check the repository for 
specific license information.


CONTRIBUTING
================================================================================

Contributions, issues, and feature requests are welcome! Feel free to check 
the issues page on GitHub or submit pull requests.

Steps to contribute:
1. Fork the repository
2. Create your feature branch (git checkout -b feature/AmazingFeature)
3. Commit your changes (git commit -m 'Add some AmazingFeature')
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a Pull Request


CONTACT
================================================================================

For questions, suggestions, or feedback, please open an issue on the GitHub 
repository or contact the author through GitHub.


================================================================================
                     Thank you for using ShopEase!
                  "Shop your favorite items with Ease"
================================================================================

Last Updated: 2025
Version: 1.0