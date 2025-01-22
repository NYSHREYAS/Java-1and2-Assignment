import java.util.Scanner;

public class SumOfDigits {
    public int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + calculateSum(n / 10);
    }

    public static void main(String[] args) {
        SumOfDigits sum = new SumOfDigits();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int result = sum.calculateSum(n);
        System.out.println("The sum of digits is: " + result);

        scanner.close();
    }
}
