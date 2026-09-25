
// day 4 - 3
// OOPs, Demo - Abstraction

// Abstract class
abstract class Employee1 {

    // Abstract method
    abstract void work();

    // Normal method
    void login() {
        System.out.println("Employee logged in.");
    }
}

// Child class
class Developer extends Employee1 {

    // Implementing abstract method
    @Override
    void work() {
        System.out.println("Developer is writing code.");
    }
}

// Main class
public class Abstraction {

    public static void main(String[] args) {

        // Creating object of child class
        Developer developer = new Developer();

        // Calling methods
        developer.login();
        developer.work();
    }
}

