/**
 * Практика #1
 * Приведите пример интерфейса, в котором определен один неабстрактный метод и один статический метод, а также класс, реализующий этот интерфейс.
 * Покажите все способы вызова методов интерфейса.
 *
 * @author Aleksandra
 *
 */

// Определяем интерфейс
interface MyInterface {
    // Неабстрактный метод с реализацией
    default void display() {
        System.out.println("Это метод по умолчанию.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод.");
    }
}

// Реализуем интерфейс в классе
class MyClass implements MyInterface {
    // Переопределяем метод display() из интерфейса
    @Override
    public void display() {
        System.out.println("Это переопределённый метод в MyClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов неабстрактного метода display().
        myClass.display(); // Выведет: Это переопределённый метод в MyClass.

        // Вызов статического метода интерфейса MyInterface.
        MyInterface.staticMethod(); // Выведет: Это статический метод.
    }
}