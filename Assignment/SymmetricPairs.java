package Assignment;

import java.util.*;

public class SymmetricPairs {

    public static void symmetricPair(int[][] arr) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            int first = arr[i][0];
            int sec   = arr[i][1];
            Integer val = hM.get(sec);
            if (val != null && val == first)
                System.out.println(sec + " " + first );
            else
                hM.put(first, sec);
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }
}