import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String input = scanner.nextLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='{'||input.charAt(i)=='['||input.charAt(i)=='(') {
                stack1.push(input.charAt(i));
            }
        }
        for (int i = input.length()-1; i >=0; i--) {
            if (input.charAt(i)=='}'||input.charAt(i)==']'||input.charAt(i)==')') {
                stack2.push(input.charAt(i));
            }
        }
        for (int i = 0; i < stack2.size(); i++) {
            switch (stack2.get(i)) {
                case '}':
                    stack2.set(i,'{');
                    break;

                case ']':
                    stack2.set(i,'[');
                    break;

                case ')':
                    stack2.set(i,'(');
                    break;
                default:
                    break;
            }
        }
        System.out.println(stack1);
        System.out.println(stack2);
        int flag = 1;
        if (stack1.size()==stack2.size()){
            for (int i = 0; i < stack1.size(); i++) {
                if (stack1.get(i)!=stack2.get(i)){
                    flag=2;
                    break;
                }
            }
        }
        else {
            System.out.println("Chuoi tren khong co ngoac dong");
            flag=3;
        }
        if (flag==2){
            System.out.println("Chuoi tren khong co ngoac dong");
        }
        else if (flag==1){
            System.out.println("Chuoi tren co ngoac dong");
        }
    }
}

