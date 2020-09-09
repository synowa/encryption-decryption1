import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String isPalindrome = "";

        if (input.length() > 1) {
            for (int i = 0; i < (input.length() / 2); i++) {
                int num = input.length() - i - 1;
                if (input.charAt(i) != input.charAt(num)) {
                    isPalindrome = "no";
                    break;
                } else {
                    isPalindrome = "yes";
                }
            }
        } else {
            isPalindrome = "yes";
        }
        System.out.println(isPalindrome);
    }
}