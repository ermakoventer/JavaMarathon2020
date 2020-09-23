package day3;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double div = a/b;

        while (div !=0 ) {
            if (b == 0) {
                break;
            }
            System.out.println(div);
            break;
        }
    }
}
