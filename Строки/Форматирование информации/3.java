/**
 * Практика #3
 * Приведите пример использования пяти любых спецификаторов из таблицы.
 *
 * @author Aleksandra
 *
 */

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        // Пример использования flush()
        PrintWriter writer = new PrintWriter(System.out);
        writer.print("Привет!");
        writer.flush(); // Сбрасывает буфер, выводя данные на консоль

        // Примеры спецификаторов для форматирования времени и даты
        Calendar calendar = Calendar.getInstance();
        Formatter formatter = new Formatter();

        // Пример форматирования времени и даты
        formatter.format("Час (24-часовой формат): %tH%n", calendar);
        formatter.format("Час (12-часовой формат): %tI%n", calendar);
        formatter.format("Минуты: %tM%n", calendar);
        formatter.format("Секунды: %tS%n", calendar);
        formatter.format("Год (четырехзначный): %tY%n", calendar);

        // Вывод форматированной строки
        System.out.println(formatter);

        formatter.close();
    }
}