package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
        System.out.println(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here
        if(!stack.isEmpty()){
            Integer temp = stack.pop();
            sort(stack);
            sortedInsert(stack,temp);
        }
    }
    static void sortedInsert(Stack<Integer> stack,Integer value){
        if(stack.isEmpty() || value > stack.peek()){
            stack.push(value);
        }
        else{
            Integer temp = stack.pop();
            sortedInsert(stack,value);
            stack.push(temp);
        }
    }
}
