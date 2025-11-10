> Project Overview
  > The Potato Corner Ordering System allows customers to browse through various menu categories including fries sizes, flavors, specialty fries, and new products. The system guides users through a step-by-step ordering process, calculates totals automatically, and provides a server-like interaction experience.

> OOP Concepts Applied
  > Encapsulation
    > Private fields with public getters/setters
    > Data validation in constructors
   
  > Inheritance
    > Fries and Snack classes inherit from Product
    > BasicMenuItem also inherits from Product
    > Clear class hierarchy with code reuse

  > Polymorphism
    > Different getPrice() implementations in each subclass
    > Same MenuItem interface used for all objects
    > Dynamic method binding at runtime

  > Abstration
    > MenuItem interface defines the contract
    > Product abstract class provides common functionality

  > Exception Handling
    > Custom OrderFullException
    > Input validation with try-catch blocks

> Program Structure
MenuItem (Interface)
    ↑
BasicMenuItem (Concrete Class)
    ↑
Order → uses MenuItem[]
OrderFullException (Custom Exception)
PotatoCorner (Main Class)

> How to Run the Program
  1. Download PotatoCorner.java, Product.java, Snack.java, MenuItem.java, BasicMenuItem.java, Order.java, and OrderFullException.java.
  2. Open and Java Compiler (preferrably Visual Studio Code)
  3. Ctrl + O > PotatoCorner.java
  4. Run the file
     
> Sample output


> Author and acknowledgement
Ms. Fatima Marie P. Agdon, MSCS - CS 211 Instructor for project guidance and OOP principles
Potato Corner - For the inspiration and menu concept
Java Documentation and OOP principles that formed the foundation of this project

> Other Sections you may include

