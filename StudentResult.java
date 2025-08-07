package study;
import java.util.*;

public class StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter number of subjects: ");
        int subjectCount = input.nextInt();

       
        double total = 0;

        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100 marks): ");
            double marks = input.nextDouble();
            total += marks;
        }

       
        double average = total / subjectCount;


        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

   
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + String.format("%.2f", average) + "%");
        System.out.println("Grade: " + grade);
    }
}
