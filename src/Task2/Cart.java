package Task2;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    public Cart(){
        this.cartItems = new ArrayList<>();
        this.totalAmount = 0;
    }
    public Cart add(GroceryCartItem item){
        cartItems.add(item);
        totalAmount += item.price;
        return this;
    }
    @Override
    public String toString() {
        StringBuilder cartBuild = new StringBuilder();
        cartBuild.append("Cart{\n")
                .append("\tgroceryCartItems = [\n");
        for (GroceryCartItem cartItem : cartItems) {
            cartBuild.append("\t").append(cartItem).append(",\n");
        }
        cartBuild.append("\t],").append("\n\ttotalAmount = Rs.").append(totalAmount).append("\n")
                .append("}");
        return cartBuild.toString();
    }

}
