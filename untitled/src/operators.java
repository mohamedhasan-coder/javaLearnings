public class operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        // 2. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");

        int x = 10;

        x += 5;
        System.out.println("x += 5 : " + x);

        x -= 3;
        System.out.println("x -= 3 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        x /= 4;
        System.out.println("x /= 4 : " + x);

        x %= 3;
        System.out.println("x %= 3 : " + x);


        // 3. Relational Operators
        System.out.println("\n=== Relational Operators ===");

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));


        // 4. Logical Operators
        System.out.println("\n=== Logical Operators ===");

        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));


        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");

        int n = 10;

        System.out.println("n = " + n);
        System.out.println("++n = " + (++n));
        System.out.println("n++ = " + (n++));
        System.out.println("After n++ = " + n);
        System.out.println("--n = " + (--n));
        System.out.println("n-- = " + (n--));
        System.out.println("After n-- = " + n);


        // 6. Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");

        int c = 5;
        int d = 3;

        System.out.println("c & d = " + (c & d));
        System.out.println("c | d = " + (c | d));
        System.out.println("c ^ d = " + (c ^ d));
        System.out.println("~c    = " + (~c));


        // 7. Shift Operators
        System.out.println("\n=== Shift Operators ===");

        int value = 8;

        System.out.println("value << 1 = " + (value << 1));
        System.out.println("value >> 1 = " + (value >> 1));
        System.out.println("value >>> 1 = " + (value >>> 1));


        // 8. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");

        int age = 20;

        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println("Result: " + result);
    }
}
