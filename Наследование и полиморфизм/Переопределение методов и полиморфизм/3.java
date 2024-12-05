/**
 * Практика #3
 * Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.
 *
 * @author Aleksandra
 *
 */

class Animal {
    public void makeSound() {
        System.out.println("Bark Bark Bark");
    }
}

class Dog extends Animal {
    // Правильное переопределение
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    /*
    @Override
    public void makeSounds() { // Ошибка: метод не переопределяет ничего в суперклассе
        System.out.println("Bark Bark");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Выведет: Bark
    }
}

/*
Если раскомментировать строку с неправильным именем метода makeSound(), компилятор выдаст ошибку:
java: method does not override or implement a method from a supertype

Таким образом, использование аннотации @Override помогает предотвратить ошибки при переопределении методов и
гарантирует, что метод действительно переопределяет метод суперкласса, что необходимо для соблюдения принципов ООП и инкапсуляции.
 */