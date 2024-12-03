/**
 * Класс Calculator предоставляет методы для выполнения
 * базовых арифметических операций: сложение, вычитание,
 * умножение и деление.
 *
 * @author Aleksandra
 * @version 1.0
 */

public class Main {

    /**
     * Сложение двух целых чисел.
     *
     * @param a первое целое число
     * @param b второе целое число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитание двух целых чисел.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Умножение двух целых чисел.
     *
     * @param a первое целое число
     * @param b второе целое число
     * @return произведение a и b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Деление двух целых чисел.
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b
     * @throws ArithmeticException если b равно 0
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return (double) a / b;
    }

    // Главная функция вызова для проверки функционала
    public static void main(String[] args) {
        Main calculator = new Main(); // Создание экземпляра класса

        System.out.println(calculator.add(1, 2)); // Сложение
        System.out.println(calculator.subtract(3, 1)); // Вычитание
        System.out.println(calculator.multiply(1, 2)); // Умножение

        // Обработка исключения деления на ноль
        try {
            System.out.println(calculator.divide(13, 0)); // Деление
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Вывод сообщения об ошибке
        }

        // Пример успешного деления
        System.out.println(calculator.divide(13, 2)); // Деление
    }
}