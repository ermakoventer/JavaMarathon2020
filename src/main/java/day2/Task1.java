package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i >= 1 && i <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (i > 4 && i < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (i >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
