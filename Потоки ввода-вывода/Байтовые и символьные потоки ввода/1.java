/**
 * Практика #1
 *
 * Приведите пример использования одного из подклассов класса InputStream для демонстрации работы метода read().
 *
 * @author Aleksandra
 *
 */

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            // Создаем экземпляр FileInputStream, указывая путь к файлу
            fileInputStream = new FileInputStream("example.txt");

            int byteData;

            // Читаем байты из файла до конца
            while ((byteData = fileInputStream.read()) != -1) {
                // Преобразуем байт в символ и выводим на экран
                char character = (char) byteData;
                System.out.print(character);
            }

        } catch (IOException e) {
            // Обрабатываем возможные исключения, возникающие во время чтения файла
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        } finally {
            // Закрываем FileInputStream в блоке finally
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }
}