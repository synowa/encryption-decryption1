import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/aleksandrapawlak/IdeaProjects/Encryption-Decryption1/dataset_91065.txt");
        Scanner scanner = new Scanner(file);
        int howManyEvenNumbers = 0;
        int num;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                howManyEvenNumbers += 1;
            }
        }
        System.out.println(howManyEvenNumbers);
    }
}