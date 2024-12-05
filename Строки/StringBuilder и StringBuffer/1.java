/**
 * Практика #1
 * Напишите программу, в которой будет продемонстрирована функциональность десяти любых методов классов StringBuffer и StringBuilder.
 * В комментариях к программе напишите пояснение к используемым методам.
 *
 * @author Aleksandra
 *
 */

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров StringBuffer и StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Программирование");
        StringBuilder stringBuilder = new StringBuilder("Программирование");

        // 1. append(String str) - добавляет строку в конец текущей строки.
        stringBuffer.append(" на Java");
        stringBuilder.append(" на Java");
        System.out.println("StringBuffer после append: " + stringBuffer); // Вывод: Программирование на Java
        System.out.println("StringBuilder после append: " + stringBuilder); // Вывод: Программирование на Java

        // 2. insert(int offset, String str) - вставляет строку в указанное место.
        stringBuffer.insert(15, "и программирование");
        stringBuilder.insert(15, "и программирование");
        System.out.println("StringBuffer после insert: " + stringBuffer); // Вывод: Программировании программированиее на Java
        System.out.println("StringBuilder после insert: " + stringBuilder); // Вывод: Программировании программированиее на Java

        // 3. delete(int start, int end) - удаляет часть строки от start до end.
        stringBuffer.delete(15, 36);
        stringBuilder.delete(15, 36);
        System.out.println("StringBuffer после delete: " + stringBuffer); // Вывод: Программированиа Java
        System.out.println("StringBuilder после delete: " + stringBuilder); // Вывод: Программированиа Java

        // 4. reverse() - разворачивает строку.
        stringBuffer.reverse();
        stringBuilder.reverse();
        System.out.println("StringBuffer после reverse: " + stringBuffer); // Вывод: avaJ аинавориммаргорП
        System.out.println("StringBuilder после reverse: " + stringBuilder); // Вывод: avaJ аинавориммаргорП

        // 5. length() - возвращает длину текущей строки.
        System.out.println("Длина StringBuffer: " + stringBuffer.length()); // Вывод: 21
        System.out.println("Длина StringBuilder: " + stringBuilder.length()); // Вывод: 21

        // 6. capacity() - возвращает ёмкость буфера.
        System.out.println("Емкость StringBuffer: " + stringBuffer.capacity()); // Вывод: 66
        System.out.println("Емкость StringBuilder: " + stringBuilder.capacity()); // Вывод: 66

        // 7. setCharAt(int index, char ch) - заменяет символ по указанному индексу.
        stringBuffer.setCharAt(0, 'п'); // заменяем 'П' на 'п'
        stringBuilder.setCharAt(0, 'п'); // заменяем 'П' на 'п'
        System.out.println("StringBuffer после setCharAt: " + stringBuffer); // Вывод: пvaJ аинавориммаргорП
        System.out.println("StringBuilder после setCharAt: " + stringBuilder); // Вывод: пvaJ аинавориммаргорП

        // 8. substring(int start, int end) - возвращает подстроку.
        String subBuffer = stringBuffer.substring(0, 10);
        String subBuilder = stringBuilder.substring(0, 10);
        System.out.println("Подстрока из StringBuffer: " + subBuffer); // Вывод: пvaJ аинав
        System.out.println("Подстрока из StringBuilder: " + subBuilder); // Вывод: пvaJ аинав

        // 9. indexOf(String str) - возвращает индекс первого вхождения подстроки.
        System.out.println("Индекс 'пvaJ' в StringBuffer: " + stringBuffer.indexOf("пvaJ")); // Вывод: 0
        System.out.println("Индекс 'пvaJ' в StringBuilder: " + stringBuilder.indexOf("пvaJ")); // Вывод: 0

        // 10. replace(int start, int end, String str) - заменяет часть строки на новую строку.
        stringBuffer.replace(0, 10, "Язык программирования");
        stringBuilder.replace(0, 10, "Язык программирования");
        System.out.println("StringBuffer после replace: " + stringBuffer); // Вывод: Язык программированияориммаргорП
        System.out.println("StringBuilder после replace: " + stringBuilder); // Вывод: Язык программированияориммаргорП
    }
}