package edu;

import edu.MergeSortSimple;
import edu.QuickSortSimple;
import edu.Utils;
import java.util.Scanner;

public class AlgorithmController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an algorithm to run:");
        System.out.println("1. MergeSort");
        System.out.println("2. QuickSort");
        int choice = scanner.nextInt();
        int[] array = Utils.randomArray(1000, 1); // Example array

        switch (choice) {
            case 1:
                System.out.println("Running MergeSort...");
                MergeSortSimple.sort(array);
                break;
            case 2:
                System.out.println("Running QuickSort...");
                QuickSortSimple.sort(array, 2L);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
