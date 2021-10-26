package Assignment;

import java.util.*;

public class MostFrequentElement {

    public static int mostFrequentElement(int[] arr) {

        // Write code here
        return -1;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }
}