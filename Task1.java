import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int num_subjects = scanner.nextInt();
        int totalMarks = 0;
        
        for (int i = 1; i <= num_subjects; i++) {
            System.out.print("Enter marks obtained in  Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

        
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks... Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / num_subjects;

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
            grade = 'E';
        }
        System.out.println("\nResults of Student:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

