package hw_160421;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;

public class Add {
    public static void main(String[] args) {
        Product milk = new Product("Minsk Milk", 1);
        Product eggs = new Product("Brest Eggs", 12);
        Product water = new Product("Gomel Water", 120);
        Product meat = new Product("Mogilev Meat", 8);
        Product fish = new Product("Brest Fish", 10);

        //создать объект магазина
        Magazine gippo = new Magazine();
        //создать несколько товаров и добавить их в магазин
        gippo.addProduct(milk);
        gippo.addProduct(eggs);
        gippo.addProduct(water);
        gippo.addProduct(meat);
        gippo.addProduct(fish);
        //получить список товаров из магазина
        ArrayList<Product> productsListForSortPrice = gippo.getProducts();

        //Сортировка по цене
        Collections.sort(productsListForSortPrice, new ProductComporator("Price"));
        System.out.println("Список товаров после сортировке по цене:");
        for (Product e : productsListForSortPrice) {
            System.out.println(e.getPrice());
        }
        //удалить 1 товар
        gippo.removeProduct(102);

        //получить список товаров из магазина
        ArrayList<Product> productsListForSortId = gippo.getProducts();

        /*Сортировка по добавлению (в обратном порядке)
        При создании товара, я присваиваю ему id+1, поэтмоу делаю сортировку по id
        и применяю reversed() чтобы сделать в обратом порядке
         */
        Collections.sort(productsListForSortId, new ProductComporator("Id").reversed());
        System.out.println("Список товаров после сортировки по добавлению:");
        for (Product e : productsListForSortId) {
            System.out.println(e.getPrice());
        }

        //отредактировать один товар
        milk.setPrice(1500);
        gippo.editProduct(milk);

        //получить список товаров и вывести их в консоль
        ArrayList<Product> productsListAfterEdit = gippo.getProducts();
        System.out.println("Список товаров после редактирования товара");
        for (Product e : productsListAfterEdit) {
            System.out.println(e.getPrice());
        }

    }
}
