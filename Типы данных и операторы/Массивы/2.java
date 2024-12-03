/**
 * Практика #2
 * Самостоятельно изучите класс java.util.Array и приведите пример использования.
 *
 * @author Aleksandra
 *
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Пример использования toString(...)
        int[] numbers = {5, 2, 3, 4, 1};
        System.out.println("Массив: " + Arrays.toString(numbers)); // Вывод: [5, 2, 3, 4, 1]

        // Пример использования sort(...)
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers)); // Вывод: [1, 2, 3, 4, 5]

        // Пример использования binarySearch(...)
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Индекс элемента 3: " + index); // Вывод: 2

        // Пример использования equals(...)
        int[] anotherArray = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Массивы равны: " + areEqual); // Вывод: true

        // Пример использования compare(...)
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};
        int comparisonResult = Arrays.compare(array1, array2);
        if (comparisonResult < 0) {
            System.out.println("array1 меньше array2");
        } else if (comparisonResult > 0) {
            System.out.println("array1 больше array2");
        } else {
            System.out.println("array1 равно array2");
        }
    }
}