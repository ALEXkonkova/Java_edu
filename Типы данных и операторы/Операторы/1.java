/**
 * Практика #1
 * Приведите примеры использования всех определенных выше операторов с операндами
 * базовых типов, а также с операндами типа String.
 * Для операторов ++ и -- продемонстрируйте префиксную и постфиксную форму записи.
 *
 * @author Aleksandra
 */
public class Main {
    public static void main(String[] args) {
        // Переменные для арифметических операций
        int a = 6;
        int b = 3;

        // Сложение
        int sum = a + b;
        System.out.println("Сложение: " + sum);

        // Пример использования оператора +=
        a += 1;
        System.out.println("a после a + 1: " + a);

        // Вычитание
        int diff = a - b;
        System.out.println("Разность: " + diff);

        // Умножение
        int product = a * b;
        System.out.println("Произведение: " + product);

        // Деление
        int division = a / b;
        System.out.println("Деление: " + division);

        // Остаток от деления
        int remainder = a % b;
        System.out.println("Остаток от деления: " + remainder);

        // Сравнение
        boolean is_equal = (a == b);
        boolean is_not_Equal = (a != b);
        System.out.println("a == b: " + is_equal);
        System.out.println("a != b: " + is_not_Equal);

        // Логические операторы
        boolean logical_and = (a > 0 && b > 0);
        System.out.println("a > 0 && b > 0: " + logical_and);

        boolean logical_or = (a < 0 || b > 0);
        System.out.println("a < 0 || b > 0: " + logical_or);

        // Примеры работы с операторами инкремента и декремента
        int x = 6;
        System.out.println("x до префиксного ++: " + x);
        System.out.println("префиксный ++x: " + ++x); // Префиксный инкремент
        System.out.println("постфиксный x++: " + x++); // Постфиксный инкремент
        System.out.println("x после постфиксного x++: " + x);

        // Работа со строками
        String hello = "Hello";
        String world = "World";

        // Конкатенация строк
        String greeting = hello + " " + world;
        System.out.println("Конкатенация строк: " + greeting);

        // Использование оператора += для строк
        String message = "Hello";
        message += " World";
        System.out.println("Результат сложения для строк: " + message);
    }
}