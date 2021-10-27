package Assignment;
import java.util.*;

public class Source {
    static int pivotedBinarySearch(int arr[], int n, int key)
    {
        int pivot = findPivot(arr, 0, n - 1);
        if (pivot == -1)
            return search(arr, 0, n - 1, key);
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return search(arr, 0, pivot - 1, key);
        return search(arr, pivot + 1, n - 1, key);
    }
    static int findPivot(int arr[], int low, int high)
    {
        if (high < low)
            return -1;
        if (high == low)
            return low;
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }
    public static int search(int arr[], int left, int right, int key) {
        // Write code here
        if (right < left)
            return -1;

        /* low + (high - low)/2; */
        int mid = (left + right) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return search(arr, (mid + 1), right, key);
        return search(arr, left, (mid - 1), key);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i = pivotedBinarySearch(arr,n, key);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }
    }
}