package Task2;

public class Main {
    public static void main(String[] args) {
        GroceryItem tea = new GroceryItem("Tea",200);
        GroceryItem butter = new GroceryItem("Butter",300);
        GroceryItem chips = new GroceryItem("Chips",20);
        GroceryItem namkeen = new GroceryItem("Namkeen",100);

        Cart cart=new Cart();
        cart.add(GroceryCartItem.createNew(tea,"2kg 500g"))
                .add(GroceryCartItem.createNew(butter,"1kg 0g"))
                .add(GroceryCartItem.createNew(chips,"3kg 200g"))
                .add(GroceryCartItem.createNew(namkeen,"0kg 550g"));
        System.out.println(cart);
    }
}
