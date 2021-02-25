package hw_050321;

import java.util.Scanner;

public class Task1_if {
    public void isOverlap() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter r:");
        double r = in.nextDouble();

        System.out.println("Enter a:");
        double a = in.nextDouble();

        System.out.println("Enter b:");
        double b = in.nextDouble();


        // calculate
        if (2 * r >= diagonal(a,b)) {
            System.out.println("Ok");
        } else {
                System.out.println("No");
            }

    }


    double diagonal(double a, double b) {
      return Math.sqrt(a * a + b * b);
    }

}
