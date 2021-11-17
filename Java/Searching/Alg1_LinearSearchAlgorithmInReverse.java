package Searching;

import java.util.Scanner;

/*
Linear Search Algorithm
Description
Given an array of non-negative integers, write a code to search the position of an element in the array in the reverse order. Do not print anything when the element is not present in the given array.
Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order.

The code should :
Take the size of the array as an input from the user.
The elements of the array as an input from the user.
The key you are searching for, as an input from the user.

Sample Input:
7
6 8 3 5 9 1 2
9
Sample Output:
2
Here the output is 2 because the position of number 9 is 2 from the reverse order as mentioned in the question.
*/
class Alg1_LinearSearchAlgorithmInReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare the array here

        int count = input.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        //write your code here
        int found = 0;
        for (int i = array.length - 1; i >= 0 && found != 1; i--) {
            if (array[i] == key) {
                found = 1;
                System.out.println(array.length - i - 1);
            }
        }

    }
}
