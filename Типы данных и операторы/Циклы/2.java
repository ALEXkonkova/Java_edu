/**
 * Практика #2
 * Приведите пример использования операторов break и continue с любым видом цикла.
 *
 * @author Aleksandra
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        while (true) { // Бесконечный цикл
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                System.out.println("Нечетное число: " + number);
                System.out.println("Цикл завершен.");
                break; // Завершаем цикл, если число нечетное
            }

            if (number % 2 == 0) {
                // Если число четное, пропускаем эту итерацию
                System.out.print("Введите что-то еще: ");
                continue;
            }
        }
        scanner.close();
    }
}