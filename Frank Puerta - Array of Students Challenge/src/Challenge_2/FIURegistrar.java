package Challenge_2;
import java.util.Scanner;

public class FIURegistrar {
    public static void main(String[] args) {
        Student[] students = createArrayOfStudents();
        processArrayOfStudents(students);
    }

    // Method to create an array of Students
    public static Student[] createArrayOfStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = scanner.next();

            System.out.print("Last Name: ");
            String lastName = scanner.next();

            System.out.print("Panther ID: ");
            String pantherID = scanner.next();

            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();


            students[i] = new Student(firstName, lastName, pantherID, gpa);

        }

        return students;
    }

    // Method to process the array of Students
    public static void processArrayOfStudents(Student[] students) {

        double highestGPA = students[0].getGpa();
        double lowestGPA = students[0].getGpa();
        double totalGPA = 0;
        Student highestStudent = students[0];
        Student lowestStudent = students[0];


        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];

            // This will print each students information
            System.out.println(currentStudent);

            // Add GPA to total in order to calculate GPA
            totalGPA += currentStudent.getGpa();

            // Used to try to find the highest GPA
            if (currentStudent.getGpa() > highestGPA) {
                highestGPA = currentStudent.getGpa();
                highestStudent = currentStudent;
            }

            // Used to find the lowest GPA
            if (currentStudent.getGpa() < lowestGPA) {
                lowestGPA = currentStudent.getGpa();
                lowestStudent = currentStudent;
            }
        }

        double averageGPA = totalGPA / students.length;

        // Print the results
        System.out.println("Highest GPA: " + highestStudent.getGpa() + " (" + highestStudent.getFirstName() + " " + highestStudent.getLastName() + ")");
        System.out.println("Lowest GPA: " + lowestStudent.getGpa() + " (" + lowestStudent.getFirstName() + " " + lowestStudent.getLastName() + ")");
        System.out.println("Average GPA: " + averageGPA);

        // Separate loop for students above average GPA
        System.out.println("Students that have an above average GPA: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa() > averageGPA) {
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " - GPA: " + students[i].getGpa());
            }
        }
    }
}
