public class typeCasting {

    public static void main(String[] args) {

        // 1. Widening Casting
        // byte -> short -> int -> long -> float -> double

        int a = 100;
        double b = a;

        System.out.println("=== Widening Casting ===");
        System.out.println("int value    : " + a);
        System.out.println("double value : " + b);


        // 2. Narrowing Casting
        // double -> float -> long -> int -> short -> byte

        double x = 100.99;
        int y = (int) x;

        System.out.println("\n=== Narrowing Casting ===");
        System.out.println("double value : " + x);
        System.out.println("int value    : " + y);


        // 3. int to byte

        int number = 130;
        byte smallNumber = (byte) number;

        System.out.println("\n=== int to byte ===");
        System.out.println("int value  : " + number);
        System.out.println("byte value : " + smallNumber);


        // 4. char to int

        char ch = 'A';
        int ascii = ch;

        System.out.println("\n=== char to int ===");
        System.out.println("char value : " + ch);
        System.out.println("int value  : " + ascii);


        // 5. int to char

        int value = 66;
        char character = (char) value;

        System.out.println("\n=== int to char ===");
        System.out.println("int value  : " + value);
        System.out.println("char value : " + character);


        // 6. String to int

        String str = "100";
        int convertedInt = Integer.parseInt(str);

        System.out.println("\n=== String to int ===");
        System.out.println("String value : " + str);
        System.out.println("int value    : " + convertedInt);


        // 7. int to String

        int age = 25;
        String convertedString = String.valueOf(age);

        System.out.println("\n=== int to String ===");
        System.out.println("int value    : " + age);
        System.out.println("String value : " + convertedString);
    }
}