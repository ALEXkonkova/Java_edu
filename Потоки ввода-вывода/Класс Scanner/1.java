/**
 * Практика #1
 *
 * Приведите пример кода для чтение данных из текстового файла с помощью Scanner.
 *
 * @author Aleksandra
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Путь к файлу
        File file = new File("example_str.txt");

        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(file)) {
            // Читаем строки из файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Обрабатываем прочитанную строку (выводим на экран)
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}