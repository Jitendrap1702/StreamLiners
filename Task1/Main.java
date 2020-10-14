package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name;
        Product apple=new Product("Apple", 180);
        Product apple1=new Product("Apple",160);
        Product orange=new Product("Orange",150);

        for (Product product : Arrays.asList(apple, apple1, orange)) {
            System.out.println(product);
        }
        
        System.out.println(apple.equals(apple1));
        SpecialProduct special=SpecialProduct.applyOffOnProduct(apple,25);
        System.out.println(special);
    }
}
