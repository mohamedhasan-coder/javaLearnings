// Day 4 - 2


// OOPs Demo - Inheritance

// Parent class
class Employee {

    int id;
    String name;
    String department;

    // Constructor
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method
    void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Child class
class Manager extends Employee {

    String team;

    // Constructor
    Manager(int id, String name, String department, String team) {

        // Calling parent class constructor
        super(id, name, department);

        this.team = team;
    }

    // Child class method
    void displayManager() {
        displayEmployee();
        System.out.println("Team: " + team);
    }
}

// Main class
public class Inheritance {

    public static void main(String[] args) {

        // Creating child class object
        Manager manager = new Manager(
                101,
                "John",
                "IT",
                "Development Team"
        );

        // Calling inherited and child methods
        manager.displayManager();
    }
}

