import java.util.*;

import java.util.*;
import java.util.Scanner;

class Test {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i:arr)
        {
            if(boardingPass.containsKey(i)){
                System.out.println(boardingPass.get(i));
            }
            else{
                boardingPass.put(i,Integer.toString(i));
            }
        }
    }
}