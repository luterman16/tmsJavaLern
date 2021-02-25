package hw_050321;

import java.util.Random;

public class Task5_bubbleSort {
    public void bubbleSort() {

        int n = (int) (Math.random()*100);
        double[] array = new double[n];

        // заполнение массива
        for (int i = 0; i < n; i++) {
            array[i] = (Math.random()*100);
            System.out.println(array[i]);
        }

        //сортировка пузырьком
        for (int i = array.length - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    double element = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = element;
                }
            }
        }


    }
    }

