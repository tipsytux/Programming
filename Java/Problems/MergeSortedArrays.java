package Problems;

import java.util.Scanner;

/**
 * Merge Sorted Arrays
 * Description
 * Write a function that merges two sorted arrays in descending order.
 *
 * Input Format:
 * Size of first sorted array
 * Elements of first sorted array
 * Size of second sorted array
 * Elements of second sorted array
 * Output Format:
 *
 * Print the merged sorted array in descending order
 *
 * Sample Input 1:
 * 3
 * 1 2 3
 * 4
 * 4 5 6 7
 * Sample Output 1:
 * 7 6 5 4 3 2 1
 *
 * Explanation 1:
 *
 * So the first input, 3, corresponds to the size of the first sorted array. The next 3 inputs i.e. 1,2 and 3 are the elements inside the first sorted array.
 *
 * Similarly the third line represents the size of the second array which in this case is 4 and the next 4 elements i.e. 4,5,6 and 7
 * correspond to the second sorted array.
 *
 *
 *
 * When we merge the two arrays to form a sorted array we get: 1 2 3 4 5 6 7
 *
 * So, the descending ordered array would be: 7 6 5 4 3 2 1
 */
public class MergeSortedArrays {
    public static int[] mergeBothInDescendingOrder(int[] array1, int[] array2, int size1, int size2){
        int[] sortedArray = new int[size1+size2];
        int left = size1-1;
        int right = size2-1;
        int i = 0;
        while (left >= 0 && right >=0){
            if (array1[left] > array2[right]){
                sortedArray[i] = array1[left];
                left--;
                i++;
            }
            else{
                sortedArray[i] = array2[right];
                right--;
                i++;
            }
        }
        while(left >=0){
            sortedArray[i] = array1[left];
            left--;
            i++;
        }
        while(right>=0){
            sortedArray[i] = array2[right];
            right--;
            i++;
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for(int i=0;i<size1;i++){
            array1[i] = scanner.nextInt();
        }
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for(int i=0;i<size2;i++) {
            array2[i] = scanner.nextInt();
        }
        int[] sortedArray = mergeBothInDescendingOrder(array1,array2,size1,size2);
        for (int number : sortedArray){
            System.out.println(number);
        }
    }
}
