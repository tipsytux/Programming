package Assignment;

import java.util.*;

public class Source {

    public static int median(int[] arr1, int[] arr2 , int n){
        int retval=-1;
        // Write code here
        int i = 0;
        int j = 0;
        while(i<n && j<n){
            
        }
        return retval;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2, n));
    }
}