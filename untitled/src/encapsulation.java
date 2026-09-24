// Day 4 - 1

public class encapsulation {
    // Encapsulation
    private int id;
    public String department;

    // Constructor
    public encapsulation(int id, String department) {
        this.id = id;
        this.department = department;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Main method
    public static void main(String[] args) {

        // Creating an object
        encapsulation obj = new encapsulation(101, "Computer Science");

        // Getting values using getters
        System.out.println("ID: " + obj.getId());
        System.out.println("Department: " + obj.getDepartment());

        // Changing values using setters
        obj.setId(102);
        obj.setDepartment("Information Technology");

        // Display updated values
        System.out.println("\nAfter updating:");
        System.out.println("ID: " + obj.getId());
        System.out.println("Department: " + obj.getDepartment());
    }
}
