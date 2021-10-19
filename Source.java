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

        int size = 0;
        int temp=0;
        int current=0;
        for (Object a : hashSet){
            current = Integer.parseInt(a.toString());
            if(size==0){
                size = 1;
            }
            else{
                size = size + current - temp;
            }
            temp = current;
        }
        if(size == hashSet.size() && n!=0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}