package Sorting;

import java.util.Arrays;

public class Alg1_BubbleSort {

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    swap(j - 1, j, numbers);
                }
            }
            System.out.println("Iteration : " + i);
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return numbers; // returning the final sorted array
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] randomNumbers = {12, 8, 9, 10, 15, 4, 3, 6, 7};
        int[] sortedNumbers;

        sortedNumbers = sort(randomNumbers); // bubble sort

        // print out the sorted numbers
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
