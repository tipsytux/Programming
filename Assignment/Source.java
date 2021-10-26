package Assignment;

// Java program for the above approach
import java.util.*;

class Source {
    static PriorityQueue<Integer> minPriorityQueue;
    static int k;

    static List<Integer> getAllKthNumber(int arr[])
    {
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (minPriorityQueue.size() < k)
                minPriorityQueue.add(val);
            else {
                if (val > minPriorityQueue.peek()) {
                    minPriorityQueue.poll();
                    minPriorityQueue.add(val);
                }
            }
            if (minPriorityQueue.size() >= k)
                list.add(minPriorityQueue.peek());
            else
                list.add(-1);
        }
        return list;
    }
    public static void main(String[] args)
    {
        minPriorityQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        k = scanner.nextInt();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        List<Integer> res = getAllKthNumber(arr);
        for (int x : res)
            if(x==-1){
                System.out.println("None");
            }
        else{
                System.out.println(k + " largest number is "+ x);
            }
    }
}
