package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Contains {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        while(!sequence1.isEmpty()){
            Integer num1 = sequence1.pop();
            boolean found = false;
            while(!sequence2.isEmpty() && !found){
                Integer num2 = sequence2.pop();
                if (num1 == num2){
                    found = true;
                }
            }
            if(sequence2.isEmpty() && !found){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}