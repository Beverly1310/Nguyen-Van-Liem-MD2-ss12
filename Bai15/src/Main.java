import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao can chuyen doi");
        Integer input = Integer.parseInt(scanner.nextLine());
        while (input>0){
            stack.push(input%2);
            input/=2;
        }
        System.out.println("So sau chuyen doi la: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }
    }
}