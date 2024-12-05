/**
 * Практика #1
 * Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.
 *
 * @author Aleksandra
 *
 */

class OuterClass {
    // Внешний класс
    private String outerField = "Внешний класс";

    // Приватный внутренний класс
    private class PrivateInner {
        void display() {
            // Доступ к полю внешнего класса
            System.out.println("Доступ из PrivateInner: " + outerField);
        }
    }

    // Публичный внутренний класс
    public class PublicInner {
        void display() {
            // Доступ к полю внешнего класса
            System.out.println("Доступ из PublicInner: " + outerField);
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
        void display() {
            // Доступ к полю внешнего класса
            System.out.println("Доступ из ProtectedInner: " + outerField);
        }
    }

    // Метод внешнего класса для создания экземпляров внутренних классов
    public void createInnerInstances() {
        // Создание экземпляра приватного внутреннего класса и вызов метода
        PrivateInner privateInner = new PrivateInner();
        privateInner.display();

        // Создание экземпляра публичного внутреннего класса и вызов метода
        PublicInner publicInner = new PublicInner();
        publicInner.display();

        // Создание экземпляра защищенного внутреннего класса и вызов метода
        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.display();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра внешнего класса
        OuterClass outer = new OuterClass();
        // Вызов метода для создания экземпляров внутренних классов
        outer.createInnerInstances();
    }
}

/**
 * Объяснение работы различных спецификаторов доступа:
 *
 * Приватный внутренний класс (private):
 * Класс PrivateInner может быть доступен только изнутри класса OuterClass.
 * Внутри метода createInnerInstances мы создаем экземпляр PrivateInner и вызываем его метод display(), что возможно, поскольку этот метод находится в пределах OuterClass.
 *
 * Публичный внутренний класс (public):
 * Класс PublicInner доступен извне, то есть его можно создать и использовать в любых других классах, находящихся в том же или другом пакете, при наличии ссылки на экземпляр OuterClass.
 * Мы можем вызов publicInner.display() для отображения значения поля outerField.
 *
 * Защищенный внутренний класс (protected):
 * Класс ProtectedInner доступен в пределах пакета, а также для всех подклассов (наследников) OuterClass, независимо от их расположения в пакетах.
 * Метод createInnerInstances может создать экземпляр ProtectedInner и использовать его.
 *
 */