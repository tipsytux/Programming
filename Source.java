import java.util.*;

class Source {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0]=5;
        array[1]= 8;
        array[2]=4;
        array[3]=4;
        array[4]=7;
        array[5]=6;
        array[6]=2;
        array[7]=6;
        array[8]= 7;
        array[9]=3;
        method(array);
    }
    public static void method(int[]  array ){
        int count = 0,n = array.length;

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < n; i++)
            hashSet.add(array[i]);

        int currentElement = array[0];

        while (hashSet.contains(currentElement) == true) {

            count++;

            currentElement--;
        }

        System.out.println(count);
    }
}