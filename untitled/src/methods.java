public class methods {

    // 1. Method without parameters and without return value
    static void greet() {
        System.out.println("Hello, Welcome to Java Methods!");
    }

    // 2. Method with parameters and without return value
    static void displayName(String name) {
        System.out.println("Name: " + name);
    }

    // 3. Method with parameters and return value
    static int add(int a, int b) {
        return a + b;
    }

    // 4. Method with return value
    static int square(int number) {
        return number * number;
    }

    // 5. Method to check even or odd
    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Calling method without parameters
        greet();

        // Calling method with parameter
        displayName("John");

        // Calling method with parameters and return value
        int sum = add(10, 20);
        System.out.println("Sum = " + sum);

        // Calling square method
        int result = square(5);
        System.out.println("Square = " + result);

        // Calling even/odd method
        checkEvenOdd(15);
    }
}