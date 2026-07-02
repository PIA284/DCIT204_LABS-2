import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of value: ");
        int values = scan.nextInt();
        int[] list = new int[values];

        for(int i = 0; i < values; i++){
            System.out.println("Enter your values: ");
            list[i] = scan.nextInt();
        }
        
        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < values; i++) {
            if (list[i] > max) {
                max = list[i];
                maxIndex = i;
            }
        }
        System.out.println("The max value is " + max + " and the index is " + maxIndex);
    }
}