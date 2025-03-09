## Assignment: Online Shopping System

**Project Description:**

You are tasked with developing a simple online shopping system in Java. The system should allow users to browse products, add items to their cart, proceed to checkout, and place orders.

**Requirements:**

1. **Product Class:**
    - Create a class named `Product` to represent individual products available for purchase.
    - Include data members such as `productName`, `productCode`, `price`, and `quantityAvailable`.
    - Implement appropriate constructor(s), getter and setter methods, and any other necessary methods.

2. **Customer Class:**
    - Create a class named `Customer` to represent customers using the online shopping system.
    - Include data members such as `customerName`, `email`, `address`, and `cart` (customer's shopping cart).
    - Implement appropriate constructor(s), getter and setter methods, and any other necessary methods.

3. **ShoppingCart Interface:**
    - Define an interface named `ShoppingCart` with the following methods:
        - `void addToCart(Product product)`: Adds a product to the shopping cart.
        - `void removeFromCart(String productCode)`: Removes a product from the shopping cart based on its product code.
        - `void viewCart()`: Displays the contents of the shopping cart.
        - `double calculateTotal()`: Calculates the total cost of the items in the shopping cart.
        - `void checkout() throws InsufficientStockException`: Completes the checkout process, updating product quantities and placing the order. Throws an `InsufficientStockException` if the quantity of any product in the cart exceeds the available stock.

4. **ShoppingCart Implementation Class:**
    - Implement the `ShoppingCart` interface in a class named `ShoppingCartImpl`.
    - Use an ArrayList to store the products in the shopping cart.
    - Implement the methods defined in the `ShoppingCart` interface, handling exceptions appropriately.

5. **Main Class:**
    - Create a `Main` class with a `main` method to serve as the entry point of the program.
    - Implement a simple menu-driven user interface using loops and if-else statements to allow users to interact with the online shopping system.
    - Provide options for browsing products, adding/removing items to/from the cart, viewing the cart, proceeding to checkout, and exiting the program.



Advance: 5+

Data Structure
Design System
LLD
HLD



class Customer {
   ....
   ShoppingCart cart; // String boot

   public Customer(String name, ...., ShoppingCart cart) {
      
   }

   

}

Customer karan = new Customer("Karan", ..., new ShoppingCartImpl());

Customer mohit = new Customer("Mohit", ..., new ShoppingCartImpl());


class ShoppingCartImpl implements ShoppingCart {

   private ArrayList<Product> products;

.....
}