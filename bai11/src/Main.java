import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {10,-1,-2,-5,6,4,3,100,8,9,-7,1000};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (stack.empty()||array[i]>stack.peek()){
                stack.push(array[i]);
            }
        }
        System.out.println("Max: "+stack.peek());
    }
}