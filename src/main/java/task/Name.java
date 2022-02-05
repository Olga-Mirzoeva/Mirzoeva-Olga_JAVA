package task;

import java.util.Scanner;

public class Name {
    public static void sayName() {
        // 2.	Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
        // если нет, то вывести "Нет такого имени"

        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
