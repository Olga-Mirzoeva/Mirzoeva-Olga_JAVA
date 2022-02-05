package task;

public class Array extends Number {
    public static void arrayPrint() {
        // 3.	Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива
        // кратные 3

        System.out.println("Введите длину (количество элементов) массива: ");
        int size = Number.scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = Number.scanner.nextInt();
        }
        Number.scanner.close();
        System.out.println("Заполненый массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 & array[i] != 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("Это элементы массива кратные 3  ");
    }
}
