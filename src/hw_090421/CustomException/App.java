package hw_090421.CustomException;

public class App {
    public static void main(String[] args)  {
        Car honda = new Car("Honda", 180, 2500);
        Car toyota = new Car("Toyota", 220, 2400);
       // throw StartFailException

            try {
                honda.start();
                toyota.start();
            } catch (StartFailException e) {
                e.printStackTrace();
            }
        }

    }

