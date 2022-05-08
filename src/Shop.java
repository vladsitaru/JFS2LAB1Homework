import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Objects;

public class Shop {
    private final HashMap<Product, Integer> product;

    public Shop(HashMap<Product, Integer> project) {
        this.product = new HashMap<>(project);
    }


    public void addProductToShop(Product product, Integer inventoryCount) {
        Object[] objArray = this.product.keySet().toArray();
        boolean isDuplicate = false;

        for (int i = 0; i < objArray.length; i++) {
            Product p = (Product)objArray[i];
            if(p.getName().equalsIgnoreCase(product.getName()))
                isDuplicate = true;
        }
        if (isDuplicate)
            System.out.println(product.getName() + " is already in the shop");
        else {
            this.product.put(product, inventoryCount);
            System.out.println(product.getName() + " added to the shop");
        }
    }


    public void purchaseProduct(Product project, Integer count) {
        if (count > this.product.get(project)) {
            System.out.println("Not enough units in stock");
        }
        else if (count < 0) {
            System.out.println("Cannot purchase a negative unit");
        }
        else System.out.println("Purchase successful!");
    }

    public HashMap<Product, Integer> getProduct() {
        return new HashMap<>(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(product, shop.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "project=" + product +
                '}';
    }
}
