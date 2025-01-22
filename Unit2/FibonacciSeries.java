import java.util.Scanner;

public class FibonacciSeries {
    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }
        return calculate(n - 1) + calculate(n - 2);
    }

    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position of the Fibonacci number you want: ");
        int n = scanner.nextInt();

        int result = fib.calculate(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);

        scanner.close();
    }
}
