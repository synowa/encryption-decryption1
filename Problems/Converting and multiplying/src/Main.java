import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String num = scanner.next();
            if ("0".equals(num)) {
                break;
            } else {
                try {
                    System.out.println(Integer.parseInt(num) * 10);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid user input: " + num);
                }
            }
        }
    }
}
