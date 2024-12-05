/**
 * Практика #1
 * Самостоятельно придумайте класс и переопределите для него метод equals(). Каким соглашениям должна следовать реализация этого метода?
 *
 * @author Aleksandra
 *
 */

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип
        Person person = (Person) obj; // Приведение типа
        return age == person.age && name.equals(person.name); // Сравнение полей
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age; // Генерация хэш-кода
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 30);
        Person person2 = new Person("Alex", 30);
        Person person3 = new Person("Stef", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
        System.out.println(person1.equals(null)); // false
    }
}

/*
В этом примере мы создадим класс Person и переопределим метод equals(), чтобы сравнивать объекты этого класса по имени и возрасту. При реализации метода equals() важно следовать определенным соглашениям:
Симметричность: Если объект A равен объекту B, то объект B должен быть равен объекту A.
Транзитивность: Если A равно B и B равно C, то A должно быть равно C.
Консистентность: Многоразовые вызовы метода equals() для одного и того же объекта должны возвращать одно и то же значение, если поля не изменяются.
Неравенство с null: Любой объект не должен быть равен null.
*/