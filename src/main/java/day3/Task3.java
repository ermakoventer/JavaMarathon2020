package day3;

import javax.swing.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double div = a/b;

        while (div !=0 ) {
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(div);
            break;
        }
    }
}
