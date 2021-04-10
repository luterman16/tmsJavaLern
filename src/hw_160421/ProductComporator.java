package hw_160421;

import java.util.Comparator;

public class ProductComporator implements Comparator<Product> {
    String sortObject;

    public ProductComporator(String sortObject) {
        this.sortObject = sortObject;
    }

    @Override
    public int compare(Product p1, Product p2) {
        switch (sortObject) {
            case "Price":
                return p1.getPrice() - p2.getPrice();
            case "Id":
                return p1.getId() - p2.getId();
            default:
                return 0;
        }


    }
}
