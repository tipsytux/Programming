package Assignment;

import java.util.*;

public class Source {

    public static int median(int[] arr1, int[] arr2 , int n){
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++)
        {
            if (i == n)
            {
                m1 = m2;
                m2 = arr2[0];
                break;
            }
            else if (j == n)
            {
                m1 = m2;
                m2 = arr1[0];
                break;
            }
            if (arr1[i] <= arr2[j])
            {
                m1 = m2;
                m2 = arr1[i];
                i++;
            }
            else
            {
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }
        return (m1 + m2)/2;
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