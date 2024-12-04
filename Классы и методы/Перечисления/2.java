/**
 * Практика #2
 * Приведите примеры реализации собственного перечисления c любым дополнительным методом.
 *
 * @author Aleksandra
 *
 */

enum DayOfWeek {
    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    // Поле для хранения информации о том, является ли день рабочим
    private final boolean isWorkingDay;

    // Конструктор для инициализации поля
    DayOfWeek(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    // Метод возвращает true, если день рабочий
    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    // Метод, который выводит информацию о дне
    public void printInfo() {
        if (isWorkingDay) {
            System.out.println(this.name() + " - рабочий день.");
        } else {
            System.out.println(this.name() + " - выходной день.");
        }
    }

    public static void main(String[] args) {
        // Пример использования перечисления
        for (DayOfWeek day : DayOfWeek.values()) {
            day.printInfo();
        }
    }
}