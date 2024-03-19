import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        Stack<Character> stack =new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        String input = scanner.nextLine().toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }
        boolean check = false;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek()!=queue.element()) {
                check=true;
                break;
            }
        }
        if (check) {
            System.out.println("Khong phai chuoi Palindrome");
        }
        else {
            System.out.println("La chuoi Palindrome");
        }
    }
}