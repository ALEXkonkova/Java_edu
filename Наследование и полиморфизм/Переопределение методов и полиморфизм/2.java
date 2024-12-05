/**
 * Практика #2
 * Приведите пример переопределенного метода.
 * Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?
 *
 * @author Aleksandra
 *
 */

class Animal {
    // Метод для издания звука
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }

    // Метод с несовпадающим типом возвращаемого значения (ошибка)
    /*
    @Override
    public int sound() { // Это вызовет ошибку компиляции
        return 1; // Ошибка: метод не может иметь другой тип возвращаемого значения
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Вызовет метод sound из класса Dog
    }
}