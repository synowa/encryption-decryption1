import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String sub = scanner.nextLine();
        int substringFrequency = 0;

        for (int i = 0; i < str.length() - sub.length() + 1; i++) {
            for (int j = 0; j < sub.length(); j++) {
                if (sub.charAt(j) != str.charAt(i + j)) {
                    break;
                } else if (j == sub.length() - 1) {
                    substringFrequency++;
                }
            }
        }
        System.out.println(substringFrequency);
    }
}