/**
 * Практика #2
 * Приведите все способы создания экземпляра класса Boolean.
 *
 * @author Aleksandra
 */
public class Main {
    public static void main(String[] args) {
        Boolean bool1 = true;

        Boolean bool2 = Boolean.valueOf(true); // Использование статического метода valueOf с булевым значением
        Boolean bool3 = Boolean.valueOf("true"); // Использование статического метода valueOf со строковым значением

        Boolean bool4 = new Boolean(true); // Создание экземпляра с использованием конструктора, передавая булево значение
        Boolean bool5 = new Boolean("true"); // Создание экземпляра с использованием конструктора, передавая строковое значение

        boolean bool6 = Boolean.parseBoolean("true"); // Парсинг строки в примитивное булевое значение
    }
}