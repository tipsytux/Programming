package DataStructures.Stack;
import java.util.*;

import static java.lang.Math.floor;

/**
 * Description
 * You are given a stack with n integers.
 * You need to reverse the last half of the elements i.e. floor(n/2) elements
 * from the bottom of the stack using recursion and print the elements of the stack.
 * Note : Floor function takes input as a real number and it returns the greatest integer less than or equal to the input.
 * Ex. floor(5.4) will give output as 5 and floor(4) will give 4.
 *
 * Example:
 * Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 * Output: [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]
 *
 * Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 * Output: [1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7]
 *
 * Input Format:
 * 12
 * 1 2 3 4 5 6 7 8 9 10 11 12
 *
 * Output format:
 * [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]
 */
public class ReverseElements {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        int size = (int) floor(stack.size()/2);
        Stack<Integer> newStack = new Stack<>();
        int i =1;
        while(i<=size){
            newStack.push(stack.pop());
            i++;
        }
        Stack<Integer> newStack2 = new Stack<>();
        while(!newStack.isEmpty()){
            newStack2.push(newStack.pop());
        }
        while(!newStack2.isEmpty()){
            stack.push(newStack2.pop());
        }
        System.out.println(stack);
    }
}
