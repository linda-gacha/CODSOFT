// GradeCalculator.java

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Array to store marks of each subject
        int[] marks = new int[numSubjects];
        
        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter marks obtained in Subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
        }
        
        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        // Assign grades based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
