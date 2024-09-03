//11]calculate grades of the students base on their marks

import java.util.Scanner;
public class calculate_grade 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = scanner.nextInt();
            char grade = calculateGrade(marks);
            
            System.out.println("Grade for student " + i + ": " + grade);
        }
        
    }

    // Method to calculate the grade based on marks
    public static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else if (marks >= 0 && marks < 60) {
            return 'F';
        } else {
            // Return 'X' if marks are not in a valid range
            System.out.println("Invalid marks entered.");
            return 'X';
        }
    }
}