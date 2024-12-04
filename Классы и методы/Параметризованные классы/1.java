/**
 * Практика #1
 * Приведите примеры использования оператора instanceof с объектами параметризованных классов.
 *
 * @author Aleksandra
 *
 */

import java.util.ArrayList;

class Container<T> {
    private T value;

    Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello");
        Container<Integer> integerContainer = new Container<>(123);

        Object obj = stringContainer; // Объект типа Container<String>

        // Проверяем, является ли obj экземпляром Container
        if (obj instanceof Container) {
            System.out.println("obj is an instance of Container.");
        }

        // Но не можем проверить параметризованный тип напрямую
        if (obj instanceof Container<?>) {
            System.out.println("obj is an instance of Container<?>.");
        }

        // Проверка на конкретный тип параметра
        if (obj instanceof Container && ((Container<?>) obj).getValue() instanceof String) {
            System.out.println("obj is an instance of Container<String>.");
        }
    }
}