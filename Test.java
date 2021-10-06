import java.util.*;

public class Test {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromStart(queue);
    }

    // Method to print the fifth element from the head of the queue
    static void printFifthElementFromStart(Queue<Integer> queue) {
        // Write your code here
        int size = queue.size();
        int num=0;
        if(size<5){
            System.out.println("There are not enough elements in the queue");
        }
        else{
            int i =1;
            while(i<=size-5){
               num = queue.remove();
               i++;
            }
            System.out.println(num);
        }
    }
}