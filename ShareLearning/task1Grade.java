package ShareLearning;

import java.util.Scanner;

public class task1Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        char grade = (score >= 90) ? 'A' :
                     (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :
                     (score >= 60) ? 'D' : 'F';

        // Output the grade
        System.out.print("The student's grade is: " + grade);
    }

}
