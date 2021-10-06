import java.util.*;

public class Test {

    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        String inputString=in.nextLine();
        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}