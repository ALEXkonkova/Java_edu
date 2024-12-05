/**
 * Практика #1
 * Напишите программу, в которой будет продемонстрирована функциональность десяти любых методов класса String.
 * В комментариях к программе напишите пояснение к используемым методам.
 *
 * @author Aleksandra
 *
 */

public class Main {
    public static void main(String[] args) {
        String str = "Программирование для чайников на Java";

        // 1. length() - возвращает длину строки.
        System.out.println("Длина строки: " + str.length());

        // 2. charAt(int index) - возвращает символ по указанному индексу.
        System.out.println("Символ в индексе 5: " + str.charAt(5));

        // 3. substring(int beginIndex, int endIndex) - возвращает подстроку, начиная с указанного индекса
        System.out.println("Подстрока с 0 по 5: " + str.substring(0, 5));

        // 4. toUpperCase() - преобразует строку в верхний регистр.
        System.out.println("Верхний регистр: " + str.toUpperCase());

        // 5. toLowerCase() - преобразует строку в нижний регистр.
        System.out.println("Нижний регистр: " + str.toLowerCase());

        // 6. indexOf(String str) - возвращает индекс первого вхождения подстроки.
        System.out.println("Индекс 'Java': " + str.indexOf("Java"));

        // 7. lastIndexOf(String str) - возвращает индекс последнего вхождения подстроки.
        System.out.println("Индекс последнего 'а': " + str.lastIndexOf('a'));

        // 8. replace(char oldChar, char newChar) - заменяет символ в строке.
        System.out.println("Заменить 'а' на 'о': " + str.replace('a', 'o'));

        // 9. trim() - удаляет пробелы в начале и в конце строки.
        String strWithSpaces = "    Привет, мир!    ";
        System.out.println("Без пробелов: '" + strWithSpaces.trim() + "'");

        // 10. split(String regex) - разбивает строку на массив строк по заданному разделителю.
        String csv = "яблоко,банан,груша";
        String[] fruits = csv.split(",");
        System.out.println("Фрукты: ");
        for (String fruit : fruits) {
            System.out.println(fruit.trim()); // Используем trim, чтобы удалить лишние пробелы
        }
    }
}