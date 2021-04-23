package hw_160421;

public class Product {
    private static int counter = 100;
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.id = counter++; //проверку на id не делал, т.к. он должен каждый раз быть +1
        this.name = name;
        this.price = price;
    }

}
