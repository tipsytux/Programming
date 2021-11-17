package Problems;

import java.util.Scanner;

/**
 * Make the Unsorted Array Sorted
 * Description
 * You will be given two arrays of integers, array1 and array2.
 * The array1 will be almost sorted in ascending order with just one element in the wrong position making the array unsorted.
 * You need to find a maximum possible element from the array2 which makes the array1 sorted
 * after replacing the wrongly positioned element of the array1 with this element.
 *
 * Note:
 *
 * The wrongly placed element in the array1 will not be at the 0th index of the array or at the (n-1)th index of the array.
 * If there is no element in array2[] which can make array1[] sorted, then print ‘Not Possible’
 * array1 might contain duplicates. A sorted array can contain duplicates.
 * If array1[i] is less than array1[i-1], then index i is the wrong index.
 *
 * Input Format:
 *
 * The first line will be an integer ‘n1’ representing the size of the array1.
 * The next line will be n1 space separated integers representing the elements of the array1.
 * The next line will be an integer ‘n2’ representing the size of the array2.
 * The next line will be n2 space separated integers representing the elements of the array2.
 *
 * Output Format:
 *
 * Print the maximum possible element from the array2 which makes the array1 sorted after replacing the wrongly positioned element of the array1 with this element from array2.
 *
 * Sample Input 00:
 *
 * 5
 *
 * 2 7 8 6 13
 *
 * 4
 *
 * 15 11 9 5
 *
 *
 *
 * Sample Output 00:
 *
 * 11
 *
 *
 *
 * Explanation 00:
 *
 * Element 6 in array1 can be replaced by element 11 (maximum possible) in array2.
 *
 *
 *
 * Sample Input 01:
 *
 * 5
 *
 * 2 7 8 6 13
 *
 * 4
 *
 * 14 15 16 17
 * Sample Output 01:
 * Not Possible
 * Explanation 01:
 * 6 is the misplaced element in array1 making it unsorted.
 * It is not possible to make array1 sorted from the elements in array2 because all elements in array2 are greater than 13.
 */
public class MakeTheUnsortedArraySorted {
    public static void getMax(int[] array, int min, int max){
        boolean found =false;
        int localMax = min-1;
        for (int number : array){
            if (number >=min && number<=max){
                if (localMax<number) {
                    localMax = number;
                }
                found = true;
            }
        }
        if (found){
            System.out.println(localMax);
        }
        else{
            System.out.println("Not Possible");
        }
    }
    public static int findIncorrectElement(int[] array){
        for(int i =1;i<array.length;i++){
            if(array[i]<array[i-1]){
                return i;
            }
        }
        return -1;
    }
    public static void makeTheUnsortedArraySorted(int[] array1,int[] array2){
        int index = findIncorrectElement(array1);
        if (index == -1 ){
            System.out.println("Not Possible");
        }
        else{
            getMax(array2,array1[index-1],array1[index+1]);
        }

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
        for(int i=0;i<size2;i++){
            array2[i] = scanner.nextInt();
        }
        makeTheUnsortedArraySorted(array1,array2);
    }
}
