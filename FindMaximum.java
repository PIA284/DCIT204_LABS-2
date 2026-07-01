import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Error: Array size must be greater than 0.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Please enter the elements one by one:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        int maxVal = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("\n--- Search Results ---");
        System.out.println("Maximum Value : " + maxVal);
        System.out.println("Found at Index: " + maxIndex);
        System.out.println("----------------------");

        scanner.close();
    }
}