package hw_120321;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 3:");

        int n = 0;
        //Зацикливаем приём числа >3 пока не будет число >3
        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }

        //Создаём и заполняем массив
        int[] array = new int[n];
        int countParityElements = 0;   // Счётчик чётных элементов

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * n);
            if(array[i]%2 == 0) {
                countParityElements++;
            }
        }

        System.out.println(Arrays.toString(array));

        //Создание и заполнение массива из нечётных элементов первого массива
        int[] array2 = new int[countParityElements];
        int indexArr2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[indexArr2] = array[i];
                indexArr2++;
            }
        }

        System.out.println(Arrays.toString(array2));
    }
}
