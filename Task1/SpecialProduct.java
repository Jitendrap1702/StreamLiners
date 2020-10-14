package Task1;

public class SpecialProduct extends Product {
    protected int regularPrice;
    protected int percentageOff;

    public SpecialProduct(String name, int price) {
        super(name, price);
        this.regularPrice = regularPrice;
        this.percentageOff = percentageOff;
    }
    @Override
    public String toString() {
        return String.format("%d percentage off on %d",percentageOff, regularPrice );
    }
    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
       int discountedPrice = (product.price*percentageOff)/100;
       SpecialProduct special = new SpecialProduct(product.name, discountedPrice);
       special.regularPrice = product.price;
       special.percentageOff = percentageOff;
       return special;
    }

}
