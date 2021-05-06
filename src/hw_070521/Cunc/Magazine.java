package hw_070521.Cunc;

import java.util.Random;

public class Magazine extends Thread {

    private int client = 0;

    synchronized void open() {
        while (client < 4) {
            try {
                System.out.println("Перерыв 10 секунд");
                wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random random = new Random();
        int time = random.nextInt(9);
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Магазин работает");
        client--;
        System.out.println("Клиент вышел из магазина");
        System.out.println("В магазине осталось " + client + " клиентов");
        notify();

    }

    synchronized void addClient() {
        while (client == 5) {
            try {
                System.out.println("В магазине 5 клиентов. Временно не принимаем");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        client++;
        System.out.println("В магазин зашел клиент");
        System.out.println("В магазине " + client + " клиентов");
        notify();
    }
}


