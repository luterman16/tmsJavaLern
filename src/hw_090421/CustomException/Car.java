package hw_090421.CustomException;

import java.util.Random;

public class Car {
    private String mark;
    private int speed;
    private int price;

    public void start() throws StartFailException {
        Random r = new Random();
        int x = r.nextInt(21);

        if (x%2 != 0) {
            System.out.println("Автомобиль марки " + mark + " завелся");
        } else {
            throw new StartFailException("Автомобиль марки " + mark + " не завелся");
        }
    }

    public Car() {
    }

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
