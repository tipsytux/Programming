package Sorting;
import java.util.Scanner;
/**
 * Quick Sort
 * Description
 * Write a program in Java that takes an array of strings as input and returns the sorted array. Assume that the sorting needs to be done based on the size of each string. So, a string with fewer characters should come before another string with more number of characters. Use the quicksort algorithm for the program.
 *
 * Sample Input - 1:
 * 7
 * Christene
 * Tomas
 * Marline
 * Marcelluss
 * Michelle
 * Quiana
 * Keny
 *
 * Sample Output - 1:
 * Keny
 * Tomas
 * Quiana
 * Marline
 * Michelle
 * Christene
 * Marcelluss
 *
 * So, the first input is the number of elements in the array. In this case, the number of elements is 7. Next 7 inputs are the elements inside the array. As you can see in the output, the names are sorted as per their length. The name with fewer characters comes before the names with more characters.
 *
 * Sample Input - 1:
 * 3
 * Cat
 * Tree
 * Bag
 *
 * Sample Output - 2:
 * Cat
 * Bag
 * Tree
 *
 * So, the first input is the number of elements in the array. In this case, the number of elements is 3. Next 3 inputs are the elements inside the array. As you can see in the output, the names are sorted as per their length.
 *
 * Please note that Quick Sort is an unstable sorting algorithm. So, the words with same number of characters may come in a different sequence for different people depending upon the factors outside our control.
 */
public class Alg4_QuickSortOnNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] names = new String[size];
        for (int i=0;i<size;i++){
            names[i] = scanner.next();
        }
        quickSort(names, 0, size - 1);
        printArray(names);
    }

    public static void quickSort(String[] ar, int start, int end) {
        if (start < end) {
            int p = partition(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }

    public static int partition(String [] ar, int start, int end) {
        int pivot = ar[end].length();
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() <= pivot) {
                String  temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String  temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;
        return i;
    }

    static void printArray(String arr[])
    {
        for (String name : arr){
            System.out.println(name);
        }
    }
}
