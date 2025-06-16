import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

                if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
                       int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

                       int sumFormula = n * (n + 1) / 2;

            
            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println(" Both results match. The computation is correct.");
            } else {
                System.out.println(" The results do not match. Something went wrong.");
            }
        }

        scanner.close();
    }
}
