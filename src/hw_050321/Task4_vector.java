package hw_050321;

import java.lang.reflect.Array;
import java.util.Random;

public class Task4_vector {
    public void vector() {
        Random rn = new Random();

        int n = (int) (Math.random()*100);
        double sum = 0;
        double minValue = 0;
        double maxValue = 0;
        int indexMinValue = 0;
        int indexMaxValue = 0;
        double multiplication = 1;

        double[] array = new double[n];

        // заполнение массива
        for (int i = 0; i < n; i++) {
            array[i] = rn.nextInt();
        }


        // считаем сумму отрицательных чисел
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
              sum += array[i];
            }
        }

        // поиск минимального значения и его индекса
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                indexMinValue = i;
            }
        }

        //поиск максимального значения и его индекса
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                indexMaxValue = i;
            }
        }

        //произведение элементов

        if (indexMaxValue > indexMinValue) {
            for(int i = indexMinValue; i < indexMaxValue; i++) {
                multiplication *= array[i];
            }
        } else {
            for  (int i = indexMinValue; i > indexMaxValue; i--) {
                multiplication *= array[i];
            }
        }

        System.out.println("Сумма отрицательных чисел равна: " + sum);
        System.out.println("Произвдение чисел от минимального до максимального равно: " + multiplication);

    }


}
