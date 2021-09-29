package Sorting;

/*
 * Merge Sort in Decreasing Order
 * Description
 * Write a code that sorts an array in decreasing order using Merge Sort algorithm.
 *
 * Note that the array in the question which needs to be sorted is named as "randomNumbers". You need to sort the numbers inside the "randomNumbers" array and store the sorted array inside the "sortedNumbers" array.
 *
 * Input:
 *          1. The first input is 'n', that is, the number of elements in the array.
 *          2. In the next line, n elements of the array space-separated.
 *
 * Output:
 * The array sorted in decreasing order.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Alg4_MergeSortReverse {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        //Complete this function

    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}