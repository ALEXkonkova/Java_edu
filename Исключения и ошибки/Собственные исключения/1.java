/**
 * Практика #1
 *
 * Приведите пример собственного класса исключения.
 *
 * @author Aleksandra
 *
 */

// Определение собственного класса исключения
class MyFirstException extends Exception {
    // Конструктор без параметров
    public MyFirstException() {
        super("Произошло общее исключение MyFirstException");
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Класс для демонстрации использования собственного исключения
public class Main {

    public static void main(String[] args) {
        try {
            throwNewException();
        } catch (MyFirstException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        try {
            throwNewExceptionWithCause();
        } catch (MyFirstException e) {
            System.out.println("Перехвачено исключение с причиной: " + e.getMessage());
            System.out.println("Причина: " + e.getCause());
        }
    }

    // Метод, который генерирует исключение
    public static void throwNewException() throws MyFirstException {
        throw new MyFirstException("Это пример пользовательского исключения.");
    }

    // Метод, который генерирует исключение с причиной
    public static void throwNewExceptionWithCause() throws MyFirstException {
        try {
            int result = 10 / 0; // Это вызовет ArithmeticException
        } catch (ArithmeticException e) {
            throw new MyFirstException("Ошибка деления на ноль", e);
        }
    }
}