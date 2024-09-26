public class Main {
    public static void main(String[] args) {
        int intVal = 5;
        double doubleVal = 2.5;
        float floVal = 3.5f;
        String text = "20";
        char c = 'A';

        double sumDouble = intVal + doubleVal; // При сложении int и double Java автоматически преобразует int в double
        float mulFloat = floVal * intVal;      // При умножении float и int оператор преобразует int в float
        String resString = intVal + text;
        int sumInt = c + intVal;               //При сложении char и int Java сначала преобразует char в его числовое представление ('A' = 65).

        System.out.println("Сумма (int + double): " + sumDouble); // Вывод: 7.5
        System.out.println("Произведение (float * int): " + mulFloat); // Вывод: 17.5
        System.out.println("Результат (int + String): " + resString); // Вывод: 520
        System.out.println("Сумма (char + int): " + sumInt); // Вывод: 70
    }
}