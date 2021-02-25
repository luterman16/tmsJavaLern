package hw_050321;

import java.util.Arrays;
import java.util.Scanner;

public class Task6_array2x {
    public void printArray2x() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите индекс внешнего массива:");
        int n = in.nextInt();
        System.out.println("Введите индекс внутреннего массива:");
        int x = in.nextInt();


        int[][] array = new int[n][x];

        //заполнение массива целыми числами
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random()*100);
            }
        }

        //вывод на экран значений по условию
          for(int i = 0; i < array.length; i ++) {
              System.out.println("");
              for (int j = 0; j < array[i].length; j++){
                  if (array[i][j] % 2 == 0 ) {
                      System.out.print("0");
                  } else {
                      System.out.print("1");
                  }
              }
        }
    }
}
