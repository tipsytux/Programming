import java.util.*;

class Source {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        //array to store the input elements
        int[] array = new int[n];
        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        // Write your code here
        TreeSet hashSet = new TreeSet();
        for (int a : array){
            hashSet.add(a);
        }
        for (Object a : hashSet){
            System.out.println(a);
        }

    }
}