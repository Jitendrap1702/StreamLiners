package Task1;

public class Product {
        String name;
        int price;

        public Product(String name, int price){
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return String.format("Name : %s @ Rs. %d", name, price );
        }
        @Override
        public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product prod = (Product) obj;

        boolean b = CharSequence.compare(name, prod.name) == 0 && price == prod.price;
        return b;
    }
}
