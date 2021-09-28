package Sorting;

import java.util.Scanner;

/*
Insertion Sort
Description
There is a total of N students in Professor X’s school for mutants. Each student has a first name as well as a last name, maintained separately in two separate database columns. One day, Professor X asks a student named Logan to copy the items of both these columns in two separate arrays and sort them using insertion sort. However, the first names should be in ascending order and the last names in descending order. Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

Input:
      1. The first line will be 'n', the size of the two arrays.
      2. The next 'n' lines are the first name of the students.
      3. The next 'n' lines are the last name of the students.

Output:
       1. The first 'n' lines are first names arranged in ascending order.
       2. The next 'n' lines are the last names arranged in descending order.

HINT: You can use the compareTo() method to compare two strings lexically.

Sample Input-1:
2
logan
jean
gray
wolverine
Sample Output-1:
jean
logan
wolverine
gray

Here 2 represents the size of the arrays for first and last name. Next 2 lines are first names of 2 students "logan" and "jean".
Followed by next 2 inputs of their last names, "gray" and "wolverine".
The output has first 2 lines representing first names arranged in ascending order (lexicographically).
The next two outputs represent last name of the students arranged in descending order (lexicographically).
 */
public class Alg3_InsertionSortOnStringCheck {
    public static void insertSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String v = arr[i];
            int j = i;
            while (j >= 1 && arr[j - 1].compareTo(v) > 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = v;
        }
    }

    public static void insertSortRev(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String v = arr[i];
            int j = i;
            while (j >= 1 && arr[j - 1].compareTo(v) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = v;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] firstName = new String[size];
        String[] lastName = new String[size];
        for (int i = 0; i < size; i++) {
            firstName[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastName[i] = scanner.next().toLowerCase();
        }
        insertSort(firstName);
        insertSortRev(lastName);
        for (String name : firstName) {
            System.out.println(name);
        }
        for (String name : lastName) {
            System.out.println(name);
        }

    }
}
