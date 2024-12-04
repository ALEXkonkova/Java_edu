/**
 * Практика #1
 * Приведите примеры класса, в котором перегружен метод с переменным числом параметров.
 *
 * @author Aleksandra
 *
 */

class MathUtils {

    // Метод, который принимает переменное количество целых аргументов
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Перегрузка метода для суммирования чисел с плавающей точкой
    public double sum(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    // Метод для сложения объектов String с переменным числом параметров
    public String concatenate(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Вызов метода с переменным числом целых аргументов
        System.out.println("Сумма: " + mathUtils.sum(1, 2, 3, 4, 5)); // Сумма: 15

        // Вызов метода с переменным числом чисел с плавающей точкой
        System.out.println("Сумма: " + mathUtils.sum(1.5, 2.5, 3.0)); // Сумма: 7.0

        // Пример использования метода с переменным числом параметров для строк
        String result = mathUtils.concatenate("Hello, ", "world", "!");
        System.out.println("Строка: " + result);
    }
}