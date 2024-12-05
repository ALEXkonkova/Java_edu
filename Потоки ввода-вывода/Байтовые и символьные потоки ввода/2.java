/**
 * Практика #2
 *
 * Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).
 *
 * @author Aleksandra
 *
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;

        try {
            // Создаем экземпляр FileOutputStream, указывая путь к файлу
            fileOutputStream = new FileOutputStream("output.txt");

            String data = "Привет, мир!"; // Данные для записи

            // Перебираем каждый символ строки и записываем его в файл
            for (char character : data.toCharArray()) {
                // Преобразуем символ в байт и записываем в файл
                fileOutputStream.write(character);
            }

            fileOutputStream.write('\n');

        } catch (IOException e) {
            // Обрабатываем возможные исключения, возникающие во время записи в файл
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        } finally {
            // Закрываем FileOutputStream в блоке finally
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }
}