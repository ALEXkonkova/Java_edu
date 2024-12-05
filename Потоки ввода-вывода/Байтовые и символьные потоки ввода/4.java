/**
 * Практика #4
 *
 * Зачем нужен интерфейс AutoCloseable? Приведите пример.
 *
 * @author Aleksandra
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

/**
 * Зачем нужен интерфейс AutoCloseable?
 * Упрощение управления ресурсами: Вместо того чтобы вручную закрывать ресурсы, интерфейс позволяет использовать конструкцию try-with-resources, которая автоматически закрывает ресурс в конце блока try.
 * Обработка исключений: Если внутри блока try происходит исключение, ресурс всё равно будет закрыт, что обеспечивает большую стабильность кода.
 * Чистота кода: Автоматическое закрытие ресурсов делает код более чистым и читабельным.
 */