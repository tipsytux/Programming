package Assignment;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

class SortNearlySortedArray {
    private static void sortArray(int[] arr, int n, int k)
    {
        PriorityQueue<Integer> priorityQueue
                = new PriorityQueue<>();
        for (int i = 0; i < k + 1; i++) {
            priorityQueue.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }
        Iterator<Integer> itr = priorityQueue.iterator();
        while (itr.hasNext()) {
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr, n,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
