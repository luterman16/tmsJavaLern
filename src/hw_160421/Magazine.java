package hw_160421;

import java.util.ArrayList;

public class Magazine {
    private final ArrayList<Product> productList = new ArrayList<>();



    public void addProduct(Product product) {
        productList.add(product);
    };

    public ArrayList getProducts() {
        return productList;
    };

    public void removeProduct(int id) {
        boolean removeStatus = false;

        for (Product product : productList) {
            if (product.getId() == id) {
                int indexOfProduct = productList.indexOf(product);
                productList.remove(indexOfProduct);
                removeStatus = true;
                break;
            }
        }
        String status = removeStatus == true ? "Продукт удален" : "Продукт не найден";
        System.out.println(status);
    };

    public void editProduct(Product product) {
        int idNewProduct = product.getId();
        for (Product e : productList) {
            if (e.getId() == idNewProduct) {
                int indexOfProduct = productList.indexOf(e);
                productList.set(indexOfProduct, product);
                break;
            }
        }
    };
}
