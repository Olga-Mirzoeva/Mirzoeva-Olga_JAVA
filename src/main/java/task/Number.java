package task;

import java.util.Scanner;

public class Number {
    protected static Scanner scanner = new Scanner(System.in);

    public static void sayHello() {
        // 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”

        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Введенное число меньше или равно 7");
        }
    }
}
