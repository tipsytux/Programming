package Sorting;

public class Alg2_SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            // Swap the found minimum element with the first element of the unsorted array
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void print(int[] arr) {
        int n = arr.length;
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {56, 75, 11, 7, 99};
        sort(arr);
        print(arr);
    }
}