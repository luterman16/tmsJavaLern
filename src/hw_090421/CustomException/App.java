package hw_090421.CustomException;

public class App {
    public static void main(String[] args) throws StartFailException {
        Car honda = new Car("Honda", 180, 2500);
        Car toyota = new Car("Toyota", 220, 2400);
        honda.start();
        toyota.start();
    }
}
