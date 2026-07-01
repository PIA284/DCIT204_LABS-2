import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Error: Array must contain at least two elements to find a pair.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Please enter the elements one by one:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\nEnter the Target Sum: ");
        int targetSum = scanner.nextInt();

        boolean pairFound = false;

        System.out.println("\n--- Search Results ---");

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    
                    // 5. Display results if found
                    System.out.println("Target Pair Found!");
                    System.out.println("Indices : " + i + " and " + j);
                    System.out.println("Values  : " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    
                    pairFound = true;
                    break;
                }
            }
            if (pairFound) {
                break;
            }
        }

        if (!pairFound) {
            System.out.println("No pair exists in the array that sums to " + targetSum + ".");
        }
        System.out.println("----------------------");

        scanner.close();
    }
}