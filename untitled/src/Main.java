import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name = sc.nextLine();
        System.out.println("Your name is :" + name);

        sc.close();
    }
}