package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Stack_PrintFifthElementFromStart {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> newStack = new Stack<>();
        while(!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        printFifthElementFromEnd(newStack);
    }
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        int count = 0;
        int value=0;
        while (!stack.isEmpty() && count<5){
            value = stack.pop();
//                System.out.println(value + " " + count);
            count++;
        }
        if (count==5){
            System.out.println(value);
        }
        else{
            System.out.println("There are not enough elements in the stack");
        }
    }
}
