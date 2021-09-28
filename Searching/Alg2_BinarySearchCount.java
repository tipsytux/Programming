package Searching;

import java.util.Scanner;

/*
Number of Unsuccessful Attempts
        Description
        Write a code that returns the number of unsuccessful attempts made to search for an element in the array using Binary search.
        The code should
        Take the size of the array as an input from the user
        The elements of the array as an input from the user
        The key you are searching for as an input from the user
        Sample Input:
        5
        2 3 4 5 8
        8

        Sample Output:
        2
        So in this sample test case, the first input is the size of the array i.e the array has 5 elements. Next 5 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take 2 unsuccessful steps for the code to reach 8, so the output is 2.

        Hint: To calculate the middle index use the recommended formula instead of using the formula used in pseudocode.
 */
public class Alg2_BinarySearchCount {
    public static int search(int[] arr, int left, int right, int num, int count) {

        //Base condition
        if (left > right) {
            return count;
        }

        int mid = left + (right - left) / 2; // (left+right)/2

        if (arr[mid] == num) {
            //Element was found, no changes.
            return count;
        } else if (arr[mid] > num) {
            return search(arr, left, mid - 1, num, count + 1);
        } else {
            return search(arr, mid + 1, right, num, count + 1);
        }

    }

    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        return search(inputArr, 0, inputArr.length - 1, key, 0);
    }

    public static void main(String[] args) {
        Alg2_BinarySearchCount bs = new Alg2_BinarySearchCount();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
