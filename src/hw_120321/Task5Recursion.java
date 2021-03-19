package hw_120321;

import java.util.Scanner;

public class Task5Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 1:");

        int n = 0;
        //Зацикливаем приём числа >1 пока не будет число >1
        while (n <= 1) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 1) {
                    System.out.println("Введенное число должно быть больше 1. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }

        //Вызов функции для определении сосавного/простого числа
        String actual = isSimple(n, n - 1);

        //Распечатать результат
        System.out.printf("Is number %d simple - %s", n, actual);

    }

    static String isSimple(int x, int y) {
        if (y == 1) {
            return "Yes";
        }
        if (x % y == 0) {
            return "No";
        }
        return isSimple(x, y - 1);
    }
}
