package DataStructures.SetsAndDictionaries;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Find Symmetric Pairs
 * Description
 * Suppose you are given an array of pairs, and you have to print all the symmetric pairs.
 * Pair (a, b) and pair (c, d) are called symmetric pairs if a is equal to d and b is equal to c.
 * Input: The input will be in the following format:
 * The first line will be ‘n’, indicating the size of the input array, i.e., the number of pairs in the array.
 * The next ‘n’ lines indicate the ‘n’ pairs.
 * Each line will be includes two space-separated integers, indicating the first and the second element of the pair.
 * Output: The output should be in the following format:
 * Print all the first pairs of the symmetric pairs, each in a new line.
 * Every line should be two space-separated integers, indicating a symmetric pair.
 * Note:
 * If a pair is symmetric, then print the pair that appears first in the array.
 * If there are no symmetric pairs, then print ‘No Symmetric pair’.
 * If the array is empty, then consider that there are no symmetric pairs in the array.
 * Sample input-1:
 * 4
 * 1 2
 * 3 4
 * 2 1
 * 4 3
 * Sample output-1:
 * 1 2
 * 3 4
 * Here, in sample input, the first line of input is 'n', which represents the number of pairs that the user will enter.
 * The next line in the input includes two space-separated integers, indicating a symmetric pair.
 * The output contains the first pair of the symmetric pairs, as 1 2 and 2 1 are symmetric pairs,
 * but 1 2 appears first in the input; thus, it will be in output.
 * Sample input-1:
 * 3
 * 1 2
 * 2 3
 * 3 4
 * Sample output-1:
 * No Symmetric pair
 * Here in the sample input, the first line of input is 'n', which represents the number of pairs that the user will enter. The next line in the input includes two space-separated integers, indicating a symmetric pair. As the input does not have any symmetric pairs, 'No Symmetric pair' is printed.
 */
public class SymmetricPairs {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        // Write your code here
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Integer firstOne;
        Integer secondOne;
        for(int i=0;i<arr.length;i++){
            firstOne = arr[i][0];
            secondOne = arr[i][1];
            if (hashMap.containsKey(secondOne)){
                if(hashMap.get(secondOne)==firstOne){
                    System.out.println(firstOne + "," + secondOne);
                }
            }
        }

    }


}
