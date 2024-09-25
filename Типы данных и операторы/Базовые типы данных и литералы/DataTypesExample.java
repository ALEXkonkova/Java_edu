public class DataTypes {

    public static void main(String[] args) {

        byte byteValue = 0;
        byte anotherByteValue = 127;
        System.out.println("Byte:");
        System.out.println("Default value: " + byteValue);
        System.out.println("Example value: " + anotherByteValue);

        short shortValue = 0;
        short anotherShortValue = 32767;
        System.out.println("\nShort:");
        System.out.println("Default value: " + shortValue);
        System.out.println("Example value: " + anotherShortValue);

        int intValue = 0;
        int anotherIntValue = 2147483647;
        System.out.println("\nInt:");
        System.out.println("Default value: " + intValue);
        System.out.println("Example value: " + anotherIntValue);

        long longValue = 0L;
        long anotherLongValue = 9223372036854775807L;
        System.out.println("\nLong:");
        System.out.println("Default value: " + longValue);
        System.out.println("Example value: " + anotherLongValue);

        float floatValue = 0.0f;
        float anotherFloatValue = 3.4028235e+38f;
        System.out.println("\nFloat:");
        System.out.println("Default value: " + floatValue);
        System.out.println("Example value: " + anotherFloatValue);

        double doubleValue = 0.0;
        double anotherDoubleValue = 1.7976931348623157e+308;
        System.out.println("\nDouble:");
        System.out.println("Default value: " + doubleValue);
        System.out.println("Example value: " + anotherDoubleValue);

        char anotherCharValue = '#';
        System.out.println("\nChar:");
        System.out.println("Example value: " + anotherCharValue);


        int a = 1, b = 2;
        boolean boolValue = a != b;
        System.out.println("\nBool:");
        System.out.println("Example value: " + boolValue);

    }
}
