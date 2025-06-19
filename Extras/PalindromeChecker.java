import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("The string is " + (isPalindrome(input) ? "" : "not ") + "a palindrome.");
    }

    static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
