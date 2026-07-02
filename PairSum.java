import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Input target sum
        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;
        int firstIndex = -1;
        int secondIndex = -1;

        // Brute force search
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }

        // Display result
        if (found) {
            System.out.println(" Pair Sum Result");
            System.out.println("A matching pair was found!");
            System.out.println("Index 1: " + firstIndex + " | Value: " + arr[firstIndex]);
            System.out.println("Index 2: " + secondIndex + " | Value: " + arr[secondIndex]);
            System.out.println("Equation: " + arr[firstIndex] + " + " + arr[secondIndex] + " = " + target);
        } else {
            System.out.println("\n=== Pair Sum Result ===");
            System.out.println("No pair of numbers adds up to " + target);
        }

        input.close();
    }
}



