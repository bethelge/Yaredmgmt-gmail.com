//question 5
import java.util.Scanner;

public class MergeSort {
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
        int[] array={3,5,1,4,12,6,8};
        System.out.println("Before sorting");
        for(int n:array){
            System.out.print(n +" ");
        }


            }
        }

