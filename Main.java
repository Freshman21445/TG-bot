
import java.util.Scanner;

public class Main {

    // PUT YOUR TELEGRAM TOKEN HERE
    static final String BOT_TOKEN = "YOUR_BOT_TOKEN_HERE";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = input.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nCourse " + i);

            System.out.print("Enter credit hours: ");
            int credit = input.nextInt();

            System.out.print("Enter grade point: ");
            double grade = input.nextDouble();

            totalPoints += credit * grade;
            totalCredits += credit;
        }

        if (totalCredits == 0) {
            System.out.println("Invalid total credits!");
        } else {
            double gpa = totalPoints / totalCredits;
            System.out.printf("\nYour GPA is: %.2f%n", gpa);
        }

        input.close();
    }
}
