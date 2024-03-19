import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra");
        Stack<Character> stack = new Stack<>();
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        System.out.println(stack);
        char max ;
        boolean flag = true;
        for (int i = 1; i < stack.size(); i++) {
            max = stack.get(i-1);
            for (int j = i+1; j < stack.size(); j++) {
                if (stack.get(i)>max){
                    flag=false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("Chuoi la chuoi giam dan");
        }
        else {
            System.out.println("Chuoi ko la chuoi giam dan");

        }
    }
}