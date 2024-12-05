/**
 * Практика #1
 * Приведите пример кода с генерацией двух исключений, одно из которых будет "перхвачено", а другое приведет к аварийной остановке.
 *
 * @author Aleksandra
 *
 */

public class Main {
    public static void main(String[] args) {
        // Первая попытка - перехватываемое исключение
        try {
            System.out.println("Попытка деления на ноль:");
            int result = 10 / 0; // Это вызовет ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: Нельзя делить на ноль.");
        }

        // Вторая попытка - необработанное исключение
        System.out.println("Попытка доступа к массиву с неверным индексом:");
        int[] numbers = {1, 2, 3};
        int invalidAccess = numbers[5]; // Это вызовет ArrayIndexOutOfBoundsException
        System.out.println("Недостижимо: " + invalidAccess); // Эта строка никогда не выполнится
    }
}

/**
 * Объяснение:
 * Первый блок try-catch:
 * Мы пытаемся выполнить деление на ноль, что приводит к исключению ArithmeticException.
 * Исключение перехватывается в блоке catch, после чего выводится сообщение, что деление на ноль недопустимо.
 *
 * Второй блок после первой попытки:
 * Программа продолжает выполнение и пытается обратиться к элементу массива, используя индекс, который за пределами допустимых значений.
 * Поскольку это исключение (ArrayIndexOutOfBoundsException) не обработано, программа аварийно завершает работу.
 *
 * Результат выполнения:
 * Если запустить данный код, мы увидим, что сообщение о делении на ноль будет выведено, но программа завершится с ошибкой, когда будет осуществлен доступ к неверному индексу массива.
 */