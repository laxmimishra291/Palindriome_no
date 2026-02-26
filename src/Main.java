import java.util.Scanner;

class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to char array
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print true/false
        System.out.println(isPalindrome);

        sc.close();
    }
}