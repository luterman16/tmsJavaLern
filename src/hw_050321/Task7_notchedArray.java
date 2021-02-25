package hw_050321;

public class Task7_notchedArray {
    public void notchedArray() {

        int n = (int) (Math.random()*100);
        int[][] array = new int[n][];

        //создание зубчатого массива
        for (int i = 0; i < array.length; i++ ) {
            int randomInt = (int) (Math.random()*100);
            array[i] = new int[randomInt];
        }

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
                System.out.print(array[i][j] + " ");
            }
        }



    }
}
