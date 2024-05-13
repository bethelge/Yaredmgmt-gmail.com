import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfTheArray = scanner.nextInt();

        int[] numbers = new int[sizeOfTheArray];
        System.out.println("Enter the numbers in the array:");
        for (int i = 0; i < sizeOfTheArray; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int numberToBefound = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < sizeOfTheArray; i++) {
            if (numbers[i] == numberToBefound) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + numberToBefound + "is" + count + " times in the array.");
        } else {
            System.out.println("The number " + numberToBefound + " is not found in the array");
        }
    }
}
