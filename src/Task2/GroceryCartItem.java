package Task2;

public class GroceryCartItem  extends GroceryItem {
    float price;
    float quantity;

    public GroceryCartItem(String name, int pricePerKg) {
        super(name, pricePerKg);
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s (Rs.%d x %fkg) = Rs.%f", name, pricePerKg, quantity, price);
    }
    public static float extractQuantity(String quantityStr){
        String[] outputstr = quantityStr.split(" ", 0);
        outputstr[0] = outputstr[0].replace("kg", "");
        outputstr[1] = outputstr[1].replace("g", "");
        float kiloGrams = Integer.parseInt(outputstr[0]);
        float grams = Integer.parseInt(outputstr[1]);
        float v = kiloGrams + (grams / 1000);
        return v;
    }
    public static GroceryCartItem createNew(GroceryItem item, String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
        cartItem.quantity = extractQuantity(quantityStr);
        cartItem.price = (float) (item.pricePerKg * cartItem.quantity);
        return  cartItem;
    }
}
