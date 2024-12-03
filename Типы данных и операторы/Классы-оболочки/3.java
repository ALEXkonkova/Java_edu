/**
 * Практика #3
 * В каком случае при автоупаковке/автораспаковке
 * будет брошено исключение NullPointerException. Приведите пример.
 *
 * @author Aleksandra
 */
public class Main {
    public static void main(String[] args) {
        // Объявляем переменную типа Integer и присваиваем ей значение null
        Integer null_integer = null;

        try {
            // Попытка присвоить значение null_integer примитиву int
            // Здесь происходит автораспаковка (unboxing) null_integer
            // Поскольку null_integer равно null, возникает NullPointerException
            int value = null_integer;
        } catch (NullPointerException e) {
            // Обработка исключения NullPointerException
            // Это означает, что происходит ошибка из-за попытки распаковки null
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}