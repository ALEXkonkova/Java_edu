/**
 * Практика #1
 * Какого типа может быть переменная в switch? Приведите примеры для всех возможных случаев.
 *
 * @author Aleksandra
 *
 */

public class Main {
    public static void main(String[] args) {
        // Пример для целочисленного типа int
        int i = 2;
        System.out.println("Пример с int:");
        switch (i) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Другой номер");
        }

        // Пример для целочисленного типа byte
        byte b = 1;
        System.out.println("\nПример с byte:");
        switch (b) {
            case 1:
                System.out.println("Это один.");
                break;
            case 2:
                System.out.println("Это два.");
                break;
            default:
                System.out.println("Это что-то другое.");
        }

        // Пример для целочисленного типа short
        short s = 2;
        System.out.println("\nПример с short:");
        switch (s) {
            case 1:
                System.out.println("Это один.");
                break;
            case 2:
                System.out.println("Это два.");
                break;
            case 3:
                System.out.println("Это три.");
                break;
            default:
                System.out.println("Это что-то другое.");
        }

        // Пример для целочисленного типа char
        char c = 'B';
        System.out.println("\nПример с char:");
        switch (c) {
            case 'A':
                System.out.println("Это буква A.");
                break;
            case 'B':
                System.out.println("Это буква B.");
                break;
            case 'C':
                System.out.println("Это буква C.");
                break;
            default:
                System.out.println("Это другая буква.");
        }

        // Пример со строкой (String)
        String day = "Понедельник";
        System.out.println("\nПример со строками (String):");
        switch (day) {
            case "Понедельник":
                System.out.println("Сегодня понедельник.");
                break;
            case "Вторник":
                System.out.println("Сегодня вторник.");
                break;
            case "Среда":
                System.out.println("Сегодня среда.");
                break;
            default:
                System.out.println("Это другой день.");
        }

        // Пример с перечислением (enum)
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("\nПример с перечислениями (enum):");
        switch (today) {
            case MONDAY:
                System.out.println("Сегодня понедельник.");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник.");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда.");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг.");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница.");
                break;
            case SATURDAY:
                System.out.println("Сегодня суббота.");
                break;
            case SUNDAY:
                System.out.println("Сегодня воскресенье.");
                break;
        }


        // Типы-обертки для целых чисел (Byte, Short, Integer, Character):
        // Пример для `Byte`
        Byte byteValue = 2;
        System.out.println("\nПример с Byte:");
        switch (byteValue) {
            case 1:
                System.out.println("Это один (Byte).");
                break;
            case 2:
                System.out.println("Это два (Byte).");
                break;
            default:
                System.out.println("Это что-то другое (Byte).");
        }

        // Пример для `Short`
        Short shortValue = 3;
        System.out.println("\nПример с Short:");
        switch (shortValue) {
            case 1:
                System.out.println("Это один (Short).");
                break;
            case 2:
                System.out.println("Это два (Short).");
                break;
            case 3:
                System.out.println("Это три (Short).");
                break;
            default:
                System.out.println("Это что-то другое (Short).");
        }

        // Пример для `Integer`
        Integer integerValue = 4;
        System.out.println("\nПример с Integer:");
        switch (integerValue) {
            case 1:
                System.out.println("Это один (Integer).");
                break;
            case 2:
                System.out.println("Это два (Integer).");
                break;
            case 3:
                System.out.println("Это три (Integer).");
                break;
            case 4:
                System.out.println("Это четыре (Integer).");
                break;
            default:
                System.out.println("Это что-то другое (Integer).");
        }

        // Пример для `Character`
        Character charValue = 'A';
        System.out.println("\nПример с Character:");
        switch (charValue) {
            case 'A':
                System.out.println("Это A (Character).");
                break;
            case 'B':
                System.out.println("Это B (Character).");
                break;
            default:
                System.out.println("Это что-то другое (Character).");
        }
    }
    // Перечисление для примера
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}