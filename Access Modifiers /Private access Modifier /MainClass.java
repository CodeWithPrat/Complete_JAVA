import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of the Student class
        Student student = new Student();

        // Getting student details from the user
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        student.setId(id);

        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume the newline character
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        student.setAge(age);

        // Displaying student details using the member function
        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}
