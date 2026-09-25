// Day 5 - 3

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("===== Java Exception Handling Demo =====");

        // 1. ArithmeticException
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }


        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {10, 20, 30};

            System.out.println("Element: " + numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }


        // 3. NumberFormatException
        try {
            String value = "abc";

            int number = Integer.parseInt(value);

            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
        }


        // 4. NullPointerException
        try {
            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Object is null.");
        }


        // 5. Multiple catch blocks
        try {
            int[] numbers = {10, 20, 30};

            int result = numbers[5] / 0;

            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid.");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");

        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }


        // 6. finally block
        try {
            int x = 10;
            int y = 2;

            System.out.println("Division: " + (x / y));

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");

        } finally {
            System.out.println("Finally block always executes.");
        }


        // 7. throw keyword
        try {
            checkAge(15);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }


        // 8. Custom exception
        try {
            withdrawMoney(5000, 3000);

        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }


        System.out.println("\nProgram completed successfully.");
    }


    // Method using throw
    public static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException(
                    "Age must be 18 or above."
            );
        }

        System.out.println("Eligible to vote.");
    }


    // Method using custom exception
    public static void withdrawMoney(
            double balance,
            double amount
    ) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: " + balance
            );
        }

        System.out.println("Withdrawal successful.");
    }
}


// Custom Exception class
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
