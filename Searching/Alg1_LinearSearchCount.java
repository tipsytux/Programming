package Searching;

import java.util.Scanner;

/**
 * Number of Unsuccessful Attempts
 * Description
 * Write a code that returns the number of unsuccessful attempts made to search for an element in the array using linear search.
 * The code should
 * Take the size of the array as an input from the user
 * The elements of the array as an input from the user
 * The key you are searching for as an input from the user
 * Sample Input-1:
 * 5
 * 2 3 4 5 8
 * 8
 * <p>
 * Sample Output-1:
 * 4
 * So in this sample test case, the first input is the size of the array i.e the array has 5 elements. Next 5 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take 4 unsuccessful steps (comparing elements 2, 3, 4 and 5 with 8) for the code to reach 8, so the output is 4.
 * <p>
 * Sample Input-2:
 * 20
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
 * 21
 * <p>
 * Sample Output-2:
 * 20
 * So in this sample test case, the first input is the size of the array i.e the array has 20 elements. Next 20 inputs are the elements inside the array. The last input i.e. 8 is the key the code should search for. Since in this case, it will take  20 unsuccessful steps (comparing 1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19, 20 with 21) for the code to reach the conclusion that 21 does not exist in the array. Thus the output will be 20.
 */
class Alg1_LinearSearchCount {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int count = 0;
        for (int num : inputArr) {
            if (num == key) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Alg1_LinearSearchCount bs = new Alg1_LinearSearchCount();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getLinearSearchUnsuccessfulComparisonCount(array, key));

    }
}
