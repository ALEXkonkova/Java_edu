/**
 * Практика #2
 * Что произойдет, если класс реализует два интерфейса с одинаковыми неабстрактными методами? Как выйти из такого положения? Приведите пример.
 *
 * @author Aleksandra
 *
 */

// Определяем первый интерфейс с неабстрактным методом
interface InterfaceA {
    // Метод по умолчанию
    default void show() {
        System.out.println("Интерфейс A");
    }
}

// Определяем второй интерфейс с аналогичным методом
interface InterfaceB {
    // Метод по умолчанию
    default void show() {
        System.out.println("Интерфейс B");
    }
}

// Класс, который реализует оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Переопределяем метод show(), чтобы устранить конфликт
    @Override
    public void show() {
        // В данном методе мы можем выбрать, какой метод вызывать из интерфейсов
        // Вызовем метод show() из InterfaceA
        InterfaceA.super.show(); // Вызывает метод из InterfaceA

        // Вызовем метод show() из InterfaceB
        InterfaceB.super.show(); // Вызывает метод из InterfaceB
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызываем метод show() у экземпляра myClass
        myClass.show(); // При вызове этого метода мы увидим вывод из обоих интерфейсов
    }
}