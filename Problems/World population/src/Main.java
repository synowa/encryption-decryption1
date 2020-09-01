/*
Here's a file that stores data on the world population since 1950, according to the United States Census Bureau (2017).

Download the file and write a Java program to find out in what year the largest increase in population occurred as compared to the previous year.

The file has two columns: year and population. Take a look at it to understand the format better.

Enter the resulting year.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        File file = new File("/Users/aleksandrapawlak/IdeaProjects/Encryption-Decryption1/dataset_91069.txt");
        long population = 0;
        long previousYearPopulation = 0;
        int year = 0;
        int yearOfMaximumDifference = 0;
        long difference = 0;
        long maxDifference = 0;

        try (Scanner scanner = new Scanner(file)) {
            scanner.next();
            scanner.next();
            yearOfMaximumDifference = scanner.nextInt();
            previousYearPopulation = scanner.nextLong();
            while (scanner.hasNext()) {
                year = scanner.nextInt();
                population = scanner.nextLong();

                if (population > previousYearPopulation) {
                    difference = population - previousYearPopulation;
                }
                previousYearPopulation = population;

                if (difference > maxDifference) {
                    maxDifference = difference;
                    yearOfMaximumDifference = year;
                }
            }
            System.out.println(maxDifference + " " + yearOfMaximumDifference);
        } catch (
                FileNotFoundException e) {
            System.out.println("No file found: " + "/Users/aleksandrapawlak/IdeaProjects/Encryption-Decryption1/dataset_91069.txt");
        }
    }
}