/**
 * Практика #1
 * Приведите примеры использования метода decode().
 *
 * @author Aleksandra
 */
public class Main {
    public static void main(String[] args) {
        Integer decimal = Integer.decode("15");   // Десятичное число 15
        Integer hex = Integer.decode("0x0F");     // Шестнадцатеричное число 15
        Integer octal = Integer.decode("017");     // Восьмеричное число 15

        System.out.println("Decimal: " + decimal);
        System.out.println("Hex: " + hex);
        System.out.println("Octal: " + octal);
    }
}