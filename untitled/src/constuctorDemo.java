public class constuctorDemo {

    String name;
    int age;

    // Constructor
    constuctorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating an object
        constuctorDemo obj = new constuctorDemo("John", 25);

        // Calling method
        obj.display();
    }
}