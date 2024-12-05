/**
 * Практика #1
 * Приведите пример кода, демонстрирующего все три варианта использования ключевого слова super.
 *
 * @author Aleksandra
 *
 */

// Суперкласс
class Animal {
    String name;

    // Конструктор суперкласса
    Animal(String name) {
        this.name = name;
    }

    // Метод суперкласса
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Подкласс
class Dog extends Animal {
    String breed;

    // Конструктор подкласса с использованием super для вызова конструктора суперкласса
    Dog(String name, String breed) {
        // Вызов конструктора суперкласса
        super(name);
        this.breed = breed;
    }

    // Метод в подклассе, который переопределяет метод суперкласса
    @Override
    void makeSound() {
        // Использование super для доступа к методу суперкласса
        super.makeSound(); // Вызов метода суперкласса
        System.out.println(name + " barks.");
    }

    // Метод для получения информации о собаке
    void displayInfo() {
        // Использование super для доступа к полю суперкласса
        System.out.println("Dog's name: " + super.name); // Доступ к полю суперкласса
        System.out.println("Dog's breed: " + breed);
    }
}

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Вызов метода, который использует все три применения super
        dog.makeSound();
        dog.displayInfo();
    }
}