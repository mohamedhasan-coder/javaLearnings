import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        age = sc.nextInt();
        System.out.print("Enter Your Gpa: ");
        gpa = sc.nextDouble();
        System.out.print("Are You Enrolled a Course? (true / false) ");
        isEnrolled = sc.nextBoolean();
        System.out.println("Enter Your Marks: ");

        for(int i = 0; i<marks.length;i++){
            System.out.print("Enter Mark" + (i+1) + ":");
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total,marks.length);

        char grade;

        if(average >= 90){
            grade = 'A';
        }
        else if(average >= 80){
            grade = 'B';
        }
        else if(average >= 70){
            grade =  'C';
        }
        else if(average >= 60) {
            grade = 'D';
        }
        else if(average >= 50){
            grade = 'E';
        }
        else {
            grade = 'F';
        }

        System.out.println("==============Student Details================");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("gpa:" + gpa);
        System.out.println("Course Enrolled:" + isEnrolled);

        for(int i = 0;i<marks.length;i++){
            System.out.println("Marks:" + (i+1) + marks[i]);
        }

        System.out.println("Total Marks:" + total);
        System.out.println("Average Marks:" + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }

    static int calculateTotal(int[] marks){
        int total = 0;

        for(int mark: marks){
            total += mark;
        }

        return  total;
    }

    static double calculateAverage(int total,int count){
        return ((double) total/count);
    }
}