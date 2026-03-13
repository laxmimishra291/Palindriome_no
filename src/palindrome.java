import java.util.Scanner;

public class palindrome {

    // Recursive function
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters are not equal
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App (Recursion)");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        if (isPalindrome(input, 0, input.length() - 1))
            System.out.println("The string is a PALINDROME");
        else
            System.out.println("The string is NOT a PALINDROME");

        sc.close();
    }
}