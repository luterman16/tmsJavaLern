package hw_230421.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream("src/hw_230421/Task4/carNew.dat"));
             ObjectInputStream objectInputStream = new ObjectInputStream
                     (new FileInputStream("src/hw_230421/Task4/car.dat"))
        ){
            Car newCar = (Car)objectInputStream.readObject();
            System.out.println(newCar.getMark());

            Car car = new Car("Volvo", 220, 25000);
            objectOutputStream.writeObject(car);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
