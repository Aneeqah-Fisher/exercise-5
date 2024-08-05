import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> distinctNumbers = new ArrayList<>();

        System.out.println("Enter ten numbers:");

        // Read ten numbers and keep only distinct ones
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            if (!distinctNumbers.contains(number)) {
                distinctNumbers.add(number);
            }
        }

        // Display the results
        System.out.println("Number of distinct numbers: " + distinctNumbers.size());
        System.out.print("Distinct numbers: " + distinctNumbers.toString().replaceAll("[\\[\\],]", ""));

        input.close();
    }
}