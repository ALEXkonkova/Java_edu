/**
 * Практика #2
 * Приведите примеры использования класса StringJoiner.
 *
 * @author Aleksandra
 *
 */

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Добавляем строки в StringJoiner
        joiner.add("Яблоко");
        joiner.add("Банан");
        joiner.add("Груша");

        // Выводим результат
        System.out.println(joiner.toString()); // Вывод: [Яблоко, Банан, Груша]
    }
}