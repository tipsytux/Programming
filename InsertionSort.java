import java.util.Scanner;

public class InsertionSort {
    /*
    This is insertion sort
     */
    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int v = arr[i];
            int j = i;

            while (j >= 1 && arr[j - 1] > v) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = v;
        }
    }

    /*
    This is insertion sort in reverse
     */
    public static void reverse(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int v = arr[i];
            int j = i;

            while (j >= 1 && arr[j - 1] < v) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = v;
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        reverse(array);
        for (int number : array) {
            System.out.println(number);
        }

    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 0, 9, 5, 13};
        reverse(arr);
        System.out.println("Sorted array");
        for (int number : arr) {
            System.out.println(number);
        }
    }
}