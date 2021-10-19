import java.util.Arrays;
import java.util.Scanner;

class Source
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        // number of the elements
        int n = in.nextInt();
        int array[] = new int[n];
        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }
        // getting the target sum from input
        int targetSum = in.nextInt();
        //write your code here
        Arrays.sort(array);
        boolean found = false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==targetSum){
                    found = true;
                }
            }
        }
        System.out.println(found);

    }
}
