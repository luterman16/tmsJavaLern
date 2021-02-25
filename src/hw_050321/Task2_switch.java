package hw_050321;

import java.util.Scanner;

public class Task2_switch {
    public void dayOfWeek() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int n = in.nextInt();

        if (n<10) {

            switch (n) {
                case 1: System.out.println("Понедельник");
                        break;
                case 2: System.out.println("Вторник");
                        break;
                case 3: System.out.println("Среда");
                        break;
                case 4: System.out.println("Четверг");
                        break;
                case 5: System.out.println("Пятница");
                        break;
                case 6: System.out.println("Суббота");
                        break;
                case 7: System.out.println("Воскресенье");
                        break;
                default:
                    System.out.println("Нет такого дня недели");
            }
        }
    }
}
