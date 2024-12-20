/**
 * Практика #4
 * Объяснить полученный результат. Для чего используется класс IntegerCache?
 *
 * @author Aleksandra
 */
public class Main {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));  // true
        System.out.println("b1==i1 " + (b1 == i1));  // true
        System.out.println("a1==b1 " + (a1 == b1));  // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));  // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));  // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));  // true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));  // true
        System.out.println("b2==i2 " + (b2 == i2));  // true
        System.out.println("a2==b2 " + (a2 == b2));  // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));  // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));  // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));  // true
    }
}

/**
 * Объяснение:
 * При работе с автоупаковкой для чисел от -128 до 127 используется класс IntegerCache, который кэширует эти значения.
 * Поэтому для переменных a2 и b2, которые хранят число 127, ссылки будут указывать на один и тот же объект.
 * Для значений за пределами диапазона кэша (например, 128) объекты Integer создаются заново, и ссылки на них будут разными, даже если значения одинаковы.
 *
 * Результаты:
 * a1 == i1 и b1 == i1: Верно, так как a1 и b1 упаковывают i1, а автораспаковка происходит при сравнении с примитивом int (при этом обращаются к содержимому объектов).
 * a1 == b1: Ложно, потому что a1 и b1 ссылаются на разные объекты Integer.
 * .equals(): Метод equals() сравнивает значения объектов. Поэтому для a1.equals(i1) и b1.equals(i1) вернёт true, так как содержимое объектов равно значению i1. Для a1.equals(b1) также будет true, потому что оба значения равны (128).
 *
 * Integer a2 = i2; и Integer b2 = i2;: Здесь оба объекта указывают на один и тот же экземпляр в кэше, поэтому:
 * a2 == i2 и b2 == i2: Все равно true, как и ранее.
 * a2 == b2: Теперь возвращает true, так как обе ссылки указывают на тот же объект в кэше.
 * .equals(): Все вызовы .equals() вернут true, так как метод сравнивает значения, которые равны 127.
 *
 * Класс IntegerCache
 * IntegerCache — это класс в Java, который отвечает за кэширование объектов Integer в диапазоне от -128 до 127. Это значит, что все объекты Integer, которые представляют числа в этом диапазоне, будут ссылаться на один экземпляр, что экономит память и ускоряет операции сравнения.
 * Автоупаковка: Для чисел от -128 до 127 создания нового объекта Integer не происходит, и вместо этого используется уже существующий экземпляр.
 * Оптимизация: Использование IntegerCache позволяет значительно сократить память и повысить производительность при частом использовании чисел в этом диапазоне, так как создаются только уникальные экземпляры для других значений (выше 127 или ниже -128).
 */