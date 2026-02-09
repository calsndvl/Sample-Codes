import java.util.Scanner;

public class ArrayDemo {
    public static void main(String cals[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        int[] numbers = new int[size];

        for (int a = 0; a < size; a++) {
            System.out.print("Enter element " + (a + 1) + ": ");
            numbers[a] = s.nextInt();
        }

        System.out.println("\nArray elements are:");
        for (int a = 0; a < size; a++) {
            System.out.println("Element " + (a + 1) + ": " + numbers[a]);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
