import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student information
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter enrollment number: ");
        int enrollmentNumber = scanner.nextInt();

        // Collect marks for 5 subjects
        System.out.println("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.println("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.println("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.println("Enter marks for Subject 4: ");
        int subject4 = scanner.nextInt();

        System.out.println("Enter marks for Subject 5: ");
        int subject5 = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (double) totalMarks / 5;

        // Assign grades based on percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Check if the student has passed or failed
        String result = (percentage >= 40) ? "Pass" : "Fail";

        // Display the result
        System.out.println("\n===== Student Result =====\n");
        System.out.println("Name: " + name);
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Subject 4: " + subject4);
        System.out.println("Subject 5: " + subject5);
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}
