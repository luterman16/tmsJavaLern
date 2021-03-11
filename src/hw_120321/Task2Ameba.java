package hw_120321;

public class Task2Ameba {
    public static void main(String[] args) {
        int amebaCount = 1;
        int time = 3;

        while (time <= 24) {
            time += 3;
            amebaCount *= 2;
        };

        System.out.println(amebaCount);
    }
}
