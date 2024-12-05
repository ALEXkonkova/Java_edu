/**
 * Практика #1
 * Приведите пример кода, в котором продемонстрированы следующие ситуации:
 *
 * несколько исключений обрабатываются абсолютно идентичным образом;
 * исключения, которые обрабатываются, образуют иерархию Ex1 <|-- Ex2 <|-- Ex3, т.е. Ex3 - подкласс Ex2, а Ex2 - подкласс Ex1.
 *
 * @author Aleksandra
 *
 */

// Определение пользовательских исключений
class Ex1 extends Exception {} // Базовый класс исключений
class Ex2 extends Ex1 {}       // Ex2 наследуется от Ex1
class Ex3 extends Ex2 {}      // Ex3 наследуется от Ex2

public class Main {

    public static void main(String[] args) {
        try {
            // Вызов метода, который генерирует исключения
            methodThatThrowsExceptions();
        } catch (Ex3 e) { // Перехватываем самый специфичный тип исключения Ex3
            System.out.println("Перехвачено исключение типа Ex3: " + e.getClass().getSimpleName());
        } catch (Ex2 e) { // Перехватываем более общий тип исключения Ex2
            System.out.println("Перехвачено исключение типа Ex2: " + e.getClass().getSimpleName());
        } catch (Ex1 e) { // Перехватываем самый общий тип исключения Ex1
            System.out.println("Перехвачено исключение типа Ex1: " + e.getClass().getSimpleName());
        }

        // Обработка нескольких исключений идентичным образом
        try {
            // Вызов метода, который также генерирует исключения
            methodThatThrowsMultipleExceptions();
        } catch (Ex1 e) { // Обрабатываем только исключения типа Ex1
            System.out.println("Перехвачено исключение типа Ex1: " + e.getClass().getSimpleName());
        }
    }

    // Метод, который генерирует исключение и указывает, что оно может возникнуть
    public static void methodThatThrowsExceptions() throws Ex1 {
        throw new Ex3(); // Генерация исключения типа Ex3
    }

    // Метод, который также генерирует исключение
    public static void methodThatThrowsMultipleExceptions() throws Ex1 {
        throw new Ex2(); // Генерация исключения типа Ex2
    }
}