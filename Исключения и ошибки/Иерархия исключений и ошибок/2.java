/**
 * Практика #2
 * Приведите примеры кода, в которых генерируются и обрабатываются следующие исключения.
 *
 * ArithmeticException
 * ArrayIndexOutOfBoundsException
 * IllegalArgumentException
 * ClassCastException
 * NullPointerException
 *
 * @author Aleksandra
 *
 */

public class Main {
    public static void main(String[] args) {

        // Пример ArithmeticException
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // Исключение деления на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Нельзя делить на ноль.");
        }

        // Пример ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5]; // Исключение выхода за границы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс за пределами массива.");
        }

        // Пример IllegalArgumentException
        try {
            printPositiveNumber(-5); // Передача некорректного аргумента
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Аргумент должен быть положительным!");
        }

        // Пример ClassCastException
        try {
            Object obj = new Integer(10);
            String str = (String) obj; // Приведение типа Integer к String вызывает ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Неверное приведение типов!");
        }

        // Пример NullPointerException
        try {
            String str = null;
            int length = str.length(); // Попытка вызова метода у null вызывает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка обращения к null-объекту!");
        }
    }

    // Метод для примера IllegalArgumentException
    public static void printPositiveNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным!");
        }
        System.out.println("Число: " + number);
    }
}