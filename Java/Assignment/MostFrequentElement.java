package Assignment;

import java.util.*;

public class MostFrequentElement {

    public static int mostFrequentElement(int[] arr) {
        int retval = -1;
        int count=0;
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        for(int a : arr){
            if(countMap.containsKey(a)){
                countMap.put(a,countMap.get(a)+1);
            }else{
                countMap.put(a,1);
            }
        }
        for(int a : countMap.keySet()){
            int val = countMap.get(a);
            if(val > count){
                count=val;
                retval=a;
            }
        }
        // Write code here
        return retval;
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