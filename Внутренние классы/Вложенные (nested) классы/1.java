/**
 * Практика #1
 * Приведите примеры "вложение" класса в интерфейс и покажите способ вызова методе такого вложенного класса.
 *
 * @author Aleksandra
 *
 */

// Интерфейс с вложенным классом
interface MyInterface {

    // Вложенный класс внутри интерфейса
    class NestedClass {
        private String message;

        // Конструктор для инициализации сообщения
        public NestedClass(String message) {
            this.message = message;
        }

        // Метод для вывода сообщения
        public void showMessage() {
            System.out.println("Сообщение из вложенного класса: " + message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект вложенного класса через интерфейс
        MyInterface.NestedClass nestedObject = new MyInterface.NestedClass("Привет, мир!");

        // Вызываем метод showMessage() вложенного класса
        nestedObject.showMessage(); // Вывод: Сообщение из вложенного класса: Привет, мир!
    }
}