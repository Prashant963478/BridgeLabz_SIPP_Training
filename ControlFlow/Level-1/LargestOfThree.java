import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;

        
        if (number1 > number2 && number1 > number3) {
            isFirstLargest = true;
        } else if (number2 > number1 && number2 > number3) {
            isSecondLargest = true;
        } else if (number3 > number1 && number3 > number2) {
            isThirdLargest = true;
        }

        
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        
    }
}
