import java.util.Scanner;

public class PalindromeCheck {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck checker = new PalindromeCheck();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        boolean result = checker.isPalindrome(input);
        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}
