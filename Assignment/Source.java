package Assignment;

import java.util.*;

public class Source {

    public static int median(int[] arr1, int[] arr2 , int n){
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        /* Since there are 2n elements, median will
           be average of elements at index n-1 and
           n in the array obtained after merging ar1
           and ar2 */
        for (count = 0; count <= n; count++)
        {
            /* Below is to handle case where all
              elements of ar1[] are smaller than
              smallest(or first) element of ar2[] */
            if (i == n)
            {
                m1 = m2;
                m2 = ar2[0];
                break;
            }

            /* Below is to handle case where all
               elements of ar2[] are smaller than
               smallest(or first) element of ar1[] */
            else if (j == n)
            {
                m1 = m2;
                m2 = ar1[0];
                break;
            }
            /* equals sign because if two
               arrays have some common elements */
            if (ar1[i] <= ar2[j])
            {
                /* Store the prev median */
                m1 = m2;
                m2 = ar1[i];
                i++;
            }
            else
            {
                /* Store the prev median */
                m1 = m2;
                m2 = ar2[j];
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