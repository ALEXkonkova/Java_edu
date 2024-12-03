/**
 * Практика #2
 * Приведите примеры использования оператора instanceof.
 * Отдельно рассмотрите случай, когда оператор применяется к null-объекту.
 *
 * @author Aleksandra
 */
public class Main {
    public static void main(String[] args) {
        // Создаем переменные разных типов
        String text = "Hello, World!";
        Integer number = 36;

        // Применяем оператор instanceof к строке
        boolean is_string = text instanceof String;
        // Применяем оператор instanceof к Integer
        boolean is_integer = number instanceof Integer;

        // Выводим результаты проверки
        System.out.println("text instanceof String: " + is_string); // Ожидается true
        System.out.println("number instanceof Integer: " + is_integer); // Ожидается true

        // Создаем переменную, равную null
        String null_string = null;

        // Применяем оператор instanceof к null
        boolean is_null_string = null_string instanceof String;

        // Выводим результат проверки для null
        System.out.println("null instanceof String: " + is_null_string); // Ожидается false

        // Краткое пояснение о результате проверки для null
        // Оператор instanceof возвращает false, если проверяемый объект равен null,
        // независимо от проверяемого типа.
    }
}