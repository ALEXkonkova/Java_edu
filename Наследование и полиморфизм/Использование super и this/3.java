/**
 * Практика #3
 * Перепешите следующий код с использованием конструкции this().
 * Помните, что в каждом конструкторе вызов this() должен быть единственным и первым среди всех операций.
 *
 * @author Aleksandra
 *
 */

class A {
    int a;
    int b;
    int c;
    int z;

    // Конструктор без параметров
    public A() {
        this(0, 0, 0); // Вызов конструктора с параметрами по умолчанию
        z = 1;
    }

    // Конструктор с одним параметром
    public A(int a) {
        this(a, 0, 0); // Вызов конструктора с двумя параметрами
        z = 1;
    }

    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a, b, 0); // Вызов конструктора с тремя параметрами
        z = 1;
    }

    // Конструктор с максимальным числом параметров
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}