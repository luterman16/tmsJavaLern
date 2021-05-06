package hw_070521.Cunc;

public class App {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        new Producer(magazine).start();
        new Consumer(magazine).start();
    }
}
