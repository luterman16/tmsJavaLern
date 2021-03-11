package hw_120321;

public class Task1Trainee {
    public static void main(String[] args) {
        double km = 10;
        double total = 0;

        for (int i = 0; i < 6; i++) {
            km += km / 100 * 10;
            total += km;
        }
        System.out.println(total);
    }
}
