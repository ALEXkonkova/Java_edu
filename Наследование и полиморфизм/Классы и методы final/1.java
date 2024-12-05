/**
 * Практика #1
 * Приведите пример кода, демонстрирующего невозможность переопределять в подклассе final-метод суперкласса.
 *
 * @author Aleksandra
 *
 */

// Суперкласс
class SuperClass {
    // Объявляем метод как final
    public final void display() {
        System.out.println("Метод суперкласса");
    }
}

// Подкласс
class SubClass extends SuperClass {
    // Пытаемся переопределить final-метод
    // Это вызовет ошибку компиляции

    public void display() {
        System.out.println("Метод подкласса");
    }

}

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.display(); // Вызов метода из суперкласса

        SubClass subClass = new SubClass();
        subClass.display(); // Вызывает метод суперкласса, а не переопределённый. Это вызовет ошибку компиляции
    }
}

/**
 * Пояснение:
 * Суперкласс SuperClass:
 * В этом классе определяется метод display(), который объявлен как final. Это означает, что он не может быть переопределён в любом подклассе.
 *
 * Подкласс SubClass:
 * Здесь мы создаем класс SubClass, который расширяет SuperClass.
 * Если попытаться переопределить метод display(), это вызовет ошибку компиляции с сообщением о том, что нельзя переопределить final-метод.
 *
 * Класс Main:
 * Здесь создаются экземпляры SuperClass и SubClass, и вызывается метод display().
 * В случае SubClass будет вызван display() из SuperClass, так как метод в подклассе был бы недоступен для переопределения.
 */