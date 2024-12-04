/**
 * Практика #1
 * Приведите все варианты вызова метода printVars()
 *
 * @author Aleksandra
 *
 */
public class A {
    public static int a = 1; // Статическая переменная a
    public static int b; // Статическая переменная b

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main {
    public static void main(String[] args) {
        // Вызов метода printVars() без создания экземпляра класса A
        A.printVars(); // Вывод: 1, 0

        // Изменим значение переменной b и снова вызовем метод
        A.b = 10; // Присвоим переменной b значение 10
        A.printVars(); // Вывод: 1, 10

        // Изменим значение переменной a и снова вызовем метод
        A.a = 5; // Присвоим переменной a значение 5
        A.printVars(); // Вывод: 5, 10

        // Вызов метода printVars() еще раз
        A.printVars(); // Вывод: 5, 10
    }
}