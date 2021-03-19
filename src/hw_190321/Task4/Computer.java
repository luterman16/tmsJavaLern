package hw_190321.Task4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processorType;
    private int ram;
    private int memory;
    private Scanner sc = new Scanner(System.in);
    private Boolean runTime = true;
    private Boolean isFire = false;
    private Boolean isActive = false;

    public void status(){
        System.out.println("Тип процессора: " + processorType);
        System.out.println("Объём оперативной памяти: " + ram);
        System.out.println("Объем памяти жесткого диска: " + memory);
    };

    private void runTime () {
        while (runTime){
            System.out.println();
            System.out.println("У вас есть 4 команды: ");
            System.out.println("status — для вывода статуса пк");
            System.out.println("start — для запуска пк");
            System.out.println("close — для выключения пк");
            System.out.println("exit — для выхода из программы");
            System.out.println("Введите вашу команду: ");

            String s = sc.nextLine();
            switch (s) {
                case "status":
                    status();
                    break;
                case "start":
                    start();
                    break;
                case "close":
                    close();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Нужно ввести 1 из 4 команд, а не " + s);
            }
        }
    };

    public void start(){
        Scanner scStart = new Scanner(System.in);
        if(isFire) {
            System.out.println("Ваш компьютер сгорел. Вы больше не сомжете его включить");
        } else if (isActive) {
            System.out.println("Компьютер уже включен!!!");
        } else {
            Random r = new Random();
            int x = r.nextInt(2);

            System.out.println("Чтобы включить компьютер введите число 1 или 0, если угадаете, то он включиться");
            int n = scStart.nextInt();

            if(n == x) {
                isActive = true;
                System.out.print("Компьютер включен");
            } else {
                System.out.print("Бедаааа, компьютер сгорел");
                isFire = true;
            }
        }
    };


    public void close(){
        Scanner scClose = new Scanner(System.in);
        if(isFire) {
            System.out.println("Ваш компьютер сгорел. Вам нечего выключать!!! ");
        } else if (!isActive){
            System.out.println("Компьютер ещё не включен");
        } else {
            Random r = new Random();
            int x = r.nextInt(2);

            System.out.println("Чтобы выключить компьютер введите число 1 или 0, если угадаете, то он выключиться");
            int n = scClose.nextInt();

            if(n == x) {
                isActive = false;
                System.out.println("Компьютер выключен");
            } else {
                System.out.print("О нееет, кто же так выключает. Он сгорел !! ");
                isFire = true;
            }
        }
    };

    public void exit(){
        runTime = false;
    };

    public Computer(String processorType, int ram, int memory) {
        this.processorType = processorType;
        this.ram = ram;
        this.memory = memory;
        runTime();
    }
}
