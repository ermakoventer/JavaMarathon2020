package day2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5) {
            System.out.println("y = " + (pow(x,2) - 10) / (x + 7));
        } else if (-3 < x && x < 5) {
            System.out.println("y = " + (x + 3) * (pow(x,2) - 2));
        } else {
            System.out.println("y = 420" );
        }


    }
}
