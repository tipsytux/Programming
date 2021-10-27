package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SumBetweenPandQ {

    public static int sumBetweenPthToQthSmallestElement(int[] arr, int p, int q) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = p; i < q - 1; i++)
            result += arr[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(sumBetweenPthToQthSmallestElement(arr, p, q));
    }
}
