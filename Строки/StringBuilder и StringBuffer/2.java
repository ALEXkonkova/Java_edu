/**
 * Практика #2
 * Покажите с помощью каких методов объекты классов String, StringBuffer и StringBuilder могут быть преобразованы друг в друга.
 *
 * @author Aleksandra
 *
 */

public class Main {
    public static void main(String[] args) {
        //Преобразование String в StringBuffer и StringBuilder:
        String str = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        //Преобразование StringBuffer в String:
        StringBuffer sb = new StringBuffer("Hello, StringBuffer!");
        String strFromBuffer = sb.toString();

        //Преобразование StringBuilder в String:
        StringBuilder sbuilder = new StringBuilder("Hello, StringBuilder!");
        String strFromBuilder = sbuilder.toString();

        //Преобразование StringBuffer в StringBuilder:
        StringBuffer sbf1 = new StringBuffer("Hello!");
        StringBuilder sbd1 = new StringBuilder(sbf1.toString());

        //Преобразование StringBuilder в StringBuffer:
        StringBuilder sbd2 = new StringBuilder("Hello!");
        StringBuffer sbf2 = new StringBuffer(sbd2.toString());
    }
}