import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        File file = new File("/Users/aleksandrapawlak/IdeaProjects/Encryption-Decryption1/dataset_91033.txt");
        int sum = 0;
        try (
                Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sum += Integer.parseInt(scanner.nextLine());

//                System.out.print(scanner.nextLine() + " ");
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("No file found: " + "/Users/aleksandrapawlak/IdeaProjects/Encryption-Decryption1/dataset_91033.txt");
        }
        System.out.println(sum);
    }
}