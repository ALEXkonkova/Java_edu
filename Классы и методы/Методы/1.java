/**
 * Практика #1
 * Приведите примеры использования перегрузки и переопределения методов.
 *
 * @author Aleksandra
 *
 */
// Пример перегрузки метода:
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Пример переопределения метода:
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 4));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(2.5, 3.2));

        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}