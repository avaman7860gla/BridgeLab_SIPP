import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    static class ShoppingCart {
        ArrayList<CartItem> items = new ArrayList<>();

        void addItem(CartItem item) {
            items.add(item);
            System.out.println(item.itemName + " added to the cart.");
        }

        void removeItem(String itemName) {
            items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
            System.out.println(itemName + " removed from the cart.");
        }

        void displayTotalCost() {
            double total = 0;
            for (CartItem item : items) {
                total += item.price * item.quantity;
            }
            System.out.println("Total cost: ₹" + total);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 55000, 1));
        cart.addItem(new CartItem("Mouse", 500, 2));
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}