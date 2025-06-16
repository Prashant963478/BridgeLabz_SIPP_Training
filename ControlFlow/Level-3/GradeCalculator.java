import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Physics: ");
        int p = sc.nextInt();
        System.out.print("Chemistry: ");
        int c = sc.nextInt();
        System.out.print("Maths: ");
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;
        System.out.println("Average: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+ | Excellent");
        } else if (avg >= 75) {
            System.out.println("Grade: A | Very Good");
        } else if (avg >= 60) {
            System.out.println("Grade: B | Good");
        } else if (avg >= 45) {
            System.out.println("Grade: C | Average");
        } else {
            System.out.println("Grade: F | Fail");
        }
    }
}
