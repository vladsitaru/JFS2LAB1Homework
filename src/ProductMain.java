import java.util.HashMap;

public class ProductMain {
    public static void main(String[] args) {


        Product product1 = new Product(1, "Coffee", 5);
        Product product2 = new Product(2, "Milk", 10);
        Product product3 = new Product(3, "Biscuits", 12);
        Product product4 = new Product(4, "Biscuits", 12);


        Shop shop = new Shop(new HashMap<Product, Integer>());

        shop.addProductToShop(product1, 5);
        shop.addProductToShop(product2, 10);
        shop.addProductToShop(product3, 4);
        shop.addProductToShop(product4, 4);

        shop.purchaseProduct(product1, 6);
    }
}